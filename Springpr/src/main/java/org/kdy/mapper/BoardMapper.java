package org.kdy.mapper;

import java.util.ArrayList;

import org.kdy.domain.BoardDTO;

public interface BoardMapper {
    // 게시판 글쓰기와 관련이 되어 있는 DB작업에 설계
    public void write(BoardDTO board);
    // 게시판 목록리스트와 관련이 되어 있는 db작업에 설계
    public ArrayList<BoardDTO> list();//동적배열(필요한만큼 늘리고 줄이는 배열)
    // 게시판 목록리스트에서 제목을 클릭했을 때 내용이 나오는 상세페이지와 관련
    public BoardDTO detail(BoardDTO board);
}
