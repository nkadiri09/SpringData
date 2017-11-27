package org.naren.kadiri.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import org.naren.kadiri.Circle;

@Component
public class JdbcDaoImpl {

	@Autowired
	private DataSource dataSource;

	private JdbcTemplate jdbcTemplate = new JdbcTemplate();

	/*public Circle getCircle(int circleId) {
		Connection conn = null;
		try {

			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement("select * FROM circle WHERE id = ?");
			ps.setInt(1, circleId);

			Circle circle = null;
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				circle = new Circle(circleId, rs.getString("name"));
			}
			rs.close();
			rs.close();
			return circle;

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
			}
		}
		return null;
	}*/

	public int getCircleCount() {
		String sql = "SELECT COUNT(*) from CIRCLE";
		jdbcTemplate.setDataSource(getDataSurce());
		return jdbcTemplate.queryForInt(sql);
	}

	public DataSource getDataSurce() {
		return dataSource;
	}

	public void setDataSurce(DataSource dataSource) {
		this.dataSource = dataSource;
	}

}
