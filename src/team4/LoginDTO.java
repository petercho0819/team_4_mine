package team4;

public class LoginDTO {
	
	// 회원가입에 필요한 변수들
	private String id;	// 아이디
	private String pwd;	//비번
	private String pwdDoubleCheck; //비번 중복확인
	private String name;	// 이름
	private int year;	//년도
	private int month;	// 월
	private int day;	// 일
	private String email;	//이메일주소
	
	public void LoginDTO() {
		
	}
	public LoginDTO() {
		
	}
	
	public String getInfo() {
		return "회원가입하신 정보는 : [id=" + id + ", pwd=" + pwd +  ", name=" + name
				+ ", year=" + year + ", month=" + month + ", day=" + day + ", email=" + email + "] 입니다.";
	}
	
	public LoginDTO(String id, String pwd, String pwdDoubleCheck, String name, int year, int month, int day,
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
	public int getYear() {
		return year;
	}
	public int getMonth() {
		return month;
	}
	public int getDay() {
		return day;
	}
	public String getEmail() {
		return email;
	}
	

}
