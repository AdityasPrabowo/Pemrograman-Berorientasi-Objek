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
import java.util.ArrayList;
import java.util.List;

public class Peminjaman implements PeminjamanInterface, Serializable {
    private Anggota anggota;
    private List<Buku> daftarBuku;

    public Peminjaman(Anggota anggota) {
        this.anggota = anggota;
        this.daftarBuku = new ArrayList<>();
    }

    @Override
    public void pinjam(Buku buku) {
        daftarBuku.add(buku);
        System.out.println("Buku dipinjam: " + buku.judul);
    }

    @Override
    public void kembalikan(Buku buku) {
        daftarBuku.remove(buku);
        System.out.println("Buku dikembalikan: " + buku.judul);
    }

    public void tampilkanPeminjaman() {
        System.out.println("Peminjaman oleh: " + anggota.getNama());
        for (Buku b : daftarBuku) {
            b.displayInfo();
        }
    }
}
