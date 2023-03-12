import java.sql.*;

public class Execute01 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("org.postgresql.Driver");

        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/JDBC",
                "postgres",
                "Emre4344");

        Statement st = con.createStatement();
        System.out.println("Connection Success");

        ResultSet veri = st.executeQuery("select * from ogrenciler");

        while(veri.next()){

            System.out.println(veri.getInt(1)
                    +" / "+veri.getString(2)
                    +" /"+veri.getString(3)
                    +"/ "+veri.getString(4)
                    );
//
        }
//


    }
}
