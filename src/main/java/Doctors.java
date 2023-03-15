public class Doctors {


    private  int id;
    private String name;
    private String bolum;
    private double ucret;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public double getUcret() {
        return ucret;
    }

    public void setUcret(double ucret) {
        this.ucret = ucret;
    }

    public Doctors(int id, String name, String bolum, double ucret) {
        this.id = id;
        this.name = name;
        this.bolum = bolum;
        this.ucret = ucret;
    }

    @Override
    public String toString() {
        return "Doctors{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", bolum='" + bolum + '\'' +
                ", ucret=" + ucret +
                '}';
    }
}
