package org.kdy.domain;

public class MemberDTO {
    private String id;
    private String password;
    private String name;

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
	public String toString() {
		return "MemberDTO [id=" + id + ", password=" + password + ", name=" + name + "]";
	}
}