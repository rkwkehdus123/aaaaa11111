package org.kdy.controller;

import org.kdy.domain.ReplyDTO;
import org.kdy.service.ReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("replies")
public class ReplyController {
    @Autowired
    private ReplyService rservice;
    //댓글쓰기를 하기 위한 RequestMapping
    //Mapping을 할때 우리가 원하는 데이터 타입을 강제함으로써 오류상황을 줄일 수 있다.
    //consumes : 들어오는 데이터 타입 정의(생략가능)
    //produces : 변환하는 데이터 타입 정의(생략가능)
    // * 생략을 하게 되면, 웹브라우저가 알아서 타입을 판단 *
    @PostMapping(value="new",consumes="application/json",produces={MediaType.TEXT_PLAIN_VALUE})
    public ResponseEntity<String> create(@RequestBody ReplyDTO rdto){ //requestBody : js의 reply를 받을 수 있도록 도와줌
        System.out.println("rdto="+rdto);
        rservice.write(rdto);
        return null;
    }
}
