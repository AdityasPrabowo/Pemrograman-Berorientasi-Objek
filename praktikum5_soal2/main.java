/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5_soal2;

/**
 *
 * @author axioo
 */
public class main {
    public static void main(String[] args) {
        mobil m = new mobil();
        m.nama = "BMW e36";
        m.kecepatan = 215;
        m.jumlahRoda = 4;
        m.jumlahPintu = 4;
        m.tampilkanInfo();

        motor sm = new motor();
        sm.nama = "Yamaha MX-King";
        sm.kecepatan = 150;
        sm.jumlahRoda = 2;
        sm.jenisMesin = "4-tak";
        sm.tampilkanInfo();
    }
}
