package org.kdy.controller;


import org.kdy.domain.BoardDTO;
import org.kdy.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
		System.out.println("write post...."+board);//변수값을 넣는거기 때문에 DTO가 아닌 그냥 보드를 넣음
		
		return "redirect:/board/list";
	}
	//게시판 목록 리스트
	@GetMapping("list")
	public void list(Model model) {
		service.list();
		System.out.println("board/list");
		System.out.println("list결과는"+service.list());
		model.addAttribute("list", service.list());
	}
	//게시판 목록 리스트에서 제목을 클릭하면....
	@GetMapping("detail")
	public void detail(BoardDTO board, Model model) {
		model.addAttribute("detail",service.detail(board));
	}
}
//연관된것들
//1. 보드서비스.java - (main/java/kdy/service)
//2. 보드서비스impl.java - (main/java/kdy/service)
//3. 보드맵퍼.java - (main/java/kdy/mapper)
//4. 보드맵퍼.xml - (main/resorces/org/kdy/mapper)
//5. 각 jsp파일
//+보드DTO - (main/java/kdy.domain)