package pack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OjdbcApp {

	private String driver = "org.mariadb.jdbc.Driver";
	private String DB_URL = "jdbc:mariadb://localhost:3306/db01";
	private String DB_user = "root";
	private String DB_pwd = "root";
	
	Connection conn =null ;
	Statement stm =null ;
	ResultSet rs =null ;
		
	public Connection getConnection() {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(DB_URL, DB_user, DB_pwd);
			
					
			} catch(ClassNotFoundException ex) {
				
			} catch(SQLException ex) {
				
			}
		return conn;
	}	
	public void printAcc() {
		int count=0;
		try {
			conn = getConnection();			
			stm = conn.createStatement(); 
			rs = stm.executeQuery("select * from acc");
			System.out.println(rs);
				while(rs.next()) {
					count++;
	
					System.out.print(count+" ");
					System.out.print(rs.getString(1)+" ");
					System.out.print(rs.getString(2)+" ");
					System.out.println(rs.getString(3));
				}	
		}
			catch(SQLException ex) {
			} 
		}
		public static void main(String[] args) {
			OjdbcApp aa = new OjdbcApp();
			aa.printAcc();
	}
}