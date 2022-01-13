package org.kdy.controller;


import org.kdy.domain.BoardDTO;
import org.kdy.domain.Criteria;
import org.kdy.domain.PageDTO;
import org.kdy.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("board")
public class BoradController {
	@Autowired
	// private BoardService service = new BoardService(); 아래와 같은 뜻
	private BoardService service;
	//글쓰기 화면으로
	@GetMapping("write")
	public void write() {
		System.out.println("board/write");
	}
	// 글쓰기 버튼을 클릭하면
	@PostMapping("write") //똑같은 이름이라도 한쪽은 겟이고 한쪽은 포스트이기 때문에 상관없음
	public String writepost(BoardDTO board) {
		service.write(board);
//		System.out.println("write post...."+board);//변수값을 넣는거기 때문에 DTO가 아닌 그냥 보드를 넣음
		
		return "redirect:/board/list";
	}
	//게시판 목록 리스트
	@GetMapping("list")
	public void list(Criteria cri, Model model) {
		System.out.println("board/list");
		System.out.println("list결과는"+service.list(cri));
		model.addAttribute("list", service.list(cri));
		int total=service.getTotalCount(cri);//변수로 저장해서 아래 괄호에 넣기(그냥 넣어도 됨)
		model.addAttribute("pageMaker", new PageDTO(cri,total));
	}
	//게시판 목록 리스트에서 제목을 클릭하면....
	@GetMapping("detail")
	public void detail(BoardDTO board, Model model) {
		model.addAttribute("detail",service.detail(board));
	}
	//글수정 화면으로.....
	@GetMapping("modify")
	public void modify(BoardDTO board, Model model) {
		model.addAttribute("detail",service.detail(board));
		System.out.println("board/modify");
	}
	//글수정 버튼을 클릭하면.....
	@PostMapping("modify") //위는 겟매핑 아래는 포스트매핑이라 이름이 같아도 됨
	public String modifyPost(BoardDTO board,RedirectAttributes rttr) {
		System.out.println(board);
		//update
		service.modify(board);
		rttr.addAttribute("bno", board.getBno());
		return "redirect:/board/detail";
	}
	//글삭제 버튼을 클릭하면....
	@GetMapping("remove")
	public String remove(BoardDTO board) {
		System.out.println(board);
		service.remove(board);
		return "redirect:/board/list";
	}
}
//그 다음 연관된것들(반대로도 가능)
//1. 보드서비스.java - (main/java/kdy/service)
//   ↓
//2. 보드서비스impl.java - (main/java/kdy/service)
//   ↓
//3. 보드맵퍼.java - (main/java/kdy/mapper)
//   ↓
//4. 보드맵퍼.xml - (main/resorces/org/kdy/mapper)
//5. 각 jsp파일
//+보드DTO - (main/java/kdy.domain)
//+크리테리아 - (main/java/kdy.domain)
//+페이지DTO - (main/java/kdy.domain)