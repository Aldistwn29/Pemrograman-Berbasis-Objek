package Percobaan_2;

public class Exception2 {
    public static void main(String[] args) {
        int i = 0;
        String greString[] = {
            "Hello World!",
            "No, I mean it!",
            "Hello World"
        };
        while (i < greString.length) { 
            try {
                System.out.println(greString[i]);
                i++;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Resetting index values");
                break; 
            }
        }
    }
}
