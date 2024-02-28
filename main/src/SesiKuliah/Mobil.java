package SesiKuliah;

public class Mobil {
    String merk;
    int harga, kecepatan;
    
    /*
    * Konstruktor 
    * method yg namanya = nama class
    * tidak boleh menggunakan void
    * tidak boleh ada return
    * Dijalankan hanya 1x
    * digunakan untuk inisialisasi
    */
    Mobil(String merk, int harga, int kecepatan){
        this.merk= merk;
        this.harga= harga;
        this.kecepatan= kecepatan;
    }
    
    Mobil(){
        
    }
    
    void setMerk(String brand){
        merk = brand;
    }
    
    void setHargaKecepatan(int harga, int kecepatan){
        this.harga = harga;
        this.kecepatan = kecepatan;
    }
    
    String getMerk(){
        return merk;
    }
    
    int getHarga(){
        return harga;
    } 
    
    int getKecepatan(){
        return kecepatan;
    }
    void infoMobil(){
        System.out.println("Merek Mobil:" + getMerk());
        System.out.println("Harga mobil: " + getHarga());
        System.out.println("Kecepatan:" + getKecepatan());
        System.out.println("==========================");
    }
    
}

