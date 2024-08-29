//Driver class
import java.util.Scanner;
public class SiswaTester {
    public static void main(String[] args) {
        System.out.println("Inputkan Nama Siswa");
        Scanner input = new Scanner(System.in);
        String nama = input.nextLine();
        System.out.println("Inputkan ID Siswa");
        int id = input.nextInt();
        System.out.println("Inputkan IPK Siswa");
        double ipk = input.nextDouble();

        Siswa averil = new Siswa(id, nama, ipk);
        averil.print();
        // object
        // Class object = new constructor
        Siswa lam = new Siswa(19, "gilam", 100);
        Siswa zam = new Siswa(22, "azzam", 100);
        Siswa nibras = new Siswa(29, "ibra", 100);
        Siswa gus = new Siswa(26, "burhan", 100);
        Siswa meno = new Siswa(24, "moreno", 100);
        Siswa tegar = new Siswa(16, "tegar", 100);

        lam.print();
        zam.print();
        nibras.print();
        gus.print();
        meno.print();
        tegar.print();
        input.close();
    }
}