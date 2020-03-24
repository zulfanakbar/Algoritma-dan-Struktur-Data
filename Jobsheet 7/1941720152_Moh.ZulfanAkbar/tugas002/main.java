package tugas002;

import tugas002.array2D;
import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int data[][] = {
            {45, 78, 7, 200, 80},
            {90, 1, 17, 100, 50},
            {21, 2, 40, 18, 65},
        };
        array2D pencarian = new array2D(data, 3, 5);
        
        System.out.println("Isi Array : ");
        pencarian.TampilData();
        System.out.println("Masukkan Data Yang Ingin Anda Cari : ");
           int cari = sc.nextInt();
        
        System.out.println();
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>");
        System.out.println("Menggunakan Squential Search");
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>");
        pencarian.FindSeqSearch(cari);
        if(pencarian.baris != -1 && pencarian.kolom != -1){
            System.out.println("Data : " + cari + " Ditemukan pada Indeks Ke -( " + pencarian.baris + ", " + pencarian.kolom + ")");                    
    } else {
            System.out.println("data " + cari + "tidak dapat ditemukan");
        }
    }
}
