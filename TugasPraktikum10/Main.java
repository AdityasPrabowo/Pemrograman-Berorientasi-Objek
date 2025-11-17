/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPraktikum10;

/**
 *
 * @author axioo
 */
// Kelas Main
public class Main {
    public static void main(String[] args) {
        Pembayaran elektronik = new Elektronik();
        System.out.println("Total Harga: " + elektronik.hitungPajak(10000));
        
        Pembayaran makanan = new Makanan();
        System.out.println("Total Harga: " + makanan.hitungPajak(6000));
    }
}

