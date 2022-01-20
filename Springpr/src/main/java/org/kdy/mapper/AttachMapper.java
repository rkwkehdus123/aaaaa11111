package org.kdy.mapper;

import java.util.ArrayList;

import org.kdy.domain.AttachFileDTO;


public interface AttachMapper {
	//게시판 글쓰기 할때 파일과 관련되어있는 attach테이블에 insert
	public void insert(AttachFileDTO board);
	//게시판 상세페이지에 업로드된 이미지를 뿌리기 위한 데이터list
	public ArrayList<AttachFileDTO> fileList(int bno);
}
