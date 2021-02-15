package insik;

import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import swing_ys.ChangePanel;
import swing_ys.MainPanel;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class TalTye {
	private JTextField textField_1;
	private TalTye tt;
	private JPanel jp;

	public TalTye() {

		//		MemberDB mDB = new MemberDB();

		MemberDTO memberDTO = new MemberDTO();

		ArrayList<MemberDTO> str = new ArrayList<>();
		str.add(new MemberDTO("1", "1", "1", null, null, null, null, null));
		str.add(new MemberDTO("2", "2", "2", null, null, null, null, null));
		str.add(new MemberDTO("3", "3", "3", null, null, null, null, null));


		JFrame frame = new JFrame("회원관리");
		JPanel panel = new JPanel();


		frame.setBounds(150, 50, 1200, 700);

		/**
		 * Launch the application.
		 */
		//	public static void main(String[] args) {
		//		EventQueue.invokeLater(new Runnable() {
		//			public void run() {
		//				try {
		//					TalTye window = new TalTye();
		//					window.frame.setVisible(true);
		//				} catch (Exception e) {
		//					e.printStackTrace();
		//				}
		//			}
		//		});
		//	}

		/**
		 * Create the application.
//	 */
		//	public TalTye() {
		//		initialize();
		//	}

		/**
		 * Initialize the contents of the frame.
		 */
		//	private void initialize() {

		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 450, 300);
		frame.getContentPane().setLayout(null);
		panel.setBounds(0, 0, 436, 253);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("탈퇴하실 회원님의 ID를 입력하세요");
		lblNewLabel.setBounds(12, 73, 222, 25);
		panel.add(lblNewLabel);


		JButton btnNewButton = new JButton("뒤로가기");
		btnNewButton.setBounds(0, 0, 91, 23);
		panel.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("탈퇴");
		btnNewButton_1.setBounds(162, 146, 91, 23);
		panel.add(btnNewButton_1);
		panel.add(lblNewLabel);

		frame.getContentPane().add(panel);

		textField_1 = new JTextField();
		textField_1.setBounds(224, 75, 96, 21);
		panel.add(textField_1);
		textField_1.setColumns(10);

		//		frame.add(textField_1);

		frame.getContentPane().add(panel);

		// 뒤로가기 버튼
		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				panel.setVisible(false);

				//				 new MainPanel();	
				//				ChangePanel.taltyeToMain(tt, jp, mp);
				//				ChangePanel.
			}
		});

		
		// 탈퇴 버튼
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {


				

				for (int a = 0; a < str.size(); a++) {

					if(textField_1.getText().equals(str.get(a).getId()))   {

						JOptionPane.showMessageDialog(null, "탈퇴가 완료되었습니다. 감사합니다.");
//						System.out.println("탈퇴가 완료되었습니다. 감사합니다.");
						//						System.out.println(str);

						break;

					}
					else {

						JOptionPane.showMessageDialog(null, "가입되지 않은 ID입니다. 다시 입력해주세요.");

//						System.out.println("가입되지 않은 ID입니다. 다시 입력해주세요.");

						break;
					}
				}


			}
		});



	}


}
