package swing_ys;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import team4_login_3.MemberDB;
import team4_login_3.MemberDTO;

//private JTextField idtextField;

//private JPanel RegisterPanel;


public class RegisterPanel extends JPanel{
	private JTextField nametextField;
	private MainFrame mf;
	private JPanel registerPanel;
	private JTextField monthtextField;
	private JTextField dayTextField;
	private JTextField EmailTextField;
	private JTextField yearTextField;
	
	public RegisterPanel(MainFrame mf) {
		this.mf = mf;
		this.registerPanel = this;
		
		MemberCheck memberCheck = new MemberCheck();

		
		MemberDB memberdb = new MemberDB();
		ArrayList<MemberDTO> outputMembers = new ArrayList<>();
		
		this.setLayout(null);
		this.setSize(800, 700);
		
		/* 아이디 입력 및 라벨 */
		JTextField idtextField = new JTextField();
		idtextField.setBounds(145, 65, 177, 47);
		idtextField.setColumns(10);
		
		JLabel idLabel = new JLabel("아이디");
		idLabel.setFont(new Font("굴림", Font.PLAIN, 18));
		idLabel.setHorizontalAlignment(SwingConstants.CENTER);
		idLabel.setBounds(28, 63, 72, 48);
		
		/* 비밀번호 입력 및 라벨 */
		JPasswordField pwdField = new JPasswordField();
		pwdField.setBounds(145, 161, 292, 47);
		
		JLabel pwdLabel = new JLabel("비밀번호");
		pwdLabel.setFont(new Font("굴림", Font.PLAIN, 18));
		pwdLabel.setHorizontalAlignment(SwingConstants.CENTER);
		pwdLabel.setBounds(12, 155, 92, 34);
		
		/* 비밀번호 확인 입력 및 라벨 */
		JPasswordField pwdDoubleCheckField = new JPasswordField();
		pwdDoubleCheckField.setBounds(145, 279, 292, 48);
		
		JLabel pwdDoubleCheckLabel = new JLabel("비밀번호확인");
		pwdDoubleCheckLabel.setFont(new Font("굴림", Font.PLAIN, 16));
		pwdDoubleCheckLabel.setHorizontalAlignment(SwingConstants.CENTER);
		pwdDoubleCheckLabel.setBounds(12, 277, 121, 35);
		
	
		/* 아이디 중복확인 버튼 */
		JButton idDoubleCheckbtn = new JButton("중복확인");
		idDoubleCheckbtn.setBounds(334, 63, 103, 48);
		
		/* 이름 입력 및 라벨 */
		JLabel nameLabel = new JLabel("이름");
		nameLabel.setFont(new Font("굴림", Font.PLAIN, 17));
		nameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		nameLabel.setBounds(28, 376, 76, 48);
		
		nametextField = new JTextField();
		nametextField.setColumns(10);
		nametextField.setBounds(145, 377, 237, 47);
		
		/* 뒤로가기 버튼 */
		JButton backButton = new JButton("뒤로가기");
		backButton.setBounds(702, 23, 86, 34);
		
		/* 회원가입 버튼 */
		JButton registerBtn = new JButton("회원가입");
		registerBtn.setBounds(445, 557, 319, 62);
		
		/* 태어난 년도 */
		JLabel yearLabel = new JLabel("태어난 년도");
		yearLabel.setHorizontalAlignment(SwingConstants.CENTER);
		yearLabel.setBounds(482, 65, 92, 47);
		
		yearTextField = new JTextField();
		yearTextField.setColumns(10);
		yearTextField.setBounds(586, 65, 177, 47);
		
		/* 태어난 월 */
		JLabel monthLabel = new JLabel("태어난 월");
		monthLabel.setHorizontalAlignment(SwingConstants.CENTER);
		monthLabel.setBounds(482, 161, 92, 47);
		
		
		monthtextField = new JTextField();
		monthtextField.setBounds(586, 161, 177, 47);
		add(monthtextField);

		/* 태어난 일 */
		dayTextField = new JTextField();
		dayTextField.setColumns(10);
		dayTextField.setBounds(587, 280, 177, 47);
		
		JLabel dayLabel = new JLabel("태어난 일");
		dayLabel.setHorizontalAlignment(SwingConstants.CENTER);
		dayLabel.setBounds(483, 280, 92, 47);
		
		/* 이메일 주소 */
		EmailTextField = new JTextField();
		EmailTextField.setColumns(10);
		EmailTextField.setBounds(523, 377, 241, 47);
		
		JLabel emailLabel = new JLabel("E-mail");
		emailLabel.setHorizontalAlignment(SwingConstants.CENTER);
		emailLabel.setBounds(419, 378, 92, 47);
		
		
		
		
		
		/* 뒤로가기 버튼 눌렀을 때 */
		backButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				
			registerPanel.setVisible(false);
			
//			 new MainPanel();	
			ChangePanel.registerToMain(mf, registerPanel,new MainPanel(mf));
			
			}
		});
		
		
		/* 회원가입 버튼 눌렀을 때 */
		registerBtn.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				
				// 비밀번호 일치시에만 회원 등록 가능 
				if(memberCheck.pwdCheck(pwdField.getText(), pwdDoubleCheckField.getText())) {
				
				memberCheck.allCheck(idtextField.getText(), pwdField.getText(), pwdDoubleCheckField.getText(),
						
						nametextField.getText(), yearTextField.getText(), monthtextField.getText(), dayTextField.getText(), 
						EmailTextField.getText());

				ChangePanel.registerToMain(mf, registerPanel,new MainPanel(mf));
				
//				loginFrame.initialize1();
				}
			}
		});
		
		
		/* 아이디 중복 체크 */
		idDoubleCheckbtn.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				
				memberCheck.idCheck(idtextField.getText());
			
				
			}
		});
		
		/* 라벨붙히기 */
		this.add(idLabel);
		this.add(idtextField);
		this.add(pwdLabel);
		this.add(pwdField);
		this.add(pwdDoubleCheckField);
		this.add(pwdDoubleCheckLabel);
		this.add(registerBtn);
		this.add(backButton);
		this.add(nameLabel);
		this.add(nametextField);
		this.add(nametextField);
		this.add(emailLabel);
		this.add(EmailTextField);
		this.add(yearLabel);
		this.add(yearTextField);
		this.add(monthLabel);
		this.add(monthtextField);
		this.add(dayLabel);
		this.add(dayTextField);
		this.add(idDoubleCheckbtn);
		
		
		
