package org.kdy.controller;

import org.kdy.domain.RestSampleDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //컨트롤러에서 호출하는 경우 데이터 자체로 처리(비동기식)
//일반적인 컨트롤러 - 컨트롤러에서 호출하는 경우 화면으로 처리(동기식)
@RequestMapping("sample")
public class RestSampleController {
    //단순 문자열 반환
    @GetMapping(value = "getText", produces = "text/html; charset=UTF-8")
    public String getText() {
        return "안녕하세요.";
    }
    //객체 반환
    @GetMapping(value = "getSample", produces = {MediaType.APPLICATION_JSON_UTF8_VALUE,MediaType.APPLICATION_XML_VALUE})
    public RestSampleDTO getSample() {
        // RestSampleDTO rs = new RestSampleDTO(100,"정","자바");
        // return rs; 를 줄이면 아랫줄
        return new RestSampleDTO(100,"정","자바");
        
    }
}
