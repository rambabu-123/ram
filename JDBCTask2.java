package connections;
import java.sql.*;
 import java.util.Scanner;
 public class JDBCTask2{
		static int disp(int n) throws Exception{
			Scanner scan = new Scanner(System.in);
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/ramdb";
			String username ="root";
			String password = "Ram@123";
			Connection con = DriverManager.getConnection(url, username, password);
			Statement st = con.createStatement();
			char c=' ';
			while(c != 'n') {
			int eid = 0, esal = 0;

			if(n==1) {
			System.out.println("insert:");
			PreparedStatement ps = con.prepareStatement("insert into employe values(?,?,?)");
			System.out.println("Enter eid:");
			eid = scan.nextInt();
			System.out.println("Enter ename:");
			scan.nextLine();
			String ename = scan.nextLine();
			System.out.println("Enter esal:");			
			esal = scan.nextInt();
			ps.setInt(1, eid);
			ps.setString(2, ename);
			ps.setInt(3, esal);
			ps.executeUpdate();}
			else if(n == 2) {
				PreparedStatement x = con.prepareStatement("update employe set sal = ?  where eid = ?");
				System.out.println("esal");
				esal = scan.nextInt();
				System.out.println("eid");
				eid = scan.nextInt();		
				x.setInt(1,esal);
				x.setInt(2,eid);
				x.executeUpdate();

			}
			else if(n==4) {

				ResultSet rs = st.executeQuery("select *from employe");	
				while(rs.next())
					System.out.println(rs.getInt(1)+" "+rs.getString("ename")+" "+rs.getInt(3));
			}
			else if(n==3) {
				PreparedStatement x = con.prepareStatement("delete from employe where eid = ?");
				System.out.println("Enter eid:");
				eid = scan.nextInt();
				x.setInt(1, eid);
				x.executeUpdate();
			}
			System.out.println("Enter y/n");
			c = scan.next().charAt(0);

			}
			return 0;
		}
		void execute() throws Exception{

			System.out.println("EMPLOYEE DATABASE:");
			while(true) {
			char ch;			
			System.out.println("Enter the Choice:");
			System.out.println("1.Insert\n2.Update\n3.Delete\n4.Select\n5.Exit");
			Scanner scan = new Scanner(System.in);
			ch = scan.next().charAt(0);
			switch(ch) {

			case '1':
				disp(1);
				break;
			case '2':
				disp(2);
				System.out.println("update:");
				break;
			case '3':
				disp(3);
				System.out.println("delete:");
				break;
			case '4':
				disp(4);
				System.out.println("select:");
				break;      
			}
			if(ch == '5')
				break;

			}
		}

		public static void main(String[] args)  throws Exception {
			// TODO Auto-generated method stub
			new JDBCTask2().execute();

		}

	}

	 