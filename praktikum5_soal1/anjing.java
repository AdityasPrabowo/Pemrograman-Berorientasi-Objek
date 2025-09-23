/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5_soal1;

/**
 *
 * @author haru
 */
public class anjing extends hewan {
    public anjing(String nama, String jenis) {
        super(nama, jenis);
    }
    
    public void suara() {
        System.out.println("Suara   : Wuk Wuk");
    }
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        suara();
    }
}
