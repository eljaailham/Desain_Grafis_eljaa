/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package desaingrafis;

import Produk.*;
import java.util.Scanner;
import crud.koneksi;
import gui.frameUtama;

/**
 *
 * @author ACER
 */
public class DesainGrafis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    /*    Transaksi tes = new Transaksi();
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("+++++++++++++++Produk===============");
        System.out.print("Masukan Nama Poduk: ");
        tes.inputNama(input.nextLine());
        System.out.print("Masukan Tanggal (dd/mm/yyyy) : ");
        tes.inputTanggal(input.nextLine());
       
        System.out.println("============Daftar Harga===========");
        System.out.println("| Paket A   | Rp.1.000.000  |");
        System.out.println("| Paket B   | Rp.2.000.000  |");
        System.out.println("| Paket C   | Rp.3.000.000  |");
        System.out.println("| Paket D   | Rp.4.000.000  |");
        System.out.println("=============================");
        
        System.out.println("==============Transaksi++++++++++++");
        System.out.print("Masukan Nama : ");
        tes.inputnama(input.nextLine());
        System.out.print("Masukan Catatan : ");
        tes.inputCatatan(input.nextLine());
        System.out.println("Tanggal Order : 20/05/2024 ");  
    */

        //koneksi db = new koneksi();
        //db.simpanProduk(101, 110, "elza","10/06/2024" , 1000000);
        //db.simpanProduk(102, 111, "wanda","10/06/2024" , 2000000);
        //db.simpanProduk(103, 112, "tri","10/06/2024" , 3000000);
        //db.simpanProduk(104, 113, "rizqi","10/06/2024" , 4000000);
        //db.ubahProduk(101, 110, "ilham", "10/06/2024", 1000000);
        //db.hapusProduk(101);
        //db.cariProduk(101);
        //db.dataProduk();
        
        
        new frameUtama().setVisible(true);
    }
    
    
} 
