package team4_login_3;

import java.util.ArrayList;
import java.util.Scanner;

import team4_login_3.MemberDTO;

public class Register {
	
	/* 회원가입 */
	public void register_member() {
		
		IO io = new IO();
		MemberDTO memberDTO = new MemberDTO();
		ArrayList<MemberDTO> outputMembers = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디를 입력하세요 : ");	// 아이디 입력
		String id = sc.nextLine();
		String pwd = "";				// 비밀번호
		String pwdDoubleCheck = "";		// 비밀번호 확인

		sc.nextLine();
		
		while(true) {										// 비밀번호 확인 loop 비밀번호 일치시까지 loop

			System.out.println("비밀번호를 입력하세요 : ");		// 비밀 번호 입력
			pwd = sc.nextLine();
			System.out.println("비밀번호를 다시 입력하세요 : ");
			pwdDoubleCheck = sc.nextLine();

			if (!pwd.equals(pwdDoubleCheck)){					
				System.out.println("비밀번호가 일치하지 않습니다");
				System.out.println("비밀번호를 다시 입력하세요.");

			}else {
				System.out.println("입력하신 비밀번호가 일치합니다.");
				break;
			}

		}
		if(pwd.equals(pwdDoubleCheck)) {		// 비밀번호와 비밀번호 확인 입력
			//				
			System.out.println(id + "님 회원가입을 축하드립니다.");		// 비밀번호 일치시 회원가입 축하 문구
		}else {		// 비밀번호 불일치시
			System.out.println("비밀번호가 일치 하지 않습니다. 비밀번호를 확인해주세요.");		// 비밀번호 불일치시 문구
			return;
		}
		
		System.out.println("이름을 입력하세요");
		String name = sc.nextLine();
		System.out.print("태어난 년도를 입력하세요 : ");	// 태어난 년도 입력
		String year = sc.nextLine();
		System.out.print("태어난 월을 입력하세요 : ");		// 태어난 월 입력
		String month = sc.nextLine();
		System.out.print("태어난 일을 입력하세요 : ");		// 태어난 일 입력
		String day = sc.nextLine();
		System.out.println("이메일을 입력하세요 : ");		// 이메일 입력
		String email = sc.nextLine();
		
		
		memberDTO = new MemberDTO(id, pwd, pwdDoubleCheck, name, year, month, day, email);	// 비밀번호 일치시 회원가입 정보를 배열로 저장
//		objOut.writeObject(memberDTO);
	}

	
}
