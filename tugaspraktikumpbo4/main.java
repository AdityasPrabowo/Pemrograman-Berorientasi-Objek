/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugaspraktikumpbo4;

/**
 *
 * @author axioo
 */
public class main {
    public static void main(String[] args) {
        //Membuat objek pekerja
        pekerja pekerja1 = new pekerja("xyonori", 21, "pengamat lingkungan", 8000000);
        
        //Menampilkan informasi pekerja
        System.out.println("Informasi Awal");
        System.out.println(pekerja1.toString());
        System.out.println();
        
        //Mengubah nama menggunakan setter
        pekerja1.setNama("lionel xyonori");
        
        //Menampilkan informasi pekerja setelah diubah
        System.out.println("Informasi Pekerja");
        System.out.println(pekerja1.toString());
        
                //Akses langsung atribut nama, usia dan gaji pada objek pekerja
        System.out.println("Nama: " + pekerja1.nama);
        System.out.println("Usia" + pekerja1.usia);
        System.out.println("Pekerjaan: " + pekerja1.gaji);    //Error: gaji bersifat private dalam subclass pekerja

    }
    
}
