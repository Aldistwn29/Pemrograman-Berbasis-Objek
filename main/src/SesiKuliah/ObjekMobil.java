package SesiKuliah;

public class ObjekMobil {
    public static void main(String[] args) {
        // Menggunakan prameter
        // Mobil mobilku = new Mobil("avanza", 200, 0);
        
        // tidak menggunakan prameter
           Mobil mobilku = new Mobil();
           mobilku.setMerk("Honda");
           mobilku.setHargaKecepatan(200, 0);
        
        // Menggunakan parameter
        // Mobil mobilmu = new Mobil("Inova", 300, 5);
        
        // tidak menggunakan prameter
           Mobil mobilmu = new Mobil();
           mobilmu.setMerk("Ertiga");
           mobilmu.setHargaKecepatan(300, 5);
        
           mobilku.infoMobil();
           mobilmu.infoMobil();

          MobilDisel mobil = new MobilDisel("Pajero", 200, 0, "Solar" );
          mobil.infoMobilDissel();
          
          MobilBensin honda = new MobilBensin("Honda", 400, 5, "bensin");
          honda.infoMobilBensin();
        
    }
}
