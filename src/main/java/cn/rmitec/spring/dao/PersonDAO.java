package cn.rmitec.spring.dao;


import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonDAO {
	
	@Autowired
	private DataSource dataSource;
	
	public int update() {
		Statement statement;
		try {
			Connection connection = dataSource.getConnection();
			statement = connection.createStatement();
			statement.executeUpdate(" update ta_unit_test t set t.unit = 101011 where id = 34106 ");
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
}
