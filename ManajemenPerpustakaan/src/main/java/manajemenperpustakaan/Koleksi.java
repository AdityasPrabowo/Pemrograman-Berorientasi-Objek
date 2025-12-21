/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manajemenperpustakaan;

/**
 *
 * @author axioo
 */
import java.io.Serializable;

public abstract class Koleksi implements Serializable {
    protected String judul;

    public Koleksi(String judul) {
        this.judul = judul;
    }

    public abstract void displayInfo();
}

