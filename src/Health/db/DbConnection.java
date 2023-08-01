package Health.db;

import java.sql.Connection;
import java.sql.DriverManager;


public class DbConnection {
	static Connection con;
	public static Connection getConnection() 
		{	
			try 
			{
				//load the driver
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				//create the Connection
				String user = "root"; 
				String password = "sriharikr6123"; 
				String url = "jdbc:mysql://localhost:3306/health";
				con = DriverManager.getConnection(url,user,password);
			}
			catch(Exception e) 
			{
				e.printStackTrace();
			}
			return con;
		}
}
