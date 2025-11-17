/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPraktikum10;

/**
 *
 * @author axioo
 */
// Elektronik
public class Elektronik implements Pembayaran {
    @Override
    public double hitungPajak(double harga) {
        return harga + (harga * 0.1);
    }
}
