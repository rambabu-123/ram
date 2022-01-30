package connections;
import java.sql.*;
public class ConnectionDemo {
	public static void main(String[] args) throws Exception{
	Class.forName("com.mysql.cj.jdbc.Driver");
	String url = "jdbc:mysql://localhost:3306/ramdb";
	String username ="root";
	String password = "Ram@123";
	Connection con = DriverManager.getConnection(url, username, password);
	if(con!=null)
	   System.out.println("connection established");	
	
	Statement st = con.createStatement();
	int i = st.executeUpdate("insert into employe values(4,'michale',3490,'hyd')");
	if(i != 0)
		System.out.print("Record Inserted!!");	
	
	}

}
