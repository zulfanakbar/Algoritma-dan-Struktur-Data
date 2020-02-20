package programjajargenjang;
import java.util.Scanner;
/**
 *
 * @author ZupleK
 */
public class Programjajargenjang {
    public static void main(String[] args) {
        jajargenjang[] jgArray = new jajargenjang[5];
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Menghitung luas dan keliling jajargenjang");
        for (int i = 0; i < 5; i++){
            jgArray[0] = new jajargenjang();
            
            System.out.println("jajar genjang ke- " + i);
            System.out.println("Masukkan alas: ");
            jgArray[i].alas = sc.nextInt();
            System.out.println("Masukkan tinggi: ");
            jgArray[i].tinggi = sc.nextInt();
            System.out.println("Masukkan miring: ");
            jgArray[i].miring = sc.nextInt();
       
        }
        for(int i = 0; i < 5;i++){
            System.out.println("jajar genjang ke- "+ i);
            System.out.println("Luas = " + jgArray[i].hitungLuas());
            System.out.println("Keliling = " + jgArray[i].hitungKeliling());
        }
    }
}
