/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu1;
import minggu2.barang;

/**
 *
 * @author ZupleK
 */
public class BarangMain {
    public static void main(String[] args) {
        barang b1 = new barang();
        
        b1.namaBarang = "Corsair 2 GB";
        b1.jenisBarang = "DDR";
        b1.hargaSatuan = 250000;
        b1.stok = 10;
        b1.tambahStok(1);
        b1.kurangStok(3);
        b1.tampilBarang();
        int hargaTotal = b1.hitungHargaTotal(4);
        System.out.println("Harga 4 buah = "+hargaTotal);
        
        barang b2 = new barang("Logitech", "Wireless mouse", 150000, 25);
        b2.tampilBarang();
    }
    
}
