package org.kdy.controller;

import org.kdy.domain.SampleMemberDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SampleController {
	private static final Logger logger = LoggerFactory.getLogger(SampleController.class);
	
	@RequestMapping(value = "sample", method = RequestMethod.GET)
	public void basic() {
		logger.info("sample 실행됨.");
		// return이 없음 -> 이 경우에는 value의 문자열을 보내도록 설정되어 있음! (default)
	}
	@RequestMapping(value = "sample/ex01", method = RequestMethod.GET)
	public String basic1() {
		logger.info("sample/ex01 실행됨.");
		// return이 없음 -> 이 경우에는 value의 문자열을 보내도록 설정되어 있음! (default)
		return "ex01";
	}
	@RequestMapping(value = "sample/index", method = RequestMethod.GET)
	public String index() {
		return "index"; 
	}//화면을 표시하는 메소드
	@RequestMapping(value = "sample/member", method = RequestMethod.GET)
	public void member(String id,String pw,String name) {
		System.out.println("id="+id);
		System.out.println("pw="+pw);
		System.out.println("name="+name);
	}//로그인 값을 넘기는 메소드
	@RequestMapping(value = "sample/memberDTO", method = RequestMethod.GET)
	public void memberdto(SampleMemberDTO smd) { 
		System.out.println("id="+smd.getId());
		System.out.println("pw="+smd.getPw());
		System.out.println("name="+smd.getName());
	}//로그인 값을 넘기는 메소드
	//위에 있는게 틀린건 아니지만 메모리 효율성,보안을 따졌을땐 밑에 있는게 더 낫다
	
	
}
