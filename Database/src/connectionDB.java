import java.sql.Connection;
import java.sql.DriverManager;

public class connectionDB {
    static Connection koneksi = null;
    static String jdbc = "com.mysql.jdbc.Driver";
    static String url = "jdbc:mysql://localhost/toko";
    static String username = "root";
    static String pwd = "";
    
    public static Connection getConnection(){
        if(koneksi==null){
            try {
                Class.forName(jdbc);
                koneksi = DriverManager.getConnection(url, username, pwd);
                System.out.println("Koneksi berhasi");
                
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return koneksi;
    }
}
