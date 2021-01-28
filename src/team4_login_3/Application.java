package team4_login_3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import team4_login_1.MemberDTO;

public class Application {


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Register register = new Register();		// 회원 회원가입 인스턴스
		Login login = new Login();				// 회원 로그인 인스턴스
		ArrayList<MemberDTO> al = new ArrayList<>();

		/* 회원 정보 출력 */
		IO oo = new IO();
		oo.insertMember();

		/* 회원의 정보 입력 */
//		al = new IO().checkMethod();
//
//		for(int j = 0; j < al.size(); j++) {
//
//			if(al.get(j).getId() == null) {
//				System.out.println("회원등록이 되어 있지 않습니다. 회원가입을 먼저해주세요.");
//
//				return;
//			}else if(al.get(j).getId().equals(id2)) {
//				System.out.println("회원중에 일치하는 아이디가 있습니다.");
//			}else {
//				System.out.println("아이디가 일치하는 회원이 없습니다.");
//
//			}




			while(true) {
				System.out.println("======= 회원가입 페이지 =======");	// 회원페이지
				System.out.println("1. 회원가입");			// 선택 시 회원가입
				System.out.println("2. 로그인");			// 선택 시 로그인
				System.out.println("3. 회원조회");			// 선택 시 회원조회
				System.out.println("9. 프로그램 종료");		// 선택 시 프로그램 종료
				System.out.print("번호를 입력하세요 :");
				int no = sc.nextInt();

				switch(no) {
				case 1 :		// 회원가입
					register.register_member();	// 회원가입 메소드 실행
					break;
				case 2 : 		// 로그인
					login.Login_member();	// 로그인 메소드 실행
					break;
				case 3 : 		// 회원정보 조회
					//				search();
					break;
				case 9 : System.out.println("프로그램을 종료합니다.");
				return;
				default : System.out.println("잘못된 번호를 입력하셨습니다.");
				break;

				}
			}
		}
	}



