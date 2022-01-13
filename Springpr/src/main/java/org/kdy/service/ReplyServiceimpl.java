package org.kdy.service;

import java.util.ArrayList;

import org.kdy.domain.ReplyDTO;
import org.kdy.mapper.ReplyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ReplyServiceimpl implements ReplyService{
	@Autowired
	private ReplyMapper rmapper;
    public int write(ReplyDTO rdto) {
		//댓글쓰기 설계
		//insert성공시 ReplyMapper.java로 부터 1
		//insert성공시 ReplyMapper.java로 부터 0
		//값을 리턴받는다
		return rmapper.write(rdto);
    }
	//댓글목록 리스트 설계된것을 구현
	public ArrayList<ReplyDTO> list(int bno) {
		return rmapper.list(bno);
	}
	
	public ReplyDTO detail(int rno) {
		return rmapper.detail(rno);
	}
}
