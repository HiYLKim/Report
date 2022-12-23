package pack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


	
public class DBConnect{
	private Connection conn = null;
	
	public DBConnect() {
		String driver = "org.mariadb.jdbc.Driver";
		String DB_IP = "localhost";
		String DB_PORT = "3306";
		String DB_NAME = "db01";
		String DB_URL = "jdbc:mariadb://" + DB_IP + ":" + DB_PORT + "/" +DB_NAME;
		String DB_user = "root";
		String DB_pwd = "root";
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(DB_URL, DB_user, DB_pwd);
			System.out.println("DB접속 성공");
		} catch(ClassNotFoundException e) {
			System.out.println("드라이버 로드실퍠");
			e.printStackTrace();
		} catch(SQLException e) {
			System.out.println("DB접속 실퍠");
			e.printStackTrace();
		}
				
	}
	
	public Connection getConnecction() {
		return conn;
	}
	

}