package swing_ys;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;

public class MainPanel extends JPanel{


	private JTextField idtextField;
	private MainFrame mf;
	private JPanel mainPanel;
	private JTextField textField;
	private JTextField pwdTextField;
	private JPasswordField pwdField;


//	public MainPanel() {
//		setLayout(null);
//		
//	
//		
//		
//		
//		JButton loginBtn = new JButton("로그인");
//		loginBtn.setFont(new Font("굴림", Font.PLAIN, 24));
//		loginBtn.setBounds(170, 392, 370, 45);
//		add(loginBtn);
//		
//		JButton registerButton = new JButton("회원가입");
//		registerButton.setFont(new Font("굴림", Font.PLAIN, 24));
//		registerButton.setBounds(170, 450, 370, 45);
//		add(registerButton);}

	public MainPanel (MainFrame mf) {
		this.mf = mf;
		this.mainPanel = this;
		this.setSize(1000, 700);

		this.setLayout(null);

		//기본 화면

		/* 아이디 text */
		JTextField idtextField = new JTextField();
		idtextField.setBounds(463, 258, 237, 33);
		idtextField.setColumns(10);

		/* 아이디 라벨 */
		JLabel idlLabel = new JLabel("아이디");
		idlLabel.setHorizontalAlignment(SwingConstants.CENTER);
		idlLabel.setFont(new Font("굴림", Font.PLAIN, 19));
		idlLabel.setBounds(334, 252, 98, 45);

		/* 비번 라벨 */
		JLabel pwdLabel = new JLabel("비밀번호");
		pwdLabel.setHorizontalAlignment(SwingConstants.CENTER);
		pwdLabel.setFont(new Font("굴림체", Font.PLAIN, 19));
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


		// 패널에 컴포넌트 옮기기
		this.add(idlLabel);
		this.add(idtextField);
		this.add(pwdLabel);
		this.add(loginButton);
		this.add(registerButton);
		
		pwdField = new JPasswordField();
		pwdField.setBounds(463, 335, 237, 33);
		add(pwdField);


		

		/* 로그인 버튼 */
		loginButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(MemberCheck.Manager(idtextField.getText(), pwdField.getText())) {
					
					ChangePanel.mainToManagerPanel(mf, mainPanel, new ManagerPanel(mf));

				}
				if(MemberCheck.loginCheck(idtextField.getText(), pwdField.getText())) {
					ChangePanel.mainToRegisterPanel(mf, mainPanel, new RegisterPanel(mf));
				
				}
				
				
//				ChangePanel.mainToRegisterPanel(mf, mainPanel, new RegisterPanel());
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

//	private class registerButton extends MouseAdapter{
//
//		@Override
//		public void mouseClicked(MouseEvent e) {
//
//			ChangePanel.mainToRegisterPanel(mf, mainPanel, new RegisterPanel());
//		}
//
//
//	}
}	

/* 프레임 설정 */
//				jf.getContentPane().add(panel);

//				jf.setVisible(true);					//창보이게
//				jf.setSize(1500, 800);					//사이즈
//				jf.setLocationRelativeTo(null);			//가운데서 뜬다
//				jf.setResizable(false);					//사이즈 고정
//				jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);






//public void MainPanel () {
//	
//		JPanel panel2 = new JPanel();
//	
//		add(panel2);
//		
//		
//		
//		/* 아이디 라벨 */
//		JLabel idLabel = new JLabel("아이디 : ");		// 아이디 라벨
//		idLabel.setBounds(145, 9, 110, 25);	
//		
//		
//		
//		
//		JLabel pwdLabel = new JLabel("비밀번호 : ");	// 비밀번호 라벨
//		pwdLabel.setBounds(50, 60, 110, 25);
//		
//
//		JButton registerButton = new JButton("회원가입");		// 회원가입 버튼
//		
//		JButton button2 = new JButton();					// 확인버튼
//		
//		JTextField idText = new JTextField(20);				// 아이디 입력
//		JPasswordField pwdText = new JPasswordField(20);	// 비번 입력
//		
//		
//		
//		
//		
//		
//		button2.setBounds(10, 8, 30, 25);
////		panel.setBackground(new Color(000, 051, 102));
////		panel.setSize(400,40);
//		
//		idText.setBounds(180, 60, 165, 25);
//		pwdText.setBounds(180, 100, 165, 25);
//		registerButton.setBounds(200, 300, 80, 25);
//		
////		idLabel.setForeground(Color.WHITE);
////		panel.setBackground(Color.WHITE);
//		
//		try {
//			this.setIconImage(ImageIO.read(new File("src/swing/image/coffe.jpg")));
//		} catch (IOException e1) {
//			
//			e1.printStackTrace();
//		}
//		
//		
//		// 로그인 버튼 눌렀을 때
//		loginButton.addActionListener(new ActionListener(){
//			@Override
//			public void actionPerformed(ActionEvent e) {
//			 
//				
//				
//				
//				
//			}
//		});
//	
//		// 회원가입 버튼 눌렀을 때
//		registerButton.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				
//				jf.setVisible(false);
//				RegisterPanel registerPanel = new RegisterPanel();
//				registerPanel.initialize();
//			}
//		});
//		
//		
//}	
//}		
