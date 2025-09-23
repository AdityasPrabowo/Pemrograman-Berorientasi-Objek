/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package praktikum5_soal1;

/**
 *
 * @author haru
 */
public class hewan {
    protected String nama;
    protected String jenis;
    
    public hewan(String nama, String jenis) {
        this.nama = nama;
        this.jenis = jenis;
    }
    
    public void tampilkanInfo() {
        System.out.println("Nama    : " + nama
        + "\nJenis   : " + jenis);
    }
}
