/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package praktikum11;

/**
 *
 * @author acer
 */
class Buku {
    private String judul;
 
    public Buku(String judul) {
        this.judul = judul;
    }
    public void infoBuku() {
        System.out.println("Judul Buku: " + judul);
    }
}
class Perpustakaan {
    private List<Buku> bukuList;
 
    public Perpustakaan() {
        this.bukuList = new ArrayList<>();
    }
       
    public void tambahBuku(Buku buku) {
        bukuList.add(buku);
    }
 
    public void infoPerpustakaan() {
        for (Buku buku : bukuList) {
            buku.infoBuku();
        }
    }
}