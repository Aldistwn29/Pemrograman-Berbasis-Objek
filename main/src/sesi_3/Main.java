package sesi_3;

import java.util.ArrayList;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Mahasiswa[] mahasiswa= new Mahasiswa[4];
        int jumlahMahasiswa = 0;
        

        mahasiswa[jumlahMahasiswa]= new Mahasiswa();
        mahasiswa[jumlahMahasiswa].setNama("Budi");
        mahasiswa[jumlahMahasiswa].setNim("1102020");
        mahasiswa[jumlahMahasiswa].setNilai(80);
        mahasiswa[jumlahMahasiswa].infoMahasiswa();
        jumlahMahasiswa++;

        mahasiswa[jumlahMahasiswa]= new Mahasiswa();
        mahasiswa[jumlahMahasiswa].setNama("Aris");
        mahasiswa[jumlahMahasiswa].setNim("1102021");
        mahasiswa[jumlahMahasiswa].setNilai(79);
        mahasiswa[jumlahMahasiswa].infoMahasiswa();
        jumlahMahasiswa++;

        mahasiswa[jumlahMahasiswa]= new Mahasiswa();
        mahasiswa[jumlahMahasiswa].setNama("Fahmi");
        mahasiswa[jumlahMahasiswa].setNim("1102022");
        mahasiswa[jumlahMahasiswa].setNilai(90);
        mahasiswa[jumlahMahasiswa].infoMahasiswa();
        jumlahMahasiswa++;

        mahasiswa[jumlahMahasiswa]= new Mahasiswa();
        mahasiswa[jumlahMahasiswa].setNama("Budi");
        mahasiswa[jumlahMahasiswa].setNim("1102023");
        mahasiswa[jumlahMahasiswa].setNilai(50);
        mahasiswa[jumlahMahasiswa].infoMahasiswa();
        jumlahMahasiswa++;

        System.out.println("Jumlah mahasiswa :" + jumlahMahasiswa);
        
        // Memanggil metode getNamaLulus untuk mendapatkan nama-nama yang lulus
        Mahasiswa m = new Mahasiswa();
        ArrayList<String> namaLulus = m.getNamaLulus(mahasiswa);
        
        
        // Menampilkan nama-nama yang lulus
        System.out.println("Nama Mahasiswa yang Lulus:");
        for (String nama : namaLulus) {
            System.out.println(nama);
        }
    }
}




