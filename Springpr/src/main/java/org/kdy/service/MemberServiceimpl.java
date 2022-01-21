package org.kdy.service;

import org.kdy.domain.MemberDTO;
import org.kdy.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceimpl implements MemberService{
    @Autowired
    private MemberMapper mmapper;
    
    public void insert(MemberDTO mdto){
        mmapper.insert(mdto);
    }
    //로그인 설계된것을 구현
    public MemberDTO login(MemberDTO mdto) {
        return mmapper.login(mdto);
    }
}
