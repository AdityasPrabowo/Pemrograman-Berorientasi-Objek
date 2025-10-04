package responsiuts.adityasetyoprabowo;

public class Produk {
    private String namaProduk;
    private double harga;

    public Produk(String namaProduk, double harga) {
        this.namaProduk = namaProduk;
        this.harga = harga;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

public void tampilkanInfo() {
    System.out.println("Nama Produk: " + namaProduk);
    System.out.printf("Harga: %.0f\n", harga); 
    }
}