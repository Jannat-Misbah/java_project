package maintenance;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/maintenance?useSSL=false&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = ""; // ضع كلمة المرور الصحيحة هنا

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // استدعاء سائق MySQL
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("لم يتم العثور على سائق MySQL. تأكد من إضافة ملف الـ JAR بشكل صحيح.");
        }
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}