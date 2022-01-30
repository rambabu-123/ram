package ram;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection {

	public static void main(String[] args) throws ClassNotFoundException{
		Class.forName("com.mysql.jdbc.driver");
		String url="jdbc:mysql//:localhost:3306//ramdb";
		String username="root";
		String password="Ram@123";
		Connection connection=DriverManager.getconnection(url,username,password);
		if(connection!=null)
			System.out.println("connection established");
		
	}

}
