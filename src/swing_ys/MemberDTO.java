package swing_ys;

import java.io.Serializable;

public class MemberDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5134614906936352060L;
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	private String id;
	private String pwd;
	private String pwdDoubleCheck;
	private String name;
	private String year;
	private String month;
	private String day;
	private String email;
	
	public MemberDTO() {}	// 기본 생성자

	public MemberDTO(String id, String pwd, String pwdDoubleCheck, String name, String year, String month, String day,
			String email) {
		this.id = id;
		this.pwd = pwd;
		this.pwdDoubleCheck = pwdDoubleCheck;
		this.name = name;
		this.year = year;
		this.month = month;
		this.day = day;
		this.email = email;
	}

	@Override
	public String toString() {
		return "MemberDTO [id=" + id + ", pwd=" + pwd + ", pwdDoubleCheck=" + pwdDoubleCheck + ", name=" + name
				+ ", year=" + year + ", month=" + month + ", day=" + day + ", email=" + email + "]";
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

	public String getPwdDoubleCheck() {
		return pwdDoubleCheck;
	}

	public void setPwdDoubleCheck(String pwdDoubleCheck) {
		this.pwdDoubleCheck = pwdDoubleCheck;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	

}
