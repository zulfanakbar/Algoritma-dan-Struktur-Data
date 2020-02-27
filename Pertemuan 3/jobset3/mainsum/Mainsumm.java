package mainsum;
import java.util.Scanner;
public class Mainsumm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta. Misa 5.9)");
        System.out.println("Masukkan jumlah bulan : ");
        int elm = sc.nextInt();
        
        Mainsum sm = new Mainsum(elm);
        System.out.println("====================================");
        for (int i = 0; i < sm.elemen; i++){
            System.out.println("Masukkan untung bulan ke -"+" = ");
            sm.keuntungan[i]=sc.nextDouble();
        }
        
        System.out.println("=====================================");
        System.out.println("Algoritman Brute Force");
        System.out.println("Total keuntungan perusahan selama "+sm.elemen+"bulan adalah = "+sm.totalBF(sm.keuntungan));
        System.out.println("=====================================");
        System.out.println("Algoritma Divide Conqueror");
        System.out.println("Total keuntungan perusahaan selama "+sm.elemen+"bulan adalah ="+sm.totalDC(sm.keuntungan, 0,sm.elemen-1));
        
    }
    
}
