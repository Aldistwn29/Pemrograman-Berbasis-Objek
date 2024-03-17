package Polimorpysme;

public class Overloading {
    
    public void hewan() {
        System.out.println("Kumpulan hewan mamalia");
    }

    // metode overloading
    public void hewan(String nama){
        System.out.println(nama + ": Merupakan hewan Mamalia");
    }

    public void hewan(String nama, String habitat){
        System.out.println(nama + ": Merupakan hewan Mamalia");
        System.out.println("Habitatnya di" + habitat);
    }
}
