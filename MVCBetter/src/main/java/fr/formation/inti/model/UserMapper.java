package fr.formation.inti.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class UserMapper implements RowMapper<User2> {

	@Override
	public User2 mapRow(ResultSet rs, int rowNum) throws SQLException {
		String email = rs.getString("email");
        String password = rs.getString("Password");
		return new User2(email, password);
	}

}
