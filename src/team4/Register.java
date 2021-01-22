package team4;

import java.util.ArrayList;
import java.util.Scanner;

public class Register {
		Scanner sc = new Scanner(System.in);
		LoginDTO loginDTO = new LoginDTO();
		ArrayList<LoginDTO> members = new ArrayList<>();

		
	public void register() {
			
			
			System.out.println("아이디를 입력하세요 : ");
			String id  = sc.next();
			sc.nextLine();
			System.out.print("비밀번호를 입력하세요 : ");
			String pwd = sc.nextLine();
			System.out.print("비밀번호를 한 번 더 입력하세요 : ");
			String pwdDoubleCheck = sc.nextLine();
			System.out.print("이름을 입력하세요 : ");
			String name = sc.nextLine();
			System.out.print("태어난 년도를 입력하세요 : ");
			int year = sc.nextInt();
			System.out.print("태어난 월을 입력하세요 : ");
			int month = sc.nextInt();
			System.out.print("태어난 일을 입력하세요 : ");
			int day = sc.nextInt();
			System.out.print("이메일을 입력하세요 : ");
			String email = sc.next();
			
	//		if(id == Arraylist.) {
	//			System.out.println("중복된 아이디입니다.");
	//		}else 
			
				if(pwd.equals(pwdDoubleCheck)) {
					loginDTO = new LoginDTO(id, pwd, pwdDoubleCheck, name, year, month, day, email);
				members.add(loginDTO);
				System.out.println(id + "님 가입을 축하드립니다.");
			}else {
				System.out.println("비밀번호가 일치 하지 않습니다. 비밀번호를 확인해주세요.");
				return;
			}
				for(int i = 0 ; i < members.size(); i++) {
				System.out.println(members.get(i).getInfo());
				}
		}
	}
