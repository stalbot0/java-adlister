import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads{
    private Connection connection = null;

    public MySQLAdsDao(Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    public List<Ad> all() {
        List<Ad> ads = new ArrayList<>();
        try {
            Statement stmt = connection.createStatement();
            String selectQuery = "SELECT * FROM ymir_stephen.ads;";
            ResultSet rs = stmt.executeQuery(selectQuery);

            while(rs.next()) {
                ads.add(new Ad(
                        rs.getInt("id"),
                        rs.getString("title"),
                        rs.getString("description"),
                        rs.getInt("price"),
                        rs.getInt("user_id")
                    ));
            }
            return ads;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Long insert(Ad ad) {
        try {
            Statement stmt = connection.createStatement();
            String sql = String.format("INSERT INTO ads(title, description, user_id) VALUES ('%s', '%s', '%d');", ad.getTitle(), ad.getDescription(), ad.getUserId());
            stmt.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = stmt.getGeneratedKeys();
            rs.next();
            return rs.getLong(1);
        } catch (SQLException e) {
            throw new RuntimeException("Error creating a new ad.", e);
        }
    }

}
