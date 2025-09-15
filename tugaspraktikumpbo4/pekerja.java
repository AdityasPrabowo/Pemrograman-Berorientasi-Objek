/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugaspraktikumpbo4;

/**
 *
 * @author axioo
 */
public class pekerja extends manusia {
    private int gaji; // Atribut tambahan khusus 
    
    // Constructor
    public pekerja(String nama, int usia, String pekerjaan, int gaji) {
        super(nama, usia, pekerjaan);
        this.gaji = gaji;
    }
    
    // Getter dan Setter untuk gaji
    public double getGaji() {
        return gaji;
    }
    public void setGaji(int gaji) {
        this.gaji = gaji;
    }
    
    // Override metode toString()
    
    @Override
    public String toString() {
        return """
               Informasi Pekerja: 
               Nama: """ + getNama() +
               "\nUsia: " + usia +
               "\nPekerjaan: " + pekerjaan +
               "\nGaji: Rp." + gaji;
    }
}
