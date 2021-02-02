package swing_ys;

import java.util.ArrayList;

import javax.swing.JOptionPane;



public class MemberCheck {

	static MemberDB memberdb = new MemberDB();
	ArrayList<MemberDTO> outputMembers = new ArrayList<>();	// 회원정보를 담을 arraylist 생성

	/* GUI 아이디 중복체크 */
	public void idCheck(String id) {

		boolean isExist = true;
		for (int i = 0; i < memberdb.checkMethod().size(); i++) {
			if (id.equals(memberdb.checkMethod().get(i).getId())) {

				JOptionPane.showMessageDialog(null, "동일한 아이디가 존재합니다.");
				isExist = false;
				break;
			}

		}

		if (isExist) {
			JOptionPane.showInternalMessageDialog(null, "사용 가능한 아이디입니다.");
		}


	}

	/* 멤버 등록 */
	public void allCheck(String id, String pwd, String pwdDoubleCheck, String name, String year, String month, String day, String email) {

		/* 회원 등록 */
		MemberDB memberdb = new MemberDB();
		ArrayList<MemberDTO> outputMembers = new ArrayList<>();	// 회원정보를 담을 arraylist 생성

		//		if(id.isBlank() || pwd.isBlank() || pwdDoubleCheck.isBlank() || name.isBlank() || year.isBlank() 
		//				|| month.isBlank(), day.isBlank() || email.isBlank()) {
		//			
		//		}

		while(true) {
			outputMembers.add(new swing_ys.MemberDTO(id, pwd, pwdDoubleCheck, name, year, month, day, email));
			memberdb.insertMember(outputMembers);
			System.out.println("등록한 회원 :" + outputMembers);
			JOptionPane.showInternalMessageDialog(null, "회원등록이 완료 되었습니다.");
			break;
		}
	}

	/* 비밀번호 중복 일치 확인 */
	public boolean pwdCheck(String pwd, String pwdDoubleCheck) {

		boolean pwdCheck = true;
		if(!pwd.equals(pwdDoubleCheck)) {	

			JOptionPane.showInternalMessageDialog(null, "비밀번호가 일치하지 않습니다.");
			pwdCheck = false;
		}
		return pwdCheck;

	}

	/* 로그인 */
	public static boolean loginCheck(String id, String pwd) {


		boolean islogin = false;
		for (int i = 0; i < memberdb.checkMethod().size(); i++) {
			if (id.equals(memberdb.checkMethod().get(i).getId()) && pwd.equals(memberdb.checkMethod().get(i).getPwd())) {

				JOptionPane.showMessageDialog(null, "로그인을 축하합니다.");
				islogin= true;

			}

		}

		return islogin;
	}

	/* 매니져 로그인 */
	public static boolean Manager(String id, String pwd) {


		boolean islogin = false;

		if (id.equals("admin") && pwd.equals("admin")) {

			JOptionPane.showMessageDialog(null, "admin님 로그인을 축하합니다.");
			islogin= true;


		}

		return islogin;
	}

	/* 회원가입시 빈칸 확인 */
	public static boolean blank (String id, String pwd, String pwdDoubleCheck, String name, String year, String month, String day, String email) {
		boolean isBlank = true;
		
		if(id.isBlank() || pwd.isBlank() || pwdDoubleCheck.isBlank() || name.isBlank() || year.isBlank() ||
					month.isBlank() || day.isBlank() || email.isBlank()) {
			
			JOptionPane.showMessageDialog(null, "공란이 있습니다. 공란을 작성하여주세요.");
			
			isBlank = false;
		}
	
		return isBlank;
	}
}











