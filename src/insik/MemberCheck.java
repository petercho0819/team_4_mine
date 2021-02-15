package insik;

import java.util.ArrayList;

import javax.swing.JOptionPane;


public class MemberCheck {

	
	MemberDB memberdb = new MemberDB();
		
	ArrayList<MemberDTO> outputMembers = new ArrayList<>();
	
	
//	public void allCheck(String id, String pwd, String pwdDoubleCheck, String name, String year, String month, String day, String email) {
//
//		/* 회원 등록 */
//		MemberDB memberdb = new MemberDB();
//		ArrayList<MemberDTO> outputMembers = new ArrayList<>();	// 회원정보를 담을 arraylist 생성
//
//		//		if(id.isBlank() || pwd.isBlank() || pwdDoubleCheck.isBlank() || name.isBlank() || year.isBlank() 
//		//				|| month.isBlank(), day.isBlank() || email.isBlank()) {
//		//			
//		//		}
//
//		
//		while(true) {
//			outputMembers.(new insik.MemberDTO(id, pwd, pwdDoubleCheck, name, year, month, day, email));
//			memberdb.insertMember(outputMembers);
//			System.out.println("등록한 회원 :" + outputMembers);
//			JOptionPane.showInternalMessageDialog(null, "회원등록이 완료 되었습니다.");
//			break;
//		}
//	}
	
	public void idCheck(String id) {

		boolean isExist = false;
		
		for (int i = 0; i < memberdb.checkMethod().size(); i++) {
			
				if(id.equals(memberdb.checkMethod().get(i).getId()))   {

					
					JOptionPane.showMessageDialog(null, "탈퇴가 완료되었습니다. 감사합니다.");
					memberdb.checkMethod().remove(i);
					
					isExist = true;

					break;

				}else {
					JOptionPane.showInputDialog(null, "회원정보가 없습니다.");
				}
		}
		
		System.out.println(memberdb.checkMethod().toString());
	}
	
}
