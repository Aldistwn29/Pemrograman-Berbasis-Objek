package Encapsution;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input data mahasiswa
        System.out.println("Masukkan nama mahasiswa: ");
        String namaMahasiswa = scanner.nextLine();
        System.out.println("Masukkan alamat mahasiswa: ");
        String alamatMahasiswa = scanner.nextLine();
        Person biodata  = new Person(namaMahasiswa, alamatMahasiswa);
        System.out.println(biodata);
    }
}
