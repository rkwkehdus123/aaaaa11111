package org.kdy.mapper;

import java.util.ArrayList;

import org.kdy.domain.Board2DTO;

public interface Board2Mapper {
    // 게시판 목록리스트와 관련이 되어 있는 db작업에 설계
    public ArrayList<Board2DTO> list2();

    public void write2(Board2DTO board2);
    
    public Board2DTO detail2(Board2DTO board2);
    
    public void modify2(Board2DTO board2);
    
    public void remove2(Board2DTO board2);
}
