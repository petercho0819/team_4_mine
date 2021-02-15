package insik;

import javax.swing.JPanel;

import swing_ys.MainFrame;

public class ChangePanel {

	
	public static void WithdrawPanelToMyPage(insik.MainFrame mf, JPanel withdrawPanel, JPanel panel20) {
		
		
		mf.remove(withdrawPanel);
		mf.add(panel20);
		mf.repaint();
		
	}

	

	
	
	
	
	
	
	
	
}
