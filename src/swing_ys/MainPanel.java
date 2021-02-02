package swing_ys;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Rectangle;

public class MainPanel extends JPanel{


	private JTextField idtextField;
	private MainFrame mf;
	private JPanel mainPanel;
	private JTextField textField;
	private JTextField pwdTextField;
	private JPasswordField pwdField;




	public MainPanel (MainFrame mf) {
		this.mf = mf;
		this.mainPanel = this;
		this.setSize(1000, 700);

		this.setLayout(null);
		
	
		
		Image icon = new ImageIcon("src/swing_ys/coffe.jpg").getImage();
		JLabel label = new JLabel(new ImageIcon(icon));
		label.setBounds(0, 0, 1000, 700);
		this.add(label);
		
//		JPanel logo = new JPanel();
//		JLabel logo = new JLabel(new ImageIcon("src/swing_ys/coffe.jpg"));
//		logo.setBounds(150, 50, 1200, 700);
//		logo.setIcon(new ImageIcon("src/swing_ys/coffe.jpg"));
//		this.add(logo);
		

		
		
		
		/* 아이디 text */
		JTextField idtextField = new JTextField();
		idtextField.setBounds(463, 258, 237, 33);
		idtextField.setColumns(10);

		/* 아이디 라벨 */
		JLabel idlLabel = new JLabel("아이디");
		idlLabel.setHorizontalAlignment(SwingConstants.CENTER);
		idlLabel.setFont(new Font("굴림", Font.BOLD, 19));
		idlLabel.setBounds(334, 252, 98, 45);

		/* 비번 라벨 */
		JLabel pwdLabel = new JLabel("비밀번호");
		pwdLabel.setHorizontalAlignment(SwingConstants.CENTER);
		pwdLabel.setFont(new Font("굴림체", Font.BOLD, 19));
		pwdLabel.setBounds(334, 335, 98, 39);


		/* 로그인 버튼 */
		JButton loginButton = new JButton("로그인");		
		loginButton.setHorizontalAlignment(SwingConstants.CENTER);
		loginButton.setBounds(330, 392, 370, 45);
		loginButton.setFont(new Font("굴림", Font.BOLD, 20));

		/* 회원가입 버튼 */
		JButton registerButton = new JButton("회원가입");		
		registerButton.setHorizontalAlignment(SwingConstants.CENTER);
		registerButton.setBounds(330, 450, 370, 45);
		registerButton.setFont(new Font("굴림", Font.BOLD, 20));


		pwdField = new JPasswordField();
		pwdField.setBounds(463, 335, 237, 33);

		// 패널에 컴포넌트 옮기기
//		this.add(label);
		this.add(idlLabel);
		this.add(idtextField);
		this.add(pwdLabel);
		this.add(loginButton);
		this.add(registerButton);
		this.add(pwdField);





		/* 로그인 버튼 */
		loginButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				/* 매니져 로그인 시 */
				if(MemberCheck.Manager(idtextField.getText(), pwdField.getText())) {

					ChangePanel.mainToManagerPanel(mf, mainPanel, new ManagerPanel(mf));
				
					/* 멤버 로그인 시 */
				}else if(MemberCheck.loginCheck(idtextField.getText(), pwdField.getText())) {
					ChangePanel.mainToRegisterPanel(mf, mainPanel, new RegisterPanel(mf));

				}else {
					/* 회원가입이 안되어 있는 경우 */
					JOptionPane.showMessageDialog(null, "회원가입을 해주세요");
					
				}

			}
			
		});


		/* 회원가입 버튼 */
		registerButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				ChangePanel.mainToRegisterPanel(mf, mainPanel, new RegisterPanel(mf));
			}

		});

		/* 프레임에 붙히기 */
		mf.getContentPane().add(mainPanel);

	}

}