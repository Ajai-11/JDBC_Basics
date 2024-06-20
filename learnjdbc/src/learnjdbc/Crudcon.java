package learnjdbc;
import java.sql.*;


public class Crudcon {

	public static void main(String[] args) {
		try {
			//load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//create the connection
			Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Demo", "root", "root");
			//create the statement
			//it is only for static data insertion
			Statement st=con.createStatement();
			String sql="insert into employee values(100, 'Ajai', 'Karur', 56600, 'Admin')";
			//execute
			int result=st.executeUpdate(sql);
			//close the connection
			con.close();
			System.out.println(result + " no of rows inserted...");
		} catch (ClassNotFoundException e) {
						e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

	}

}
