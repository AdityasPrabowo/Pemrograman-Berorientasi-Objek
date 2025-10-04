/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsiuts.adityasetyoprabowo;

/**
 *
 * @author axioo
 */
public class Main {
    public static void main(String[] args) {
        // Produk
        Produk p1 = new Elektronik("Laptop", 15000000, 2);
        Produk p2 = new Makanan("Snack", 15000, "2023-12-30");

        // Pegawai
        Pegawai peg1 = new PegawaiTetap("Bowo", 5000000, 1000000);
        Pegawai peg2 = new PegawaiKontrak("Eddie", 3000000, 12);

        // Output Produk
        System.out.println("=== Output Produk ===");
        p1.tampilkanInfo();


        // Output Pegawai
        System.out.println("\n=== Output Pegawai ===");
        peg1.tampilkanInfo();

        
        // Output Polimorfisme
        System.out.println("\n=== Output Polimorfisme ===");
        p2.tampilkanInfo();
        System.out.println();
        peg2.tampilkanInfo();
    }
}