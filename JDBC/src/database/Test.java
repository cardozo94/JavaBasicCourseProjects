package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test {

	public static void main(String[] args) {
		
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto_jsp", "root", "MySQLP@ss2022");

			PreparedStatement stmt = conn.prepareStatement("SELECT * FROM usuarios WHERE usuario=? AND contrasena=?",//);
	 		ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			stmt.setString(1, "camcar");
			stmt.setString(2, "123456789");
			ResultSet rs = stmt.executeQuery();
			if(rs.absolute(1)) {
				System.out.println("ok");
			}else {
				System.out.println("bad");
			}
//			if(rs.next()){
//				System.out.println("ok");}
//			else{System.out.println("bad");}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
