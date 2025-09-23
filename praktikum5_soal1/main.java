/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5_soal1;

/**
 *
 * @author haru
 */
public class main {
    public static void main(String[] args) {
        kucing kucing1 = new kucing("Sumbul", "Kampung");
        anjing anjing1 = new anjing("Rubble", "Bulldog");

        System.out.println("Informasi Kucing:");
        kucing1.tampilkanInfo();

        System.out.println("\nInformasi Anjing:");
        anjing1.tampilkanInfo();
    }
}
