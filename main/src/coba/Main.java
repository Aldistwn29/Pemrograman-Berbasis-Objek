package coba;

public class Main {
    public static void main(String[] args) {
        Mahasiswa[] mahasiswa = new Mahasiswa[4];
        int jumlahMahasiswa = 0;
        int totalNilai = 0;

        // Inisialisasi data mahasiswa
        mahasiswa[jumlahMahasiswa] = new Mahasiswa("Budi", "1102020", 80);
        totalNilai += mahasiswa[jumlahMahasiswa].getNilai();
        jumlahMahasiswa++;

        mahasiswa[jumlahMahasiswa] = new Mahasiswa("Aris", "1102021", 79);
        totalNilai += mahasiswa[jumlahMahasiswa].getNilai();
        jumlahMahasiswa++;

        mahasiswa[jumlahMahasiswa] = new Mahasiswa("Fahmi", "1102022", 90);
        totalNilai += mahasiswa[jumlahMahasiswa].getNilai();
        jumlahMahasiswa++;

        mahasiswa[jumlahMahasiswa] = new Mahasiswa("Cahyo", "1102023", 50);
        totalNilai += mahasiswa[jumlahMahasiswa].getNilai();
        jumlahMahasiswa++;

        // Menampilkan jumlah mahasiswa
        System.out.println("Jumlah mahasiswa: " + jumlahMahasiswa);

        // Menampilkan mahasiswa yang lulus
        int jumlahLulus = 0;
        String namaLulus = "";

        for (Mahasiswa m : mahasiswa) {
            if (m.lulus()) {
                jumlahLulus++;
                namaLulus += (jumlahLulus > 1 ? ", " : "") + m.getNama();
            }
        }
        System.out.println("Jumlah mahasiswa yang lulus: " + jumlahLulus + " yaitu " + namaLulus);

        // Menampilkan mahasiswa yang tidak lulus
        int jumlahTidakLulus = 0;
        String namaTidakLulus = "";

        for (Mahasiswa t : mahasiswa) {
            if (!t.lulus()) {
                jumlahTidakLulus++;
                namaTidakLulus += (jumlahTidakLulus > 1 ? ", " : "") + t.getNama();
            }
        }
        System.out.println("Jumlah mahasiswa tidak lulus: " + jumlahTidakLulus + " yaitu " + namaTidakLulus);

        // Menampilkan mahasiswa dengan nilai A
        int jumlahNilaiA = 0;
        String namaNilaiA = "";

        for (Mahasiswa a : mahasiswa) {
            if (a.grade().equals("A")) {
                jumlahNilaiA++;
                namaNilaiA += (jumlahNilaiA > 1 ? ", " : "") + a.getNama();
            }
        }
        System.out.println("Mahasiswa dengan nilai A = " + jumlahNilaiA + " yaitu " + namaNilaiA);

        // Menghitung dan menampilkan rata-rata nilai mahasiswa
        double rataNilai = (double) totalNilai / jumlahMahasiswa;
        System.out.println("Rata-rata nilai mahasiswa adalah: " + rataNilai);
    }
}