package sesi_3;


public class Main {
    public static void main(String[] args) {
        Mahasiswa[] mahasiswa= new Mahasiswa[4];
        int jumlahMahasiswa = 0;
        int totalNilai = 0;
        

        mahasiswa[jumlahMahasiswa]= new Mahasiswa();
        mahasiswa[jumlahMahasiswa].setNama("Budi");
        mahasiswa[jumlahMahasiswa].setNim("1102020");
        mahasiswa[jumlahMahasiswa].setNilai(80);
        mahasiswa[jumlahMahasiswa].infoMahasiswa();
        totalNilai += mahasiswa[jumlahMahasiswa].getNilai();
        jumlahMahasiswa++;

        mahasiswa[jumlahMahasiswa]= new Mahasiswa();
        mahasiswa[jumlahMahasiswa].setNama("Aris");
        mahasiswa[jumlahMahasiswa].setNim("1102021");
        mahasiswa[jumlahMahasiswa].setNilai(79);
        mahasiswa[jumlahMahasiswa].infoMahasiswa();
        totalNilai += mahasiswa[jumlahMahasiswa].getNilai();
        jumlahMahasiswa++;

        mahasiswa[jumlahMahasiswa]= new Mahasiswa();
        mahasiswa[jumlahMahasiswa].setNama("Fahmi");
        mahasiswa[jumlahMahasiswa].setNim("1102022");
        mahasiswa[jumlahMahasiswa].setNilai(90);
        mahasiswa[jumlahMahasiswa].infoMahasiswa();
        totalNilai += mahasiswa[jumlahMahasiswa].getNilai();
        jumlahMahasiswa++;

        mahasiswa[jumlahMahasiswa]= new Mahasiswa();
        mahasiswa[jumlahMahasiswa].setNama("Cahyo");
        mahasiswa[jumlahMahasiswa].setNim("1102023");
        mahasiswa[jumlahMahasiswa].setNilai(50);
        mahasiswa[jumlahMahasiswa].infoMahasiswa();
        totalNilai += mahasiswa[jumlahMahasiswa].getNilai();
        jumlahMahasiswa++;

        System.out.println("Jumlah mahasiswa :" + jumlahMahasiswa);

        int jumlahLulus = 0;
        String namaLulus = "";

        for (Mahasiswa m : mahasiswa) {
            if (m.lulus()) {
                jumlahLulus++;
                if (namaLulus.equals("")) {
                    namaLulus += m.getNama();
                } else {
                    namaLulus += ", " + m.getNama();
                }
            }
        }
        System.out.println("Jumlah mahasiswa yang lulus : " + jumlahLulus + " yaitu " + namaLulus);

        int jumlahTidakLulus = 0;
        String namaTidakLulus = "";

        for (Mahasiswa t : mahasiswa) {
            if (t.tidakLulus()) {
                jumlahTidakLulus++;
                if (namaTidakLulus.equals("")) {
                    namaTidakLulus += t.getNama();
                } else {
                    namaTidakLulus += ", " + t.getNama();
                }
            }
        }
        System.out.println("Jumlah mahasiswa tidak lulus: " + jumlahTidakLulus + " yaitu " + namaTidakLulus);

        int JumlahNilaiA = 0;
        String namaNilaiA = "";

        for (Mahasiswa a : mahasiswa) {
            if (a.grade(a.getNilai()).equals("A")) {
                JumlahNilaiA++;
                if (!namaNilaiA.isEmpty()) {
                    namaNilaiA += ", ";
                }
                namaNilaiA += a.getNama();
            }
        }
        System.out.println("Mahasiswa dengan nilai A = " + JumlahNilaiA + " yaitu " + namaNilaiA);

        int JumlahNilaiB = 0;
        String namaNilaiB = "";

        for (Mahasiswa b : mahasiswa) {
            if (b.grade(b.getNilai()).equals("B")) {
                JumlahNilaiB++;
                if (!namaNilaiB.isEmpty()) {
                    namaNilaiB += ", ";
                }
                namaNilaiB += b.getNama();
            }
        }
        System.out.println("Mahasiswa dengan nilai B = " + JumlahNilaiB + " yaitu " + namaNilaiB);

        
        int JumlahNilaiD = 0;
        String namaNilaiD = "";

        for (Mahasiswa d : mahasiswa) {
            if (d.grade(d.getNilai()).equals("D")) {
                JumlahNilaiD++;
                if (!namaNilaiD.isEmpty()) {
                    namaNilaiD += ", ";
                }
                namaNilaiD += d.getNama();
            }
        }
        System.out.println("Mahasiswa dengan nilai D = " + JumlahNilaiD + " yaitu " + namaNilaiD);

        double averageGrade = (double) totalNilai / jumlahMahasiswa;
        System.out.println("Rata-rata nilai mahasiswa adalah: " + averageGrade);
    }

}







