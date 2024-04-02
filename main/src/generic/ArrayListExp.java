package generic;

import java.util.ArrayList;

public class ArrayListExp {
    public static void main(String[] args) {
        // membuat objek array list dgn type data Integer
        ArrayList <Integer> numbers = new ArrayList<>();

        // perulangan
        int n = 10;
        for(int i = 1; i <= n; i++){
            numbers.add(i);
        }

        // mencetak Array list
        System.out.println(numbers);
    }
}
