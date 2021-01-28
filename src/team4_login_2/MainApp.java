package team4_login_2;

import java.io.IOException;

public class MainApp {

	public static void main(String[] args)  {
		// CRUD 중 CR 부분 create and read;
		Manager manager	= new Manager();
		try {
			manager.Run();
		} catch (Exception e) {
			
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

}
