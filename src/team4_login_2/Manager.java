package team4_login_2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//import com.greedy.section03.filterstream.DTO.MemberDTO;

//import com.greedy.section03.filterstream.MyOutputStream;

public class Manager {

	public Manager() {}

	Scanner sc = new Scanner(System.in);
//	MemberDTO memberDTO = new MemberDTO();		// 로그인DTO생성
	ArrayList<MemberDTO> outputMembers = new ArrayList<>();	//회원 회원가입 정보를 받음 (1차원 배열)
	ArrayList<MemberDTO> inputMembers = new ArrayList<>();	// 회원 로그인 할 때 정보를 받음

	
	public void Run() throws Exception {


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
				register();	// 회원가입 메소드 실행
				break;
			case 2 : 		// 로그인
				login();	// 로그인 메소드 실행
				break;
			case 3 : 		// 회원정보 조회
				search();
				break;
			case 9 : System.out.println("프로그램을 종료합니다."); return;
			default : System.out.println("잘못된 번호를 입력하셨습니다.");
			break;
			}
		} //while문 종료
	} //run 종료

	public void search() {
		// TODO Auto-generated method stub

	}

	public void register() throws IOException {		// 회원가입 메소드
		ObjectOutputStream objOut = null;					// fileWriter생성
//		MemberDTO memberDTO = new MemberDTO();		// 로그인DTO생성
//		ArrayList<MemberDTO> outputMembers = new ArrayList<>();	//회원 로그인 정보를 받음 (1차원 배열)
//		outputMembers.add(new MemberDTO("1", "1", "1"));
//		outputMembers.add(new MemberDTO("2", "2", "2"));
//		outputMembers.add(new MemberDTO("3", "3", "3"));
//		System.out.println("ouputmembers : " + outputMembers);
		try {

			if(new File("src/team4_login_2/memberDB.txt").exists()) {	
				/* 기존에 파일이 있을 경우 */
				objOut = new MyOutputStream(new BufferedOutputStream(
						new FileOutputStream("src/team4_login_2/memberDB.txt", true)));	

			}else {
				/* 기존에 파일이 없을 경우 */
				objOut = new ObjectOutputStream(new BufferedOutputStream(
						new FileOutputStream("src/team4_login_2/memberDB.txt")));
			}
			
			
//			if(members.size() == 0) {
//				String title = "아이디" + "\t\t" + "비밀번호" + "\t\t" + "이름" + "\t\t" + "년" + "\t"
//						+ "월" + "\t" + "일" + "\t\t" + "이메일";
//				objOut.writeUTF(title);													// FileWriter 생성시 맨 위에 아이디, 비번 등 표시
//			}
			String pwd = "";				// 비밀번호
			String pwdDoubleCheck = "";		// 비밀번호 확인

			sc.nextLine();
			System.out.println("아이디를 입력해주세요 : ");		// 아이디 입력
			String id = sc.nextLine();
//			objOut.writeUTF("\t");

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

//			for(int i = 0 ; i < outputMembers.size(); i++) {		// 배열에 저장된 회원정보를 출력
//				System.out.println("입력하신 정보는 아래와 같습니다.");
//				System.out.println(outputMembers.get(i).getInfo());
//			}

//			String total = id + "\t\t" + pwd + "\t\t" + name + "\t\t" + year +"\t\t" + month
//					+ "\t\t" + day + "\t\t" + email;
			
			
//			memberDTO = new MemberDTO("user", "pass", "passcheck");	// 회원가입(가정)

			outputMembers.add(new MemberDTO(id, pwd, pwdDoubleCheck));	// 비밀번호 일치시 회원가입 정보를 배열로 저장
			objOut.writeObject(outputMembers);		// FileWriter에 입력한 정보 대입
			
			for(MemberDTO md : outputMembers) {
				System.out.println(md);
			}
			
	
//			System.out.println("입력한 멤버크기");
			
		}catch (IOException e) {

			e.printStackTrace();
		}finally {
			if(objOut != null) {
				try {

					objOut.close();
				} catch (IOException e) {

					e.printStackTrace();

				}
			}
		}
	}

	public void login() {		//로그인 메소드
//		MemberDTO memberDTO = new MemberDTO();
//		MemberDTO[] inputMembers_array = new MemberDTO[100];
		
		ObjectInputStream objIn	= null;		
		
		try {
			objIn = new ObjectInputStream(new BufferedInputStream(
					new FileInputStream("src/team4_login_2/memberDB.txt")));

			Scanner sc = new Scanner(System.in);
			System.out.println("아이디를 입력하세요 : ");	// 아이디 입력
			String id2 = sc.nextLine();
			System.out.print("비밀번호를 입력하세요 : ");	// 비밀번호 입력
			String pwd2 = sc.nextLine();
			
//		while(true) {
//			System.out.println(((MemberDTO)objIn.readObject()).toString());
//		}
		
//			int i = 0;
//				while(true) {
					
				MemberDTO input = (MemberDTO) objIn.readObject();
				// input에 담기
				
				System.out.println(input);
				
//				inputMembers.add(input);	// 담은 데이터를 arraylist배열로 정리
//				i++;
//				System.out.println(inputMembers);
//				}
				
//				for(int j = 0; j < inputMembers.size(); j++) {
//					System.out.println(inputMembers.get(j));
//				}
//					

//					if(inputMembers.get(j).id == null) {
//						System.out.println("회원등록이 되어 있지 않습니다. 회원가입을 먼저해주세요.");
//						
//					
//					}
				
//					else if(inputMembers.get(j).id.equals(id2) && (inputMembers.get(j).pwd.equals(pwd2))) {
//						System.out.println("로그인에 성공하셨습니다.");
//						
//						
//					}else  {
//						System.out.println("아이디 또는 비밀번호가 일치하지 않습니다.");
//						
//					}
//				
				
				
//				int i = 0;
//				while(true) {
//					MemberDTO m = (MemberDTO)objIn.readObject();	// 반환형이 Object임! 따라서 다운캐스팅!
//					
//					System.out.println(m);
//					inputMembers[i++] = m;
//				}
			
				
				// 
//				int i = 0;
//				while(true) {
//					MemberDTO m = (MemberDTO)objIn.readObject();	// 반환형이 Object임! 따라서 다운캐스팅!
//					
//					System.out.println(m);
//					inputMembers[i++] = m;
//				}
				
				
				
				
				
			
//		
			
			
			
		} catch (EOFException e) {
			 
			System.out.println("파일 읽기 완료");
		}
		catch (FileNotFoundException e1) {
				
			System.out.println("파일 못찾음");
			e1.printStackTrace();
		} catch (IOException e) {
			
			System.out.println("IOException");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (ClassCastException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(objIn != null) {
				try {

					objIn.close();
				} catch (IOException e) {
						System.out.println("finally");
					e.printStackTrace();

				}
			}
		}
	}
}


















