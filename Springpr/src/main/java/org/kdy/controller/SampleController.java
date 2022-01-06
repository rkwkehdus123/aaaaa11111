package org.kdy.controller;

import org.kdy.domain.SampleMemberDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
// @RequestMapping("sample") 이 방법을 쓰면 아래 벨류에 일일이 샘플을 써넣을 필요가 없음
public class SampleController {
	private static final Logger logger = LoggerFactory.getLogger(SampleController.class);
	
//	@RequestMapping(value = "sample", method = RequestMethod.GET)
	@GetMapping("sample") // 위와 아래는 같은것 아래는 축약형
	public void basic(Model model) {
		logger.info("sample 실행됨.");
		
		model.addAttribute("abcd", "aaaa");
		// aaaa문자열을 abcd변수로 저장하여 sample.jsp에 보내기
		
		// return이 없음 -> 이 경우에는 value의 문자열을 보내도록 설정되어 있음! (default)
	}

	//	@RequestMapping(value = "sample/ex01", method = RequestMethod.GET)
	@GetMapping("sample/ex01") // 위와 아래는 같은것 아래는 축약형
	public String basic1(Model model) {
		
		model.addAttribute("zzzz", "bbbb");
		logger.info("sample/ex01 실행됨.");
		// return이 없음 -> 이 경우에는 value의 문자열을 보내도록 설정되어 있음! (default)
		return "ex01";
	}

	//	@RequestMapping(value = "sample/index", method = RequestMethod.GET)
	@GetMapping("sample/index") // 위와 아래는 같은것 아래는 축약형
	public String index(Model model) {
		model.addAttribute("yyyy", "cccc");
		return "index";
	}//화면을 표시하는 메소드

	//	@RequestMapping(value = "sample/member", method = RequestMethod.GET)
	@GetMapping("sample/member") // 위와 아래는 같은것 아래는 축약형
	public String member(String id,String pw,String name,Model model) {
		System.out.println("id="+id);
		System.out.println("pw="+pw);
		System.out.println("name="+name);
		model.addAttribute("id", id);
		model.addAttribute("pw", pw);
		model.addAttribute("name", name);
		// id값을 id변수로 저장하여 index.jsp로 보내기
		// pw값을 pw변수에 저장하여 index.jsp로 보내기
		// name값을 name변수에 저장하여 index.jsp로 보내기
		return "member"; 
	}//로그인 값을 넘기는 메소드

	//	@RequestMapping(value = "sample/memberDTO", method = RequestMethod.POST)
	@PostMapping("sample/memberDTO") // 위와 아래는 같은것 아래는 축약형
	public String memberdto(SampleMemberDTO smd,Model model) {
		System.out.println("id="+smd.getId());
		System.out.println("pw="+smd.getPw());
		System.out.println("name="+smd.getName());
		
		model.addAttribute("id", smd);
		
		return "memberDTO";
		//return "redirect:/"; //홈컨트롤러로 넘기기위한 슬러시, 같은 컨트롤러도 가능, 벨류값만 맞춰주면 됨
	}//로그인 값을 넘기는 메소드
	//위에 있는게 틀린건 아니지만 메모리 효율성,보안을 따졌을땐 밑에 있는게 더 낫다
	
	//######## 지금 위 스트링을 사용하는 메소드에서 보이드로 바꾸고 리턴을 지우면 작동하지 않는 이유는
	//			앞에 sample/가 붙어있기 때문.
	//			즉 sample/가 앞에 붙어있어서 형식상 sample폴더 안의 memberDTO라는 뜻이 되고
	//			리턴이 먹히는 이유는 리턴 내용에 sample/가 없기때문에 views안에 있는 memberDTO에 바로 연결되기 때문
}
