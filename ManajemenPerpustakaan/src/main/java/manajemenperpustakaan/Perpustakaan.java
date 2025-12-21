/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manajemenperpustakaan;

/**
 *
 * @author axioo
 */
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Perpustakaan implements Serializable {
    private List<Anggota> anggotaList;
    private List<Buku> bukuList;

    public Perpustakaan() {
        anggotaList = new ArrayList<>();
        bukuList = new ArrayList<>();
    }

    public void tambahAnggota(Anggota anggota) {
        anggotaList.add(anggota);
    }

    public void tambahBuku(Buku buku) {
        bukuList.add(buku);
    }

    public List<Buku> getBukuList() {
        return bukuList;
    }

    public void simpanData(String namaFile) {
        try (ObjectOutputStream oos =
                new ObjectOutputStream(new FileOutputStream(namaFile))) {
            oos.writeObject(this);
            System.out.println("Data berhasil disimpan.");
        } catch (IOException e) {
            System.out.println("Error menyimpan data: " + e.getMessage());
        }
    }

    public static Perpustakaan bacaData(String namaFile) {
        try (ObjectInputStream ois =
                new ObjectInputStream(new FileInputStream(namaFile))) {
            return (Perpustakaan) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error membaca data: " + e.getMessage());
            return new Perpustakaan();
        }
    }
}

