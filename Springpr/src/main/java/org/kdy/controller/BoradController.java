package org.kdy.controller;


import org.kdy.domain.BoardDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("board")
public class BoradController {
	@GetMapping("write")
	public void write() {
		System.out.println("board/write");
	}
	@PostMapping("write") //똑같은 이름이라도 한쪽은 겟이고 한쪽은 포스트이기 때문에 상관없음
	public void writepost(BoardDTO board) {
		System.out.println("write post...."+board);//변수값을 넣는거기 때문에 DTO가 아닌 그냥 보드를 넣음
	}
}
