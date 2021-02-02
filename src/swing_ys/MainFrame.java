package swing_ys;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MainFrame extends JFrame{
	
	public MainFrame() {


		/* 프레임 크기 고정 */
		this.setBounds(150, 50, 1200, 700);
		
		/* 메인 패널 실행 */
		new MainPanel(this);
		

		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
}
