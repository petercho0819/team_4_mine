package team4_io;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		ArrayList<MemberDTO> al = new ArrayList<>();

		OutOnly oo = new OutOnly();

		/* 회원 정보 출력 */
		oo.insertMember();

		/* 아이디 체크를 위한 입력 */
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디를 입력하세요 : ");	// 아이디 입력
		String id2 = sc.nextLine();
		//		System.out.print("비밀번호를 입력하세요 : ");	// 비밀번호 입력
		//		String pwd2 = sc.nextLine();

		/* 회원의 정보 입력 */
		al = new OutOnly().checkMethod();

		for(int j = 0; j < al.size(); j++) {

			if(al.get(j).getId() == null) {
				System.out.println("회원등록이 되어 있지 않습니다. 회원가입을 먼저해주세요.");

				return;
			}else if(al.get(j).getId().equals(id2)) {
				System.out.println("회원중에 일치하는 아이디가 있습니다.");
			}else {
				System.out.println("아이디가 일치하는 회원이 없습니다.");

			}

		}
	}
}
