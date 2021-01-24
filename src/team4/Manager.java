package team4;

import java.util.ArrayList;
import java.util.Scanner;

public class Manager {

	
	Scanner sc = new Scanner(System.in);
	LoginDTO loginDTO = new LoginDTO();		// 로그인DTO생성
	ArrayList<LoginDTO> members = new ArrayList<>();	//회원 로그인 정보를 받음 (1차원 배열)
	

	public void Run() {
	
	while(true) {
		System.out.println("======= 회원가입 페이지 =======");	// 회원페이지
		System.out.println("1. 회원가입");			// 선택 시 회원가입
		System.out.println("2. 로그인");			// 선택 시 로그인
		System.out.println("9. 프로그램 종료");		// 선택 시 프로그램 종료
		System.out.print("번호를 입력하세요 :");
		int no = sc.nextInt();
			
		switch(no) {
		case 1 :		// 회원가입
			register();	// 회원가입 메소드 실행
			break;
		case 2 : 		// 로그인
			login();	// 로그인 메소드 실행
			break;		
		case 9 : System.out.println("프로그램을 종료합니다."); return;
		default : System.out.println("잘못된 번호를 입력하셨습니다.");
		break;
		}
	} //while문 종료
	
	
	} //run 종료

	public void register() {		// 회원가입 메소드
		String pwd = "";
		String pwdDoubleCheck = "";
	
		System.out.println("아이디를 입력하세요 : ");		// 아이디 입력
		String id  = sc.next();
		sc.nextLine();
		
		boolean pwdCheck = true;
		while(pwdCheck) {								// 비밀번호가 일치 할 때까지 반복!!
			System.out.print("비밀번호를 입력하세요 : ");		// 비밀 번호 입력
			pwd = sc.nextLine();
			System.out.print("비밀번호를 한 번 더 입력하세요 : ");	// 비밀 번호 재확인
			pwdDoubleCheck = sc.nextLine();
			
			if (!pwd.equals(pwdDoubleCheck)){					
				System.out.println("비밀번호가 일치하지 않습니다");
				System.out.println("비밀번호를 다시 입력하세요.");
//				break here;
			
			}else {
				System.out.println("입력하신 비밀번호가 일치합니다.");
				break;
			}
		
		}
						
	
		System.out.print("이름을 입력하세요 : ");			// 이름 입력
		String name = sc.nextLine();
		System.out.print("태어난 년도를 입력하세요 : ");	// 태어난 년도 입력
		int year = sc.nextInt();
		System.out.print("태어난 월을 입력하세요 : ");		// 태어난 월 입력
		int month = sc.nextInt();
		System.out.print("태어난 일을 입력하세요 : ");		// 태어난 일 입력
		int day = sc.nextInt();
		System.out.print("이메일을 입력하세요 : ");		// 이메일 입력
		String email = sc.next();
			
			if(pwd.equals(pwdDoubleCheck)) {		// 비밀번호와 비밀번호 확인 입력
				loginDTO = new LoginDTO(id, pwd, pwdDoubleCheck, name, year, month, day, email);	// 비밀번호 일치시 회원가입 정보를 배열로 저장
			members.add(loginDTO);								
			System.out.println(id + "님 회원가입을 축하드립니다.");		// 비밀번호 일치시 회원가입 축하 문구
		}else {		// 비밀번호 불일치시
			System.out.println("비밀번호가 일치 하지 않습니다. 비밀번호를 확인해주세요.");		// 비밀번호 불일치시 문구
			return;
		}
			for(int i = 0 ; i < members.size(); i++) {		// 배열에 저장된 회원정보를 출력
				System.out.println("입력하신 정보는 아래와 같습니다.");
			System.out.println(members.get(i).getInfo());
			}
	}
	


	public void login() {		//로그인 메소드
		System.out.println("아이디를 입력하세요 : ");	// 아이디 입력
		sc.nextLine();
		String id = sc.nextLine();
		System.out.print("비밀번호를 입력하세요 : ");	// 비밀번호 입력
		String pwd = sc.nextLine();
		if(loginDTO.getId() == null) {		// 회원정보에 아이디가 없을시 회원가입을 권유
			System.out.println("회원등록이 되어 있지 않습니다. 회원가입을 먼저해주세요.");
			return;
		}else if(!loginDTO.getId().equals(id)) {	// 회원정보에 가입된 아이디가 없을 시
			System.out.println("등록되지 않은 아이디입니다.");
		}

		if(!loginDTO.getPwd().equals(pwd)) {		// 비밀번호가 불일치시 문구
			System.out.println("비밀번호가 틀렸습니다.");
			
		}else if(loginDTO.getId().equals(id) && loginDTO.getPwd().equals(pwd)){		//회원가입한 아이디와 비밀먼호 일치시 문구
			System.out.println("축하합니다!");
			System.out.println(loginDTO.getName() + "님이 로그인 하였습니다.");
			
		 
		}	
		
	}
	
}


















