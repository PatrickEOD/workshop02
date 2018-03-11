package pl.workshop03.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import pl.workshop03.db.DbUtil;
import pl.workshop03.model.Users;

public class UsersDao {

	public static List<Users> loadAllbyGroupId(Integer groupId) {
		List<Users> result = new ArrayList<>();
		try (Connection conn = DbUtil.getConn()) {
			PreparedStatement stmt = conn
					.prepareStatement("SELECT id, name, mail, password, user_group_id"
							+ " FROM users WHERE user_group_id = ?;");
			stmt.setInt(1, groupId);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				result.add(
						new Users(
								rs.getInt("id"), 
								rs.getString("name"), 
								rs.getString("mail"),
								rs.getString("password"), 
								rs.getInt("user_group_id") 
								)
						);
			}
		} catch (SQLException e) {
			System.out.println("Something went wrong");
			e.printStackTrace();
		}
		return result;
	}
}
