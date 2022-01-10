package org.kdy.mapper;

import java.util.ArrayList;

import org.kdy.domain.BoardDTO;
import org.kdy.domain.Criteria;
//여기 있는 추상메소드를 보드맵퍼.xml에 있는 아이디에 연결시키면 됨
public interface BoardMapper {
    // 게시판 글쓰기와 관련이 되어 있는 DB작업에 설계
    public void write(BoardDTO board);
    // 게시판 목록리스트와 관련이 되어 있는 db작업에 설계
    public ArrayList<BoardDTO> list(Criteria cri);//동적배열(필요한만큼 늘리고 줄이는 배열)
    // 게시판 목록리스트에서 제목을 클릭했을 때 내용이 나오는 상세페이지와 관련
    public BoardDTO detail(BoardDTO board);
    // 게시판 목록리스트에서 제목을 클릭했을때 조회수 +1
    public void cntupdate(BoardDTO board);
    // 게시판 글수정과 관련이 되어 있는 DB 작업에 설계
    public void modify(BoardDTO board);
    // 게시판 글삭제와 관련이 되어 있는 DB 작업에 설계
    public void remove(BoardDTO board);
}
