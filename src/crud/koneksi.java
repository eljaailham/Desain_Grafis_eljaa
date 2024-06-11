/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import static java.time.Clock.system;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 *
 * @author ACER
 */
public class koneksi {
    
    private String databaseName="elzailhamadipratama_2210010091";
    private String username="root";
    private String password="";
    private String lokasi="jdbc:mysql://localhost/"+databaseName;
    private static Connection koneksiDB;
    
    
    public koneksi (){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            koneksiDB=DriverManager.getConnection(lokasi,username,password);
            System.out.println("Database Terkoneksi");
        }catch (Exception e){
            System.err.println(e.toString());
        }
    }
    
    public void simpanProduk(int id_produk, int id_desainer, String pnama, 
            String ptanggal, int pharga){
        
        try {
           String SQL ="INSERT INTO produk (id_produk, id_desainer, nama, tanggal, harga)"
                   + "VALUE(?,?,?,?,?)";
           
           PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
           perintah.setInt(1, id_produk);
           perintah.setInt(2, id_desainer);
           perintah.setString(3, pnama);
           perintah.setString(4, ptanggal);
           perintah.setInt(5, pharga);
           perintah.executeUpdate();
           System.out.println("Data berhasil disimpan");
        }catch (Exception e) {
           System.out.println(e.getMessage());
        }
    }
    
        public void ubahProduk(int id_produk, int id_desainer, String pnama, 
            String ptanggal, int pharga){
        
        try {
           String SQL ="UPDATE produk SET id_desainer = ?, nama = ?, "
                   + "tanggal = ?, harga = ? WHERE id_produk = ? ";
           
           PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
           perintah.setInt(1, id_desainer);
           perintah.setString(2, pnama);
           perintah.setString(3, ptanggal);
           perintah.setInt(4, pharga);
           perintah.setInt(5, id_produk);
           perintah.executeUpdate();
           System.out.println("Data berhasil diubah");
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void hapusProduk(int id_produk){
        try {
           String SQL ="DELETE FROM produk WHERE id_produk = ?";
           PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
           perintah.setInt(1,id_produk);
           perintah.executeUpdate();
           System.out.println("Data berhasil dihapus");
        }catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

     public void cariProduk(int id_produk) {
        try {
            String SQl ="SELECT*FROM produk WHERE id_produk = ?";
            PreparedStatement perintah = koneksiDB.prepareStatement(SQl);
            perintah.setInt(1, id_produk);
            ResultSet data = perintah.executeQuery();
            while (data.next()){
               System.out.println("Id_Produk :"+data.getInt("id_produk"));
               System.out.println("Id_Desainer :"+data.getInt("id_desainer"));
               System.out.println("Nama :"+data.getString("nama"));
               System.out.println("Tanggal :"+data.getString("tanggal"));
               System.out.println("Harga :"+data.getInt("Harga"));
               
            }
        }catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
     
    public void dataProduk() {
        try {
            Statement stmt = koneksiDB.createStatement();
            ResultSet baris = stmt.executeQuery("SELECT*FROM produk ORDER BY id_produk ASC");
            while (baris.next()){
                System.out.println(baris.getInt("id_produk")+" | "+
                        baris.getInt("id_desainer")+" | "+
                        baris.getString("nama")+" | "+
                        baris.getString("tanggal")+" | "+
                        baris.getInt("Harga"));
            }
        }catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
 