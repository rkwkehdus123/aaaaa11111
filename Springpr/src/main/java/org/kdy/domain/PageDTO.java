package org.kdy.domain;

public class PageDTO {
	//시작 페이지 번호
    private int startPage;
    //끝 페이지 번호
    private int endPage;
    //이전 페이지 유무
    private boolean prev;
    //다음 페이지 유무
    private boolean next;
    //board테이블의 총 데이터 건수
    private int total;
    //endPage를 계산하기 위한 pageNum가 필요하므로 Criteria클래스를 포함
    private Criteria cri;
    
    public PageDTO(Criteria cri, int total){
        this.cri=cri;
        this.total=total;
    	//(int)(Math.ceil(현재페이지번호/10.0))*10 계산된 결과를 endPage에 저장
    	this.endPage=(int)(Math.ceil(cri.getPageNum()/10))*10;
    	System.out.println();
    	System.out.println();
        //10-9=1, 20-9=11....
    	this.startPage=endPage-9;
        //전체건수를 고려한 endPage->realEnd
        //(int)(Math.ceil((전체건수*1.0)/10));
        int realEnd=(int)(Math.ceil((total*10)/cri.getAmount()));
        //realEnd > endpage => realEnd값을 endPage에 저장
        if (realEnd<endPage) {
            this.endPage=realEnd;
        }
        this.prev=this.startPage>1;
        this.next=this.endPage<realEnd;
    }
    
	@Override
	public String toString() {
		return "pageDTO [startPage=" + startPage + ", endPage=" + endPage + ", prev=" + prev + ", next=" + next
				+ ", total=" + total + ", cri=" + cri + "]";
	}
	public int getStartPage() {
		return startPage;
	}
	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}
	public int getEndPage() {
		return endPage;
	}
	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}
	public boolean isPrev() {
		return prev;
	}
	public void setPrev(boolean prev) {
		this.prev = prev;
	}
	public boolean isNext() {
		return next;
	}
	public void setNext(boolean next) {
		this.next = next;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public Criteria getCri() {
		return cri;
	}
	public void setCri(Criteria cri) {
		this.cri = cri;
	}
    
    

    
    

    
}