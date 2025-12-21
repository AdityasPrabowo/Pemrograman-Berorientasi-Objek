/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manajemenperpustakaan;

/**
 *
 * @author axioo
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Perpustakaan perpustakaan = new Perpustakaan();
        Anggota anggota = new Anggota("A001", "Andi"); // contoh anggota
        int pilihan;

        do {
            System.out.println("\n=== MENU PERPUSTAKAAN ===");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Pinjam Buku");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");

            try {
                pilihan = Integer.parseInt(input.nextLine());

                switch (pilihan) {

                    case 1:
                        System.out.print("Judul Buku   : ");
                        String judul = input.nextLine();
                        System.out.print("Pengarang    : ");
                        String pengarang = input.nextLine();
                        System.out.print("Tahun Terbit : ");
                        int tahun = Integer.parseInt(input.nextLine());

                        perpustakaan.tambahBuku(
                            new Buku(judul, pengarang, tahun)
                        );
                        System.out.println("Buku ditambahkan!");
                        break;

                    case 2:
                        System.out.println("\nDaftar Buku:");
                        int i = 1;
                        for (Buku b : perpustakaan.getBukuList()) {
                            System.out.print(i++ + ". ");
                            b.displayInfo();
                        }
                        break;

                    case 3:
                        if (perpustakaan.getBukuList().isEmpty()) {
                            System.out.println("Belum ada buku!");
                            break;
                        }

                        System.out.println("\nPilih buku yang ingin dipinjam:");
                        for (int j = 0; j < perpustakaan.getBukuList().size(); j++) {
                            System.out.print((j + 1) + ". ");
                            perpustakaan.getBukuList().get(j).displayInfo();
                        }

                        System.out.print("Nomor buku: ");
                        int pilihBuku = Integer.parseInt(input.nextLine());

                        Buku bukuDipinjam =
                            perpustakaan.getBukuList().get(pilihBuku - 1);

                        Peminjaman peminjaman = new Peminjaman(anggota);
                        peminjaman.pinjam(bukuDipinjam);

                        peminjaman.tampilkanPeminjaman();
                        break;

                    case 0:
                        System.out.println("Keluar...");
                        break;

                    default:
                        System.out.println("Pilihan tidak valid!");
                }

            } catch (Exception e) {
                System.out.println("Input tidak valid!");
                pilihan = -1;
            }

        } while (pilihan != 0);

        input.close();
    }
}
