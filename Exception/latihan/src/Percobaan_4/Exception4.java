package Percobaan_4;

public class Exception4 {
    public static void main(String[] args) {
        int bil =10;
        String b[] = {"a", "b", "c"};
        try {
            System.out.println(b[3]);
            System.out.println(bil/0);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Terjadi Aritmatika Error");
        }
        catch (Exception e){
            System.out.println("ini menghandle error yg terjadi");
        }
    }

}
