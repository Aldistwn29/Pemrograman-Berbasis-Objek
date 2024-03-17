package Aritmatic;

public class Penjumlahan {
    public static void main(String[] args) {
        Aritmatic ar = new Aritmatic();
        ar.SetXY(50, 10);
        

        int hasil = ar.addNumbers();
        System.out.println(hasil);

        //////

        Aritmatic ar2 = new Aritmatic(7, 3);
        int hasil2 = ar2.addNumbers();
        System.out.println(hasil2);

        ///

        System.out.println(ar.addNumbers(10,10));
        System.out.println(ar.addNumbers(10.2,10.1));
        
        System.out.println(ar2);
        System.out.println(ar);
    }
}
