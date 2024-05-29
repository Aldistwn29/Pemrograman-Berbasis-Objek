import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;


public class DataBarang {
    static Connection koneksi = null;
    static Statement st;
    static ResultSet rs;
    
    public static void main(String[] args) {
        koneksi = connectionDB.getConnection();
        String query = "SELECT * FROM `barang`";
        try {
            st = koneksi.createStatement();
            rs = st.executeQuery(query);
            while(rs.next()){
                String kode = rs.getString("kode_barang");
                String nama = rs.getString("nama_barang");
                int stok = rs.getInt("stok");
                int harga = rs.getInt("harga");
                
                System.out.println("Kode Barang:" + kode);
                System.out.println("Nama Barang:" + nama);
                System.out.println("Stok: " + stok);
                System.out.println("Harga Barang: " + harga);
                System.out.println("==========================");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
