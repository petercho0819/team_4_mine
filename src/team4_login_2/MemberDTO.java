package team4_login_2;

import java.io.Serializable;

public class MemberDTO implements Serializable{
	
	
	/**
	 * 
	 */
	
	private static final long serialVersionUID = -5116721534172735833L;
	// 회원가입에 필요한 변수들
	String id;	// 아이디
	String pwd;	//비번
	String pwdDoubleCheck; //비번 중복확인
	
	
	public void MemberDTO() {
		
	}
	public MemberDTO() {
		
	}
	public MemberDTO(String id, String pwd, String pwdDoubleCheck) {
		this.id = id;
		this.pwd = pwd;
		this.pwdDoubleCheck = pwdDoubleCheck;
	}
	@Override
	public String toString() {
		return "MemberDTO [id=" + id + ", pwd=" + pwd + ", pwdDoubleCheck=" + pwdDoubleCheck + "]";
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
