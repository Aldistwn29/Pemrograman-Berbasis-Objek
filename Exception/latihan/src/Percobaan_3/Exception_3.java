package Percobaan_3;

public class Exception_3 {
    public static void main(String[] args) {
        int bil = 10;
        try {
            System.out.println(bil/0);
        } 
        catch (ArrayIndexOutOfBoundsException e){
            
            System.out.println("Terjadi aritmatika erorr");

        }
        catch (Exception e) {
            System.out.println("ini menghendel error yg terjadi");
        }
    }
}
