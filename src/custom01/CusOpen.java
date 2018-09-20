package custom01;

import java.sql.*;
public class CusOpen {
	public Connection getConnection() {
		Connection con = null;
		String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver"; 
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		String id = "system";
		String passwd= "1234";
		
		try {
			Class.forName(JDBC_DRIVER);
			con = DriverManager.getConnection(url,id,passwd);
			
		}catch(ClassNotFoundException e) {
			System.out.println("oracle jdbc driver Not Found");
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
}
