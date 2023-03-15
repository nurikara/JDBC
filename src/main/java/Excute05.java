import java.sql.*;

public class Excute05 {


    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");

        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/JDBC", "postgres", "Emre4344");

        //Statement st = con.createStatement();
        //st.executeUpdate("insert into ogrenciler values (800, 'Ali Can', 11, 'E')");

        PreparedStatement ps = con.prepareStatement("insert into ogrenciler values (?, ?, ?, ?)");
        ps.setInt(1, 871);
        ps.setString(2, "Ali Can");
        ps.setInt(3, 11);
        ps.setString(4, "E");
        ps.executeUpdate();

        ps.close();
        con.close();
    }
}
