/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas6;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Acer
 */
class KeranjangBelanja {
    private List<Produk> daftarProduk;
    
    public KeranjangBelanja() {
        this.daftarProduk = new ArrayList<>();
    }
    public void tambahProduk(Produk produk) {
        this.daftarProduk.add(produk);
        System.out.println("'" + produk.getNama() + "' telah ditambahkan ke keranjang.");
    }
    public double hitungTotal() {
        double total = 0.0;
        for (Produk produk : daftarProduk) {
            total += produk.getHargaDiskon();
        }
        return total;
    }
    public List<Produk> getDaftarProduk() {
        return daftarProduk;
    }
}
