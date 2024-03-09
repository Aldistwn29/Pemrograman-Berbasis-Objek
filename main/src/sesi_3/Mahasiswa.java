package sesi_3;

public class Mahasiswa {
    String nama, nim;
    int nilai;

    Mahasiswa(){

    }

    void setNama(String namaMahasiswa){
        nama = namaMahasiswa;
    }

    void setNim(String nimMahasiswa){
        nim = nimMahasiswa;
    }

    void setNilai(int nilai){
        this.nilai = nilai;
    }

    String getNama() {
        return nama;
    }

    String getNim() {
        return nim;
    }

    int getNilai(){
        return nilai;
    }

    boolean lulus() {
        return getNilai() >= 60;
    }

    boolean tidakLulus() {
        return getNilai() < 60;
    }

    String grade(int nilai){
        if(nilai >= 80){
            return "A";
        }else if(nilai >= 70){
            return "B";
        }else if(nilai >= 60){
            return "C";
        }else if(nilai >= 50){
            return "D";
        }else if(nilai < 50){
            return "E";
        }else{
            return "Input nilai anda salah";
        }
    }

    void infoMahasiswa(){
        System.out.println("Nim : "  + getNim());
        System.out.println("Nama : " + getNama());
        System.out.println("Nilai : " + getNilai());
        System.out.println("Grade: " + grade(getNilai()));
        System.out.println("=============================");
    }

}
