package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {

    private static String url = "jdbc:mysql://localhost:3306/webapp";
    private static String user = "root";
    private static String pass = ""; // sửa lại nếu bạn có mật khẩu

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
