/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Produk;

/**
 *
 * @author ACER
 */
public class Produk {
    //variable
    String nama, tanggal; //nama = nama produk
    int harga;
    //mendeskirpsikan variable
    public Produk(){}
    
    public Produk(String nama, String tanggal, int harga){
        this.nama=nama;
        this.harga=harga;
        this.tanggal=tanggal;
        
    }
    
    public void inputNama(String nama){
       this.nama=nama; 
    }
    
    public int ambilHarga(){
       this.harga=0;
       if(this.nama.equals("A")){
            this.harga = 1000000;
        }else if (this.nama.equals("B")){
            this.harga = 2000000;
        }else if (this.nama.equals("C")){
            this.harga = 3000000;
        }else{
            this.harga = 4000000;
        }
        return this.harga;
    }
    
    public void inputTanggal(String tanggal){
        this.tanggal=tanggal;
    }
    
    public String ambilTanggal(){
        return this.tanggal;
    }
       
}
