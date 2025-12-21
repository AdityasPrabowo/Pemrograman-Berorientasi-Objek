/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manajemenperpustakaan;

/**
 *
 * @author axioo
 */
public class Buku extends Koleksi {
    private String pengarang;
    private int tahunTerbit;

    public Buku(String judul, String pengarang, int tahunTerbit) {
        super(judul);
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
    }

    @Override
    public void displayInfo() {
        System.out.println(
            "Judul: " + judul +
            ", Pengarang: " + pengarang +
            ", Tahun: " + tahunTerbit
        );
    }
}

