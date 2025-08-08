import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertEmployeeData {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/task9";
        String user = "root";
        String password = "Sheril@123";

        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish Connection
            Connection connection = DriverManager.getConnection(url, user, password);

            // Prepare SQL Insert Statement
            String sql = "INSERT INTO employee (empcode, empname, empage, esalary) VALUES (?, ?, ?, ?)";
            PreparedStatement pstmt = connection.prepareStatement(sql);

            // Insert Row 1
            pstmt.setInt(1, 101);
            pstmt.setString(2, "Jenny");
            pstmt.setInt(3, 25);
            pstmt.setDouble(4, 10000);
            pstmt.executeUpdate();

            // Row 2
            pstmt.setInt(1, 102);
            pstmt.setString(2, "Jacky");
            pstmt.setInt(3, 30);
            pstmt.setDouble(4, 20000);
            pstmt.executeUpdate();

            // Row 3
            pstmt.setInt(1, 103);
            pstmt.setString(2, "Joe");
            pstmt.setInt(3, 20);
            pstmt.setDouble(4, 40000);
            pstmt.executeUpdate();

            // Row 4
            pstmt.setInt(1, 104);
            pstmt.setString(2, "John");
            pstmt.setInt(3, 40);
            pstmt.setDouble(4, 80000);
            pstmt.executeUpdate();

            // Row 5
            pstmt.setInt(1, 105);
            pstmt.setString(2, "Shameer");
            pstmt.setInt(3, 25);
            pstmt.setDouble(4, 90000);
            pstmt.executeUpdate();

            System.out.println("Data inserted successfully!");

            // Close resources
            pstmt.close();
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
