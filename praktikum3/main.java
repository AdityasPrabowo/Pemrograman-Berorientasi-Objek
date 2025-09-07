/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

/**
 *
 * @author axioo
 */

public class main {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("BMW", "e36", 1990, "Putih");
        Mobil mobil2 = new Mobil("Honda", "Civic Turbo", 2016, "Merah");

        mobil1.info();
        mobil1.startEngine();

        mobil2.info();
        mobil2.startEngine();

    }
}