package org.kdy.domain;

public class Board2DTO {
    private int bno;
    private String title;
    private String content;
    private String writer;
    private String regdate;
    private int cnt;
    private int good;

    @Override
    public String toString() {
        return "{" +
            " bno='" + getBno() + "'" +
            ", title='" + getTitle() + "'" +
            ", content='" + getContent() + "'" +
            ", writer='" + getWriter() + "'" +
            ", regdate='" + getRegdate() + "'" +
            ", cnt='" + getCnt() + "'" +
            ", good='" + getGood() + "'" +
            "}";
    }//클래스들은 기본적으로 오브젝트를 상속받는데 
     //그중에 투스트링은 주소를 나타냄 
     //그래서 이렇게 오버라이딩으로 투스트링을 다른걸로 바꿔줘야함

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

}