package Polimorpysme;


public class Main {
    public static void main(String[] args) {
        System.out.println("\n overloading \n");
        Overloading a = new Overloading();
        a.hewan("singa");
        a.hewan("Lumba-Lumba","laut");
        a.hewan("Gajah", "savana");
        a.hewan("Harimau","hutan");

        System.out.println("\n overidding \n");
        Overidding hewan2 = new Kangguru();
        hewan2.mamalia();
    }
}
