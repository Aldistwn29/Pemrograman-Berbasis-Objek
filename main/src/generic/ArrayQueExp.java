package generic;

import java.util.ArrayDeque;

public class ArrayQueExp {
    public static void main(String[] args) {
        // Membuat objek arrayque dengn type data String
        ArrayDeque<String> binatang = new ArrayDeque<>();
        binatang.add("kambing");
        binatang.add("Ayam");
        binatang.add("Bebek");

        String frist = binatang.removeFirst();
        String last = binatang.removeLast();
        System.out.println("Frist: " + frist + " Last :" + last);
    }
}
