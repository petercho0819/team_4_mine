package insik;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JPasswordField;

public class Mypage extends JPanel{

	private JFrame frame;
	private MainFrame mf;
	private Mypage mp;
	
	
	public  Mypage (MainFrame mf) {
		this.mf = mf;
		this.mp = this;
		this.setLayout(null);
		this.setSize(1000,700);

		/* 아이디 라벨 */
		JLabel idlLabel = new JLabel("마이페이지 화면");
		idlLabel.setHorizontalAlignment(SwingConstants.CENTER);
		idlLabel.setFont(new Font("굴림", Font.PLAIN, 19));
		idlLabel.setBounds(295, 252, 285, 45);	
		
		this.add(idlLabel);
		
//		mf.add(Mypage);			
	}
}
