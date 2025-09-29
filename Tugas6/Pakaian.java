/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas6;

/**
 *
 * @author Acer
 */
class Pakaian extends Produk {
    private String ukuran;
    
    public Pakaian(String nama, double harga, String ukuran) {
        super(nama, harga);
        this.ukuran = ukuran;
    }
    @Override
    public double hitungDiskon() {
        if (this.harga > 200000.0) {
            return this.harga * 0.20;
        } else{
            return this.harga * 0.05;
        }
    }
}
