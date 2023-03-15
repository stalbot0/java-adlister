package com.codeup.adlister.dao;

import com.codeup.adlister.models.Ad;
import com.codeup.adlister.models.User;
import com.mysql.cj.jdbc.Driver;

import java.sql.*;

public class MySQLUsersDao implements Users {
    private Connection connection = null;
    public MySQLUsersDao(Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                config.getUrl(),
                config.getUser(),
                config.getPassword()
            );
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database!", e);
        }
    }

    public User findByUsername(String username) {
        try {
            String findQry = "SELECT * FROM users WHERE name = ?";
            PreparedStatement statement = connection.prepareStatement(findQry);
            statement.setString(1, username);
            ResultSet rs = statement.executeQuery();
            rs.next();
            User user = extractUser(rs);
            return user;
        } catch (SQLException e) {
            throw new RuntimeException("error finding a user", e);
        }
    }

    public Long insert(User user) {
        try {
            String insertQry = "INSERT INTO users(name, email, password) VALUES (?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(insertQry, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, user.getUsername());
            statement.setString(2, user.getEmail());
            statement.setString(3, user.getPassword());

            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();
            rs.next();
            return rs.getLong(1);
        } catch (SQLException e) {
            throw new RuntimeException("Error registering a new user.", e);
        }
    }

    private User extractUser(ResultSet rs) throws SQLException {
        return new User(
                rs.getLong("id"),
                rs.getString("name"),
                rs.getString("email"),
                rs.getString("password")
        );
    }
}
