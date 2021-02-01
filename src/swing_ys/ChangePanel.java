package swing_ys;

import javax.swing.JPanel;

public class ChangePanel {
	
	public static void mainToRegisterPanel(MainFrame mf, JPanel main, JPanel register) {
		
		
		mf.remove(main);
		mf.add(register);
		mf.repaint();
		
	}
	
	public static void registerToMain (MainFrame mf, JPanel register, JPanel main) {
		mf.remove(register);
		mf.add(main);
		mf.repaint();
		
	}

	public static void mainToManagerPanel(MainFrame mf, JPanel mainPanel, JPanel Manager) {
		// TODO Auto-generated method stub
		
		mf.remove(mainPanel);
		mf.add(Manager);
		mf.repaint();
	}

}
