package coba;

class Mahasiswa {
    String nama, nim;
    int nilai;

    Mahasiswa(String nama, String nim, int nilai) {
        this.nama = nama;
        this.nim = nim;
        this.nilai = nilai;
    }

    boolean lulus() {
        return nilai >= 60;
    }

    String grade() {
        if (nilai >= 80) {
            return "A";
        } else if (nilai >= 70) {
            return "B";
        } else if (nilai >= 60) {
            return "C";
        } else if (nilai >= 50) {
            return "D";
        } else {
            return "E";
        }
    }

    String getNama() {
        return nama;
    }

    int getNilai() {
        return nilai;
    }
}