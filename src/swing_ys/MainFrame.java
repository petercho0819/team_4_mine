package swing_ys;

import javax.swing.JFrame;

public class MainFrame extends JFrame{
	
	public MainFrame() {


		this.setBounds(150, 50, 1200, 700);
		
		new MainPanel(this);
		
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
}
