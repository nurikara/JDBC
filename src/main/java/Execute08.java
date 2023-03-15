import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Execute08 {

    public static <Doctor> void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("org.postgresql.Driver");

        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/JDBC",
                "postgres", "Emre4344");
        Statement st = con.createStatement();

//        String sql01 = "create table doctors (id int, isim varchar(30),bolum varchar(20),ucret int)" ;
//
//        st.execute(sql01);



        List<Doctors> kayitlar=new ArrayList<>();
        kayitlar.add(new Doctors(20,"Ali Can","Cildiye",500));
        kayitlar.add(new Doctors(21,"sibel bilen","psikiyatri",800));
        kayitlar.add(new Doctors(22,"serhat guler","ruh sagligi",700));
        kayitlar.add(new Doctors(23,"hediye keskin","noroloji",100));
        kayitlar.add(new Doctors(24,"veli han","kbb",400));
        kayitlar.add(new Doctors(25,"ali han","dermotoloji",500));
        kayitlar.add(new Doctors(26,"hakan bal","ortodonti",500));
        kayitlar.add(new Doctors(27,"Ali Can","Cildiye",500));
        kayitlar.add(new Doctors(28,"Ali Can","Cildiye",500));

        PreparedStatement data = con.prepareStatement("insert into doctors values(?, ?, ?, ?)");

        for(Doctors each: kayitlar){
            data.setInt(1, each.getId());
            data.setString(2, each.getName());
            data.setString(3, each.getBolum());
            data.setDouble(4, each.getUcret());
            data.addBatch();    //Dataları bir araya getirir
        }
        data.executeBatch();
        con.close();
        data.close();
    }
}
