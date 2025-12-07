/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum12;

/**
 *
 * @author axioo
 */
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManajemenBuku {

    private static final String TEXT_FILE = "buku.txt";
    private static final String SERIAL_FILE = "buku.ser";
    private static List<Buku> daftarBuku = new ArrayList<>();


    static class Buku implements Serializable {
        private String judul;
        private String pengarang;
        private int tahunTerbit;

        public Buku(String judul, String pengarang, int tahunTerbit) {
            this.judul = judul;
            this.pengarang = pengarang;
            this.tahunTerbit = tahunTerbit;
        }

        @Override
        public String toString() {
            return judul + ";" + pengarang + ";" + tahunTerbit;
        }

        public void tampilkanInfo() {
            System.out.println("Judul: " + judul +
                    ", Pengarang: " + pengarang +
                    ", Tahun Terbit: " + tahunTerbit);
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMENU SISTEM PERPUSTAKAAN");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Simpan ke File Teks (buku.txt)");
            System.out.println("3. Simpan ke File Serial (buku.ser)");
            System.out.println("4. Tampilkan Semua Buku");
            System.out.println("5. Keluar");

            System.out.print("Pilihan: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1 -> tambahBuku(scanner);
                case 2 -> simpanKeFileTeks();
                case 3 -> simpanKeFileSerial();
                case 4 -> tampilkanBuku();
                case 5 -> {
                    System.out.println("Keluar dari sistem.");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Pilihan tidak valid.");
            }
        }
    }



    private static void tambahBuku(Scanner scanner) {
        System.out.print("Masukkan Judul Buku: ");
        String judul = scanner.nextLine();

        System.out.print("Masukkan Pengarang: ");
        String pengarang = scanner.nextLine();

        System.out.print("Masukkan Tahun Terbit: ");
        int tahun = scanner.nextInt();

        daftarBuku.add(new Buku(judul, pengarang, tahun));
        System.out.println("Buku berhasil ditambahkan!");
    }

    private static void simpanKeFileTeks() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(TEXT_FILE))) {
            for (Buku b : daftarBuku) {
                writer.write(b.toString());
                writer.newLine();
            }
            System.out.println("Data buku disimpan ke buku.txt");
        } catch (IOException e) {
            System.out.println("Kesalahan saat menyimpan ke file teks.");
        }
    }

    private static void simpanKeFileSerial() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(SERIAL_FILE))) {
            oos.writeObject(daftarBuku);
            System.out.println("Data buku diserialisasi ke buku.ser");
        } catch (IOException e) {
            System.out.println("Kesalahan saat serialisasi.");
        }
    }

    private static void tampilkanBuku() {
        System.out.println("\nDAFTAR BUKU:");
        if (daftarBuku.isEmpty()) {
            System.out.println("(Belum ada data)");
            return;
        }
        for (Buku b : daftarBuku) {
            b.tampilkanInfo();
        }
    }
}

