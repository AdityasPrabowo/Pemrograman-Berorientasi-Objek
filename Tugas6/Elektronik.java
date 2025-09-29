/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas6;

/**
 *
 * @author Acer
 */
class Elektronik extends Produk {
    private String merk;
    
    public Elektronik(String nama, double harga, String merk) {
        super(nama, harga);
        this.merk = merk;
    }
    @Override
    public double hitungDiskon() {
        return this.harga * 0.10;
    }
}
