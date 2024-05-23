/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Produk;

/**
 *
 * @author ACER
 */
public class Transaksi extends Produk {
    String catatanTransaksi, tglTransaksi, namaTransaksi; 
    
    public Transaksi() {}
    
    public Transaksi(String catatanTransaksi, String tglTransaksi, String namaTransaksi){
        this.catatanTransaksi=catatanTransaksi;
        this.namaTransaksi=namaTransaksi;
        this.tglTransaksi=tglTransaksi;
    }
    public void inputCatatan(String catatanTransaksi){
        this.catatanTransaksi= catatanTransaksi;
    }
    public String ambilCatatan(){
        return this.catatanTransaksi;
    }
    public void inputnama(String namaTransaksi) {
        this.namaTransaksi=namaTransaksi;
    }
    public String ambilnama(){
        return this.namaTransaksi;
    }
    public void inputTgl(String tglTransaksi ){
        this.tglTransaksi = tglTransaksi;
    }
    public String ambilTgl(){
        return this.tglTransaksi;
    }
    
}

