import java.sql.*;
public class JDBC1
{
public static void main(String[] args) 
{
    String url = "jdbc:mysql://127.0.0.1:3306/Food";
    String username = "root";
    String password = "mysql@123"; 
    String query = "select * from snacks";
    try(
        Connection con = DriverManager.getConnection(url,username,password);
        Statement s = con.createStatement();
        ResultSet rs = s.executeQuery(query);) 
    {
        while(rs.next())
            {
                int s_no = rs.getInt("s_no");
                String snack = rs.getString("snack");
                int cost = rs.getInt("cost");
                System.out.println(s_no+" "+snack+" "+cost);
            }
            rs.close();
            s.close();
            con.close();    
    } catch (Exception e) 
    {
    System.out.println(e.getMessage());
    }
}
}