/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;
import java.sql.Connection; //mendapatkan koneksi
import java.sql.DriverManager; //menghubungkan database
import java.sql.PreparedStatement; //perintah sql (crud)
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
    //CODING FORM PRODUK
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
    //SELESAI CODING FORM PRODUK
    
    //CODING FORM TRANSAKSI
    public void simpanTransaksi(int id_transaksi, int trekening, String tstatus_transaksi){
        
        try {
           String SQL ="INSERT INTO produk (id_transaksi, rekening, status_transaksi)"
                   + "VALUE(?,?,?)";
           
           PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
           perintah.setInt(1, id_transaksi);
           perintah.setInt(2, trekening);
           perintah.setString(3, tstatus_transaksi);
           perintah.executeUpdate();
           System.out.println("Data berhasil disimpan");
        }catch (Exception e) {
           System.out.println(e.getMessage());
        }
    }
    
        public void ubahTransaksi(int id_transaksi, int trekening, String tstatus_transaksi){
        
        try {
           String SQL ="UPDATE produk SET id_transaksi = ?, rekening = ?, status_transaksi = ? WHERE id_transaksi = ? ";
           
           PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
           perintah.setInt(1, trekening);
           perintah.setString(2, tstatus_transaksi);
           perintah.executeUpdate();
           System.out.println("Data berhasil diubah");
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void hapusTransaksi(int id_transaksi){
        try {
           String SQL ="DELETE FROM produk WHERE id_transaksi = ?";
           PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
           perintah.setInt(1,id_transaksi);
           perintah.executeUpdate();
           System.out.println("Data berhasil dihapus");
        }catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    //SELESAI CODING FORM TRANSAKSI
    
    //CODING FORM PEMESAN
        public void simpanPemesan(int id_pemesan, String pnama_pemesan, int pno_hp, 
            String palamat, int ptanggal_daftar){
        
        try {
           String SQL ="INSERT INTO produk (id_pemesan, nama_pemesan, no_hp, alamat, tanggal_daftar"
                   + "VALUE(?,?,?,?,?)";
           
           PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
           perintah.setInt(1, id_pemesan);
           perintah.setString(2, pnama_pemesan);
           perintah.setInt(3, pno_hp);
           perintah.setString(4, palamat);
           perintah.setInt(5, ptanggal_daftar);
           perintah.executeUpdate();
           System.out.println("Data berhasil disimpan");
        }catch (Exception e) {
           System.out.println(e.getMessage());
        }
    }
    
        public void ubahPemesan(int id_pemesan, String pnama_pemesan, int pno_hp, 
            String palamat, int ptanggal_daftar){
        
        try {
           String SQL ="UPDATE produk SET id_pemesan = ?, nama_pemesan = ?, no_hp = ?, "
                   + "alamat = ?, tanggal_daftar = ? WHERE id_pemesan = ? ";
           
           PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
           perintah.setString(1, pnama_pemesan);
           perintah.setInt(2, pno_hp);
           perintah.setString(3, palamat);
           perintah.setInt(4, ptanggal_daftar);
           perintah.executeUpdate();
           System.out.println("Data berhasil diubah");
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void hapusPemesan(int id_pemesan){
        try {
           String SQL ="DELETE FROM produk WHERE id_pemesan = ?";
           PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
           perintah.setInt(1, id_pemesan);
           perintah.executeUpdate();
           System.out.println("Data berhasil dihapus");
        }catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    //SELESAI CODING FORM PEMESAN
    
    //CODING FORM DESAINER
    public void simpanDesainer(int id_desainer, String dnama_desainer, int dno_hp, 
    String drating){
        
        try {
           String SQL ="INSERT INTO produk (id_desainer, nama_desainer, no_hp, rating VALUE(?,?,?,?)";
           
           PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
           perintah.setInt(1, id_desainer);
           perintah.setString(2, dnama_desainer);
           perintah.setInt(3, dno_hp);
           perintah.setString(4, drating);
           perintah.executeUpdate();
           System.out.println("Data berhasil disimpan");
        }catch (Exception e) {
           System.out.println(e.getMessage());
        }
    }
    
    public void ubahDesainer(int id_desainer, String dnama_desainer, int dno_hp, 
    String drating){
        
        try {
           String SQL ="UPDATE produk SET id_desainer = ?, nama_desainer = ?, no_hp = ?, rating = ? WHERE id_desainer = ? ";
           
           PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
           perintah.setString(1, dnama_desainer);
           perintah.setInt(2, dno_hp);
           perintah.setString(3, drating);
           perintah.executeUpdate();
           System.out.println("Data berhasil diubah");
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void hapusDesainer(int id_desainer){
        try {
           String SQL ="DELETE FROM produk WHERE id_desainer = ?";
           PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
           perintah.setInt(1, id_desainer);
           perintah.executeUpdate();
           System.out.println("Data berhasil dihapus");
        }catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
}
 