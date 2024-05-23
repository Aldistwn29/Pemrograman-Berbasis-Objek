package Percobaan_5;
public class Exeption5 {
    public static void main(String[] args) {
        int bil = 10;
        try {
            System.out.println(bil/0);
        } catch (ArithmeticException e) {
            System.out.println("Pesan Error: ");
            System.out.println(e.getMessage());
            System.out.println("info stack erase");
            e.printStackTrace();
            e.printStackTrace(System.out);
        } catch (Exception e) {
            System.out.println("ini menghendale error yg terjadi");
        }
        }
}
