import static utilities.DatabaseUtilities.*;

public class Execute07 {

    public static void main(String[] args) {
        createConnection();

        String sql01 = "select * from ogrenciler";

        System.out.println("getColumnNames(sql01) = " + getColumnNames(sql01));

        System.out.println("getColumnData(sql01,\"ogrenci_isimleri\") = " + getColumnData(sql01, "ogrenci_ismi"));
        System.out.println("getColumnData(sql01,\"okul_no\") = " + getColumnData(sql01, "okul_no"));

    }}
