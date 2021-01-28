package team4_login_1;

import java.io.Serializable;

public class MemberDTO implements Serializable{
	
	
	/**
	 * 
	 */
	
	private static final long serialVersionUID = -5116721534172735833L;
	// 회원가입에 필요한 변수들
	private String id;	// 아이디
	private String pwd;	//비번
	private String pwdDoubleCheck; //비번 중복확인
	private String name;	// 이름
	private String year;	//년도
	private String month;	// 월
	private String day;	// 일
	private String email;	//이메일주소
	
	public void MemberDTO() {
		
	}
	public MemberDTO() {
		
	}
	
	public String getInfo() {
		return "회원가입하신 정보는 : [id=" + id + ", pwd=" + pwd +  ", name=" + name
				+ ", year=" + year + ", month=" + month + ", day=" + day + ", email=" + email + "] 입니다.";
	}
	
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
	public String getId() {
		return id;
	}
	public String getPwd() {
		return pwd;
	}
	public String getPwdDoubleCheck() {
		return pwdDoubleCheck;
	}
	public String getName() {
		return name;
	}
	public String getYear() {
		return year;
	}
	public String getMonth() {
		return month;
	}
	public String getDay() {
		return day;
	}
	public String getEmail() {
		return email;
	}
	

}
