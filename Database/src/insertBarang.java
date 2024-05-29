import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ParameterMetaData;
import java.util.Scanner;

public class insertBarang {
    static Connection koneksi = null;
    static PreparedStatement ps;
    
    public static void main(String[] args) {
        koneksi = connectionDB.getConnection();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Kode Barang:");
        String kode = sc.next();
        System.out.println("Nama Barang: ");
        String nama = sc.next();
        System.out.println("Stok:");
        int stok = sc.nextInt();
        System.out.println("Harga:");
        int harga = sc.nextInt();
        
        String query = "INSERT INTO BARANG VALUES(?,?,?,?)";
        try {
            ps = (PreparedStatement) koneksi.prepareStatement(query);
            ps.setString(1, kode);
            ps.setString(2, nama);
            ps.setInt(3, stok);
            ps.setInt(4, harga);
            
            if(ps.executeUpdate() > 0){
                System.out.println("insert data berhasil!");
            }
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
