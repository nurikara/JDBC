import java.sql.*;

public class Execute03 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");

        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/JDBC",
                "postgres",
                "Emre4344");

        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("Select * from ogrenciler" );

        ResultSetMetaData rsmd =rs.getMetaData();
        System.out.println("1. sutunun ismi " + rsmd.getCatalogName(1));
        System.out.println("2. sutunun ismi " + rsmd.getCatalogName(2));
        System.out.println("3. sutunun ismi " + rsmd.getCatalogName(3));
        System.out.println("4. sutunun ismi " + rsmd.getCatalogName(4));

        System.out.println("Tablo ismi " + rsmd.getTableName(4));

        System.out.println("Degiskenler " + rsmd.getColumnTypeName(1));


    }


}
