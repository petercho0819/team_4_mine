package insik;

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
import java.util.Scanner;

//import com.greedy.section03.filterstream.MyOutputStream;
//import com.greedy.section03.filterstream.DTO.MemberDTO;

public class MemberDB {

	public void insertMember(ArrayList<MemberDTO> register_DB) {	
		// 받은 회원 정보 (Arraylist) 

		/* 회원 정보를 파일로 저장하기 위한 출력 */
		
//		Register register = new Register();
//		register.regi
//		ArrayList<MemberDTO> outputMembers = register_DB;

//		outputMembers.add(memberinfo);
		ObjectOutputStream objOut = null;

		try {

			if (new File("src/insik/memberDB.txt").exists()) {
				/* 기존에 파일이 있을 경우 */
				objOut = new MyOutputStream(
						new BufferedOutputStream(new FileOutputStream("src/insik/memberDB.txt", true)));

			} else {
				/* 기존에 파일이 없을 경우 */
				objOut = new ObjectOutputStream(
						new BufferedOutputStream(new FileOutputStream("src/insik/memberDB.txt")));
			}

			for (int i = 0; i < register_DB.size(); i++) {

				objOut.writeObject(register_DB.get(i));
			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();

		} finally {
			if (objOut != null) {
				try {
					objOut.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public ArrayList<MemberDTO> checkMethod() {

		ArrayList<MemberDTO> inputMembers = new ArrayList<>();
		ObjectInputStream objIn = null;

		try {
			objIn = new ObjectInputStream(new BufferedInputStream(new FileInputStream("src/insik/memberDB.txt")));

			while (true) {

				MemberDTO input = (MemberDTO) objIn.readObject();
				
				inputMembers.add(input);

			}


		} catch (EOFException e) {
			for (int j = 0; j < inputMembers.size(); j++) {
				System.out.println("inputmembers: " + inputMembers.get(j));
			}	// 회원 정보가 입력이 되어 있는지 확인!
//			System.out.println("파일 읽기 완료");
		} catch (FileNotFoundException e1) {

			System.out.println("파일 못찾음");
			e1.printStackTrace();
		} catch (IOException e) {

			System.out.println("IOException");
			e.printStackTrace();
		} catch (ClassCastException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (objIn != null) {
				try {

					objIn.close();
				} catch (IOException e) {
					System.out.println("finally");
					e.printStackTrace();

				}
			}
		}
		// 리턴해서 inputmembers를 컨트롤로 보낸다.
		return inputMembers;
	}

}
