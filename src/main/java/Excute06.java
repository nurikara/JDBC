import pojos.Urun;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Excute06 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");

        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/JDBC", "postgres", "Emre4344");

        Statement st = con.createStatement();

//        st.execute("Create table urunler(id int , isim varchar(10),fiyat int)");

        List<Urun> kayitlar = new ArrayList<>();

        kayitlar.add(new Urun(100,"Laptop",35000));
        kayitlar.add(new Urun(101,"Laptop",35000));
        kayitlar.add(new Urun(102,"Laptop",35000));
        kayitlar.add(new Urun(103,"Laptop",35000));
        kayitlar.add(new Urun(104,"Laptop",35000));

        PreparedStatement tablo = con.prepareStatement("insert into urunler values(?,?,?)");
        for(Urun each:kayitlar){
            tablo.setInt(1, each.getId());
            tablo.setString(2, each.getName());
            tablo.setDouble(3, each.getCost());
            tablo.addBatch();
        }
        tablo.executeBatch();

        con.close();
        st.close();
        tablo.close();

    }
}
