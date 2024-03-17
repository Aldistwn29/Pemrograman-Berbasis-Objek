package Aritmatic;

class Aritmatic {
    private int x; // enskapsulasi
    private int y; // enskapsulasi

    // Constructor overloding
    Aritmatic(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    Aritmatic(){

    }

    void SetXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int addNumbers(){
        return x + y;
    }

    int addNumbers(int bil1, int bil2) {
        return bil1 + bil2;
    }

    double addNumbers(double bil1, double bil2) {
        return bil1 + bil2;
    }

    public String toString(){
        String hasil ;
        hasil = "X" + x + "-Y" + y;
        hasil += "\n Hasil Penjumlahan adalah" + addNumbers();
        return hasil;
    }
}
