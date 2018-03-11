package pl.workshop03.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import pl.workshop03.db.DbUtil;
import pl.workshop03.model.Solutions;

public class SolutionsDao {

	public static List<Solutions> loadAll(Integer limit) {
		List<Solutions> result = new ArrayList<>();
		try (Connection conn = DbUtil.getConn()) {
			PreparedStatement stmt = conn
					.prepareStatement("SELECT id, created, updated, description, exercise_id, user_id"
							+ " FROM solutions ORDER BY	created DESC LIMIT ?;");
			stmt.setInt(1, limit);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				result.add(
						new Solutions(
								rs.getInt("id"), 
								rs.getDate("created"), 
								rs.getDate("updated"),
								rs.getString("description"), 
								rs.getInt("exercise_id"), 
								rs.getInt("user_id")
								)
						);
			}
		} catch (SQLException e) {
			System.out.println("Something went wrong");
			e.printStackTrace();
		}
		return result;
	}

	public static Solutions loadById(int solutionId) {
		try (Connection conn = DbUtil.getConn()) {
			PreparedStatement stmt = conn
					.prepareStatement("SELECT id, created, updated, description, exercise_id, user_id"
							+ " FROM solutions WHERE id = ?;");
			stmt.setInt(1, solutionId);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
						return new Solutions(
								rs.getInt("id"), 
								rs.getDate("created"), 
								rs.getDate("updated"),
								rs.getString("description"), 
								rs.getInt("exercise_id"), 
								rs.getInt("user_id")
								);
			}
		} catch (SQLException e) {
			System.out.println("Something went wrong");
			e.printStackTrace();
		}
		return null;
	}
}
