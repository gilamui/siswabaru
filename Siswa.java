//object class
public class Siswa {
    private int id;
    private String nama;
    private double ipk;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getIpk() {
        return this.ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    //Constructor
    //nama harus sama dengan Class
    public Siswa(){
        id = 0;
        nama = "kosong";
        ipk = 0.0;
    }
    
    //Constructor Parameter
    public Siswa(int id, String nama, double ipk) {
        //variabel = parameter
        this.id = id;
        this.nama = nama;
        this.ipk = ipk;
    }

    //method print
    public void print() {
        System.out.println("ID : "+id);
        System.out.println("Nama : "+nama);
        System.out.println("IPK : "+ipk);
    }
}