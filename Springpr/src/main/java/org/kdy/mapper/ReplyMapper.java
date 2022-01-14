package org.kdy.mapper;

import java.util.ArrayList;

import org.kdy.domain.ReplyDTO;

public interface ReplyMapper {
	//댓글쓰기 설계
	//insert성공시 ReplyMapper.java로 부터 1
	//insert성공시 ReplyMapper.java로 부터 0
	//값을 리턴받는다
	public int write(ReplyDTO rdto);

	public ArrayList<ReplyDTO> list(int bno);

	public ReplyDTO detail(int rno);
	//댓글수정 설계
	//update성공시 ReplyMapper.java로 부터 1
	//update성공시 ReplyMapper.java로 부터 0
	//값을 리턴받는다
	public int update(ReplyDTO rdto);
	//댓글삭제 설계
	//update성공시 ReplyMapper.java로 부터 1
	//update성공시 ReplyMapper.java로 부터 0
	//값을 리턴받는다
    public int remove(ReplyDTO rdto);
}
