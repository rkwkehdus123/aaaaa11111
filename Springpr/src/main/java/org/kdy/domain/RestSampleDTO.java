package org.kdy.domain;

public class RestSampleDTO {
    private int mno;
    private String firstName;
    private String lastName;

    public RestSampleDTO(){}
    
    public RestSampleDTO(int mno,String firstName,String lastName) {
        this.mno=mno;
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public int getMno() {
        return this.mno;
    }

    public void setMno(int mno) {
        this.mno = mno;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

	@Override
	public String toString() {
		return "RestSampleDTO [mno=" + mno + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
    
}
