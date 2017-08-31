package day26.com.automationtesting.dbtesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReadDbData {

	public static void main(String[] args) throws SQLException {

		Connection con = null;
		String dbUrl = "jdbc:mysql://localhost:3306/automationtesting?useSSL=true";
		String driver = "com.mysql.cj.jdbc.Driver";
		String userName = "root";
		String passWord = "root";

		try {
			Class.forName(driver).newInstance();
			con = DriverManager.getConnection(dbUrl, userName, passWord);

			/*
			 * Statement st = con.createStatement(); ResultSet rs =
			 * st.executeQuery("select * from credentials");
			 * 
			 * while (rs.next()) { System.out.println(rs.getString("UserName") + "---" +
			 * rs.getString("PassWord") + "---" + rs.getString("DateCreated") + "---" +
			 * rs.getString("NoOfAttempts") + "---" + rs.getString("Result")); }
			 */

			PreparedStatement ps = con.prepareStatement("Select * from credentials where UserName=? and Result=?");
			ps.setString(1, "BaseUser");
			ps.setString(2, "Fail");
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				System.out.println(rs.getString("UserName") + "---" + rs.getString("PassWord") + "---"
						+ rs.getString("DateCreated") + "---" + rs.getString("NoOfAttempts") + "---"
						+ rs.getString("Result"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		}
	}
}
