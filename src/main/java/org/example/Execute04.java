package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Execute04 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");

        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/JDBC", "postgres", "Emre4344");

        Statement st = con.createStatement();

//        String sql01 = "insert into ogrenciler values (523,'Nuri Kara',45,'E')";
//        String sql02 = "insert into ogrenciler values (522,'Nuri Kara',45,'E')";
//
//        st.executeUpdate(sql01);
//        st.executeUpdate(sql02);

        String[] veri = {"insert into ogrenciler values (525,'Nuri Kara',45,'E')",
                "insert into ogrenciler values (526,'Nuri Kara',45,'E')",
                "insert into ogrenciler values (527,'Nuri Kara',45,'E')"};

        for(String each:veri){
            st.executeUpdate(each);


        }


    }
}
