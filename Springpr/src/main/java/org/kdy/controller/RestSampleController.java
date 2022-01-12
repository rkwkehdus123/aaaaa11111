package org.kdy.controller;

import org.kdy.domain.RestSampleDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //1. 컨트롤러에서 호출하는 경우 데이터 자체로 처리(비동기식)
                     //정상적으로 혹은 비정상적으로 처리 되었는지 결과는 ResponseEntity타입을 통해 알 수 있음
                     //1. get(select)-ex)댓글 조회 | 2. post(insert)-ex)댓글 쓰기 | 3. put(update)-ex)댓글 수정 | 4. delete(delete)-ex)댓글 삭제 
                //2. 일반적인 컨트롤러 - 컨트롤러에서 호출하는 경우 화면으로 처리(동기식) 
                     //결과를 화면을 통해 알 수 있음
                     //get,post
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
    //ResponseEntity타입변환
    @GetMapping(value = "check")
    public ResponseEntity<RestSampleDTO>check(int mno,String firstName, String lastName) {
        //  사용자로부터 메니저번호(mno)를 받아서,
        RestSampleDTO rsdto = new RestSampleDTO(mno, firstName, lastName);
        ResponseEntity<RestSampleDTO> result=null;

        if(mno<150) {//메니저번호가 150 미만이면
            //비정상적으로 처리(ResponseEntity) - status가 502 : BAD GATEWAY
            result=ResponseEntity.status(HttpStatus.BAD_GATEWAY).body(rsdto);
        }else{// 그렇지 않으면
            // 정상적으로 처리 - status가 200 : OK
            result=ResponseEntity.status(HttpStatus.OK).body(rsdto);
        }
        return result;
    }
    //메소드의 매개변수
    //객체타입을 매개변수로 지정해야 되는 경우에는 @RequestBody를 사용해야 됨.
    @PostMapping("mno")
    public RestSampleDTO mno(RestSampleDTO rsdto) {

        return rsdto;
    }
    
    
}