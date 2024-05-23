package Percobaan_6;

public class ThrowExample {
    static void demo()
    {
    NullPointerException t;
    t=new NullPointerException("Coba Throw");
    throw t;
    // Baris ini tidak lagi di kerjakan
    // System.out.println("ini tidak lagi di cetak");
    }
    public static void main(String[] args) {
        try {
            demo();
            System.out.println("Selesai");
        } catch (Exception e) {
            System.out.println("Ada Pesan Error: "+e);
        }
    }
}
