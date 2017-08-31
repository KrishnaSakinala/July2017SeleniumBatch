package day26.com.automationtesting.dbtesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class InsertData {

	public static void main(String[] args) throws SQLException {
		Connection con = null;
		String dbUrl = "jdbc:mysql://localhost:3306/automationtesting?useSSL=true";
		String driver = "com.mysql.cj.jdbc.Driver";
		String userName = "root";
		String passWord = "root";

		try {
			Class.forName(driver).newInstance();
			con = DriverManager.getConnection(dbUrl, userName, passWord);

			PreparedStatement ps = con.prepareStatement(
					"Insert into credentials(UserName,PassWord,DateCreated,NoOfAttempts,Result) values ('SeleniumUser','passW0rd','31/08/2017','5','Pass')");
			ps.executeUpdate();

			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select UserName from credentials");

			List<String> userNames = new ArrayList<String>();

			while (rs.next()) {

				userNames.add(rs.getString("UserName"));
			}

			if (userNames.contains("SeleniumUser")) {
				System.out.println("User Inserted Successfully");
			} else {
				System.out.println("User NOT Inserted Successfully");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		}

	}

}
