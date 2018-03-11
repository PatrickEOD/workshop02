package pl.workshop03.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import pl.workshop03.db.DbUtil;
import pl.workshop03.model.Users_Group;

public class Users_GroupDao {

	public static List<Users_Group> loadAllbyGroupId(Integer groupId) {
		List<Users_Group> result = new ArrayList<>();
		try (Connection conn = DbUtil.getConn()) {
			PreparedStatement stmt = conn
					.prepareStatement("SELECT id, name FROM users_group;");
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				result.add(
						new Users_Group(
								rs.getInt("id"), 
								rs.getString("name")
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
