package com.trail.database;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;

	public class DataBase {
	    private static final String DB_URL = "jdbc:mysql://localhost:3306/mydatabase";
	    private static final String DB_USER = "username";
	    private static final String DB_PASSWORD = "password";

	    public static Connection getConnection() throws SQLException {
	        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
	    }

	    public static void close(Connection connection, PreparedStatement preparedStatement, ResultSet resultSet) {
	        try {
	            if (resultSet != null) {
	                resultSet.close();
	            }
	            if (preparedStatement != null) {
	                preparedStatement.close();
	            }
	            if (connection != null) {
	                connection.close();
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    // Add methods for login and registration using JDBC
	    // Make use of prepared statements to avoid SQL injection
	}
	