//		this.add(loginButton);
//		this.add(registerButton);
		
		
		/* 프레임에 붙히기 */
//		mf.add(mainPanel);
		
	
		
		
		
		}
	}

//	 JFrame frame;
//	 JTextField id;
//	JPasswordField pwd;
// JPasswordField pwdDoubleCheck;
//	 JTextField name;
//	 JTextField yearText;
//	JTextField Monthtext;
//	 JTextField daytext;
//	 JTextField emailtextField;
//	 JButton idDoubleCheckbtn;
//	 private JTextField idtextField;
//	 private JPasswordField pwdField;
//	 private JPasswordField pwdDoubleCheckField;
//	
//	
//	public void initialize() {
//		
//		JFrame frame = new JFrame();
//		frame.setBounds(100, 100, 916, 608);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.getContentPane().setLayout(null);
//		frame.setVisible(true);
//
//		id = new JTextField();
//		id.setBounds(116, 162, 164, 35);
//		frame.getContentPane().add(id);
//		id.setColumns(10);
//		
//		
//		while(true) {
//			
//			
//		pwd = new JPasswordField();
//		pwd.setBounds(116, 229, 164, 35);
//		frame.getContentPane().add(pwd);
//		
//		pwdDoubleCheck = new JPasswordField();
//		pwdDoubleCheck.setBounds(116, 296, 164, 35);
//		frame.getContentPane().add(pwdDoubleCheck);
//		
//		if(!pwd.equals(pwdDoubleCheck)) {
//			
//			JButton button2 = new JButton("비밀번호를 다시 입력하세요");
//			button2.addActionListener(new ActionListener() {
//				
//				@Override
//				public void actionPerformed(ActionEvent e) {
//					dispose();
//				}
//			});
//			
//		}else {
//			
//			break;
//		}
//		
//		
//		}
//		name = new JTextField();
//		name.setColumns(10);
//		name.setBounds(116, 94, 164, 35);
//		frame.getContentPane().add(name);
//		
//		JLabel nameLabel = new JLabel("이름");
//		nameLabel.setBounds(28, 93, 110, 36);
//		frame.getContentPane().add(nameLabel);
//		
//		JLabel idlabel = new JLabel("아이디");
//		idlabel.setBounds(28, 161, 110, 36);
//		frame.getContentPane().add(idlabel);
//		
//		
//		
//		JLabel pwdLabel = new JLabel("비밀번호");
//		pwdLabel.setBounds(28, 228, 110, 36);
//		frame.getContentPane().add(pwdLabel);
//		
//		JLabel pwdDoubleCheckLabel = new JLabel("비밀번호확인");
//		pwdDoubleCheckLabel.setBounds(28, 295, 110, 36);
//		frame.getContentPane().add(pwdDoubleCheckLabel);
//		
//		JLabel yearLabel = new JLabel("태어난년도");
//		yearLabel.setBounds(445, 94, 110, 36);
//		frame.getContentPane().add(yearLabel);
//		
//		JLabel monthLabel = new JLabel("태어난 월");
//		monthLabel.setBounds(445, 162, 110, 36);
//		frame.getContentPane().add(monthLabel);
//		
//		JLabel dayLabel = new JLabel("태어난 일");
//		dayLabel.setBounds(445, 228, 110, 36);
//		frame.getContentPane().add(dayLabel);
//		
//		yearText = new JTextField();
//		yearText.setBounds(583, 94, 192, 35);
//		frame.getContentPane().add(yearText);
//		yearText.setColumns(10);
//		
//		Monthtext = new JTextField();
//		Monthtext.setColumns(10);
//		Monthtext.setBounds(583, 162, 192, 35);
//		frame.getContentPane().add(Monthtext);
//		
//		daytext = new JTextField();
//		daytext.setColumns(10);
//		daytext.setBounds(583, 235, 192, 35);
//		frame.getContentPane().add(daytext);
//		
//		
//		JButton registerBtn = new JButton("회원가입");
//		registerBtn.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				
//				
//			}
//		});
//		
//		
//		
//		
//		registerBtn.setBounds(306, 452, 249, 62);
//		frame.getContentPane().add(registerBtn);
//		
//		JLabel emailLabel = new JLabel("이메일주소");
//		emailLabel.setBounds(445, 294, 110, 36);
//		frame.getContentPane().add(emailLabel);
//		
//		emailtextField = new JTextField();
//		emailtextField.setColumns(10);
//		emailtextField.setBounds(583, 295, 192, 35);
//		frame.getContentPane().add(emailtextField);
//		
//		idDoubleCheckbtn = new JButton("중복확인");
//		idDoubleCheckbtn.setBounds(306, 162, 91, 35);
//		frame.getContentPane().add(idDoubleCheckbtn);
//		
//	}
//}
