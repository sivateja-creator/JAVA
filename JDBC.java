import java.sql.*;

public class JDBC {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/Foods";
        String username = "root";
        String password = "mysql@123";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, username, password);

            Statement s = con.createStatement();

            String query = "select * from snacks";

            ResultSet rs = s.executeQuery(query);

            while (rs.next()) {
                int s_no = rs.getInt("s_no");
                String snack = rs.getString("snack");
                int cost = rs.getInt("cost");

                System.out.println(s_no + " " + snack + " " + cost);
            }

            rs.close();
            s.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}