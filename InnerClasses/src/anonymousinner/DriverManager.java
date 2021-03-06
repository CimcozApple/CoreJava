package anonymousinner;

public class DriverManager {
	
	static Connection getConnection() {
		//Anonymous inner classes go inside a method
		//Anonymous Inner class with the connection interface
		/*
		 * We cannot define a constructor because an 
		 * anonymous inner class does not have a class name of its own.
		 * 
		 * Using anonymous inner classes we can implement an interface with its original identity.
         * For example, if an interface is connection, we use the same name when we implement the inner class.
		 * 
		 */
		Connection con = new Connection() {

			@Override
			public void createStatement() {
				System.out.println("Anonymous inner classes method");
			}

		};//semicolon to end the anonymous inner class
		return con;
	}
}
