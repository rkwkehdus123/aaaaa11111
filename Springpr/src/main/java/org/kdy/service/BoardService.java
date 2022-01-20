package org.kdy.service;

import java.util.ArrayList;

import org.kdy.domain.AttachFileDTO;
import org.kdy.domain.BoardDTO;
import org.kdy.domain.Criteria;

public interface BoardService {
    // 게시판 글쓰기
    public void write(BoardDTO board); //인터페이스는 중괄호없는 추상메소드를 사용할 수 있다. 
    // 게시판 목록 리스트
    public ArrayList<BoardDTO> list(Criteria cri);
    // 게시판 목록리스트에서 제목을 클릭했을때 내용이 나오는 상세페이지
    public BoardDTO detail(BoardDTO board);
    // 게시판 수정페이지
    public void modify(BoardDTO board);
    // 게시판 삭제페이지
    public void remove(BoardDTO board);
    // 게시판 페이징에 쓰일 데이터 건수
    public int getTotalCount(Criteria cri);
    // 게시판 상세페이지에 파일업로드된 이미지 출력
    public ArrayList<AttachFileDTO>fileList(int bno);
}
