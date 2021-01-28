package team4_io;

import java.io.Serializable;

public class MemberDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5134614906936352060L;
	
	private String name;
	private String id;
	private String pwd;
	
	
	public MemberDTO() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	@Override
	public String toString() {
		return "MemberDTO [name=" + name + ", id=" + id + ", pwd=" + pwd + "]";
	}
	public MemberDTO(String name, String id, String pwd) {
		this.name = name;
		this.id = id;
		this.pwd = pwd;
	}

}
