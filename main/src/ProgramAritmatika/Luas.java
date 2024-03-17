package ProgramAritmatika;

public class Luas {
    public static void main(String[] args) {
        bangunDatar l = new bangunDatar(2);
        System.out.println( "Hasil Perhitungan luas Persegi :" + l.HitungLuas(2));

        bangunDatar l2 = new bangunDatar(1,2);
        System.out.println("Hasil Perhitungan luas Persegi : " + l2.HitungLuas(2,1));
    }
}
