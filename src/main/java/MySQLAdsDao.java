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
            throw new RuntimeException("error connecting to database", e);
        }
    }

    public List<Ad> all() {
        List<Ad> ads = new ArrayList<>();
        try {
            Statement stmt = connection.createStatement();
            String selectQuery = "SELECT * FROM ymir_stephen.ads";
            ResultSet rs = stmt.executeQuery(selectQuery);

            while(rs.next()) {
                ads.add(new Ad(
                        rs.getInt("id"),
                        rs.getString("title"),
                        rs.getString("description"),
                        rs.getDouble("price")
//                        rs.getObject("user")
                    ));
            }
            return ads;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
