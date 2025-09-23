/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5_soal1;

/**
 *
 * @author haru
 */
public class kucing extends hewan {
    public kucing(String nama, String jenis) {
        super(nama, jenis);
    }
    
    public void suara() {
        System.out.println("Suara   : Meow");
    }
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        suara();
    }
}
