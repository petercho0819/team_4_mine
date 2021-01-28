//package team4_login_2;
//
//import java.io.BufferedInputStream;
//import java.io.BufferedOutputStream;
//import java.io.EOFException;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.ObjectInputStream;
//import java.io.ObjectOutputStream;
//import java.util.ArrayList;
//import java.util.Scanner;
//
////import com.greedy.section03.filterstream.MyOutputStream;
////import com.greedy.section03.filterstream.DTO.MemberDTO;
//
//public class OutOnly {
//
//	public static void main(String[] args) {
//		
//		
//		
//		/* 회원 정보를 파일로 저장하기 위한 출력 */
//		ObjectOutputStream objOut = null;
//		
//		try {
//			/* 객체 출력을 기존의 파일에 매번 덮어쓰기 할 경우 */
////			objOut = new ObjectOutputStream(new BufferedOutputStream(
////					new FileOutputStream("src/com/greedy/section03/filterstream/testObjectStream.txt")));
//
//			/* 객체 출력을 기존의 파일에 이어붙이기 할 경우 */
//			if(new File("src/com/greedy/section03/filterstream/testObjectStream.txt").exists()) {	
//				/* 기존에 파일이 있을 경우 */
//				objOut = new MyOutputStream(new BufferedOutputStream(
//						new FileOutputStream("src/com/greedy/section03/filterstream/testObjectStream.txt", true)));	
//
//			}else {
//				/* 기존에 파일이 없을 경우 */
//				objOut = new ObjectOutputStream(new BufferedOutputStream(
//						new FileOutputStream("src/com/greedy/section03/filterstream/testObjectStream.txt")));
//			}
//			
//			
//			
//			for(int i = 0; i < outputMembers.length; i++) {		// 선택적으로!`
//				objOut.writeObject(outputMembers[i]);
//			}
//			
//		} catch (FileNotFoundException e) {
//			
//			e.printStackTrace();
//			
//		} catch (IOException e) {
//			
//			e.printStackTrace();
//			
//		}finally {
//			if(objOut != null) {
//				try {
//					objOut.close();
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//			}
//		}
//		
//		ArrayList<MemberDTO> inputMembers = new ArrayList<>();
//		ObjectInputStream objIn	= null;		
//		
//		try {
//			objIn = new ObjectInputStream(new BufferedInputStream(
//					new FileInputStream("src/team4_login_2/memberDB2.txt")));
//
//			Scanner sc = new Scanner(System.in);
//			System.out.println("아이디를 입력하세요 : ");	// 아이디 입력
//			String id2 = sc.nextLine();
//			System.out.print("비밀번호를 입력하세요 : ");	// 비밀번호 입력
//			String pwd2 = sc.nextLine();
//			
////		while(true) {
////			System.out.println(((MemberDTO)objIn.readObject()).toString());
////		}
//		
////			int i = 0;
////				while(true) {
//					
//				MemberDTO input = (MemberDTO) objIn.readObject();
//				// input에 담기
//				
//				System.out.println(input);
//				
////				inputMembers.add(input);	// 담은 데이터를 arraylist배열로 정리
////				i++;
////				System.out.println(inputMembers);
////				}
//				
////				for(int j = 0; j < inputMembers.size(); j++) {
////					System.out.println(inputMembers.get(j));
////				}
////					
////				}
////					if(inputMembers.get(j).id == null) {
////						System.out.println("회원등록이 되어 있지 않습니다. 회원가입을 먼저해주세요.");
////						
////					
////					}
//				
////					else if(inputMembers.get(j).id.equals(id2) && (inputMembers.get(j).pwd.equals(pwd2))) {
////						System.out.println("로그인에 성공하셨습니다.");
////						
////						
////					}else  {
////						System.out.println("아이디 또는 비밀번호가 일치하지 않습니다.");
////						
////					}
//				
////				int i = 0;
////				while(true) {
////					MemberDTO m = (MemberDTO)objIn.readObject();	// 반환형이 Object임! 따라서 다운캐스팅!
////					
////					System.out.println(m);
////					inputMembers[i++] = m;
////				}
//			
//				
//				// 
////				int i = 0;
////				while(true) {
////					MemberDTO m = (MemberDTO)objIn.readObject();	// 반환형이 Object임! 따라서 다운캐스팅!
////					
////					System.out.println(m);
////					inputMembers[i++] = m;
////				}
//		
//			
//		} catch (EOFException e) {
//			 
//			System.out.println("파일 읽기 완료");
//		}
//		catch (FileNotFoundException e1) {
//				
//			System.out.println("파일 못찾음");
//			e1.printStackTrace();
//		} catch (IOException e) {
//			
//			System.out.println("IOException");
//			e.printStackTrace();
//		} catch (ClassNotFoundException e) {
//			
//			e.printStackTrace();
//		} catch (ClassCastException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}finally {
//			if(objIn != null) {
//				try {
//
//					objIn.close();
//				} catch (IOException e) {
//						System.out.println("finally");
//					e.printStackTrace();
//
//				}
//			}
//		}
//	}
//
//}
