package org.kdy.domain;

public class ReplyDTO {
    //댓글번호
    private int rno;
    //게시판번호
    private int bno;
    //댓글내용
    private String reply;
    //댓글작성자
    private String replyer;
    //댓글작성일자
    private String replydate;

    public int getRno() {
        return this.rno;
    }

    public void setRno(int rno) {
        this.rno = rno;
    }

    public int getBno() {
        return this.bno;
    }

    public void setBno(int bno) {
        this.bno = bno;
    }

    public String getReply() {
        return this.reply;
    }

    public void setReply(String reply) {
        this.reply = reply;
    }

    public String getReplyer() {
        return this.replyer;
    }

    public void setReplyer(String replyer) {
        this.replyer = replyer;
    }

    public String getReplydate() {
        return this.replydate;
    }

    public void setReplydate(String replydate) {
        this.replydate = replydate;
    }
    @Override
	public String toString() {
		return "ReplyDTO [rno=" + rno + ", bno=" + bno + ", reply=" + reply + ", replyer=" + replyer + ", replydate="
				+ replydate + "]";
	}
}
