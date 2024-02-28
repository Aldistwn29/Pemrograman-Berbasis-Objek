package SesiKuliah;

// Modifikasi class nama_class extends nama_super_class
public class MobilDisel extends Mobil{
    String bahan_bakar;
    
    MobilDisel(String merk, int harga, int kecepatan, String bahan_bakar){
        // dapat memanggil konstruktor 
        super(merk,harga,kecepatan);
        this.bahan_bakar = bahan_bakar;
    }
    
    void setBahanBakar(String bahan_bakar){
        this.bahan_bakar = bahan_bakar;
    }
    
    String getBahanBakar(){
        return bahan_bakar;
    }
    
    void infoMobilDissel(){
        super.infoMobil();
        System.out.println("Bahan Bakar: " + getBahanBakar());
        System.out.println("=============================");
    }
}
