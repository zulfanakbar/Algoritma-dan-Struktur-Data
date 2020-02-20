package jobsheetTugas;
import java.util.Scanner;
public class tugas6_1941720021 {
	public int panjang;
	public int lebar;
	public int jumlah;

	public int luasTanah(int p, int l){
		return p * l;
	}

	public static void main(String[]args){
		Scanner input = new Scanner(System.in);

		tugas6_1941720021 ls = new tugas6_1941720021();

		System.out.print("Masukkan jumlah tanah : ");
		ls.jumlah = input.nextInt();
		
		tugas6_1941720021[] tanah = new tugas6_1941720021[ls.jumlah];

		for (int i = 0; i < tanah.length ; i++) {
			tanah[i] = new tugas6_1941720021();

			System.out.print("\nMasukkan panjang Tanah ke-" + (i+1) + " : ");
			tanah[i].panjang = input.nextInt();
			System.out.print("Masukkan lebar Tanah ke-" + (i+1) + " : ");
			tanah[i].lebar = input.nextInt();

		}

		System.out.println();

		for (int i = 0; i < tanah.length ; i++) {
			System.out.println("Luas Tanah ke-" + (i+1) + " : " + ls.luasTanah(tanah[i].panjang , tanah[i].lebar));
		}



	}
}

