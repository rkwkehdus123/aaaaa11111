package org.kdy.domain;

import java.util.ArrayList;

public class BoardDTO {
    private int bno; // 외부에서 값을 함부러 바꾸지 못하게 private를 붙여씀
    private String title;
    private String content;
    private String writer;
    private String regdate; // 데이트타임이 없어서 그냥 스트링을 씀
    private int cnt;
    private int good;

    private ArrayList<AttachFileDTO> AttachList;

    public ArrayList<AttachFileDTO> getAttachList() {
        return this.AttachList;
    }

    public void setAttachList(ArrayList<AttachFileDTO> AttachList) {
        this.AttachList = AttachList;
    }

    public int getBno() {
        return this.bno;
    }

    public void setBno(int bno) {
        this.bno = bno;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getWriter() {
        return this.writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getRegdate() {
        return this.regdate;
    }

    public void setRegdate(String regdate) {
        this.regdate = regdate;
    }

    public int getCnt() {
        return this.cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    public int getGood() {
        return this.good;
    }

    public void setGood(int good) {
        this.good = good;
    }

	@Override
	public String toString() {
		return "BoardDTO [bno=" + bno + ", title=" + title + ", content=" + content + ", writer=" + writer
				+ ", regdate=" + regdate + ", cnt=" + cnt + ", good=" + good + ", AttachList=" + AttachList + "]";
	}
    

}
