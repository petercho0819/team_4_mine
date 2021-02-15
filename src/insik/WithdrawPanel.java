package insik;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import swing_ys.MemberDB;



public class WithdrawPanel extends JPanel {

	private MainFrame mf;
	private WithdrawPanel withdrawPanel;
	private JTextField idTextField;
	private JLabel idLabel;
	
	
	public WithdrawPanel(MainFrame mf) {
		
		this.mf = mf;
		this.withdrawPanel = this;
		this.setSize(1000, 700);
		this.setLayout(null);

		MemberCheck memberCheck = new MemberCheck();		
		MemberDB memberdb = new MemberDB();

		ArrayList<MemberDTO> str = new ArrayList<>();

		str.add(new MemberDTO("1", "1", "1", null, null, null, null, null));
		str.add(new MemberDTO("2", "2", "2", null, null, null, null, null));
		str.add(new MemberDTO("3", "3", "3", null, null, null, null, null));		

		// id 입력 라벨
		idLabel = new JLabel("탈퇴하실 회원님의 ID를 입력하세요");
		idLabel.setBounds(117, 106, 222, 25);
		this.add(idLabel);
		
		// id 입력 필드
		idTextField = new JTextField();
		idTextField.setBounds(371, 108, 96, 21);
		withdrawPanel.add(idTextField);
		idTextField.setColumns(10);
		this.add(idTextField);

		// 뒤로가기 버튼
		JButton backButton = new JButton("뒤로가기");
		backButton.setBounds(0, 0, 91, 23);
		this.add(backButton);

		// 탈퇴 버튼
		JButton withdrawButton = new JButton("탈퇴");
		withdrawButton.setBounds(276, 214, 91, 23);
		withdrawPanel.add(withdrawButton);
		withdrawPanel.add(idLabel);
		this.add(withdrawButton);
		
		// 뒤로가기 버튼 이벤트(클릭시 마이페이지 화면으로)
		backButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				withdrawPanel.setVisible(false);
				
				ChangePanel.WithdrawPanelToMyPage(mf, withdrawPanel, new Mypage(mf));
			}
		});

		
		// 탈퇴 버튼 이벤트 
		withdrawButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				
//				if(memberCheck.idCheck(id);)
				
				memberCheck.idCheck(idTextField.getText());
				
				

//				for (int a = 0; a < str.size(); a++) {
//
//					if(idTextField.getText().equals(str.get(a).getId()))   {
//
//						JOptionPane.showMessageDialog(null, "탈퇴가 완료되었습니다. 감사합니다.");
//
//						break;
//
//					}
//					else {
//
//						JOptionPane.showMessageDialog(null, "가입되지 않은 ID입니다. 다시 입력해주세요.");
//
//
//						break;
//					}
//				}


			}
		});
		
		mf.getContentPane().add(withdrawPanel);


	}
}
