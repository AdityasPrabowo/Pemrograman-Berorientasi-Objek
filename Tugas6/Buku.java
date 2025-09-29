/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas6;

/**
 *
 * @author Acer
 */
class Buku extends Produk {
    private String penulis;
    
    public Buku(String nama, double harga, String penulis) {
        super(nama, harga);
        this.penulis = penulis;
    }
    @Override
    public double hitungDiskon() {
        return this.harga * 0.10;
    }
}
