package org.kdy.service;

import java.util.ArrayList;

import org.kdy.domain.Board2DTO;
import org.kdy.mapper.Board2Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Board2Serviceimpl implements Board2Service{
    @Autowired
    private Board2Mapper b2Mapper;

    public ArrayList<Board2DTO> list2(){
        return b2Mapper.list2();
    }// 게시판 리스트 설계된것을 구현

    public void write2(Board2DTO board2) {
        b2Mapper.write2(board2);
    }
    
    public Board2DTO detail2(Board2DTO board2) {
        return b2Mapper.detail2(board2);
    }

    public void modify2(Board2DTO board2) {
        b2Mapper.modify2(board2);
    }
}
