package org.kdy.service;

import java.util.ArrayList;

import org.kdy.domain.Board2DTO;

public interface Board2Service {
    public ArrayList<Board2DTO> list2();//게시판 리스트

    public void write2(Board2DTO board2);
    
    public Board2DTO detail2(Board2DTO board2);

    public void modify2(Board2DTO board2);
}
