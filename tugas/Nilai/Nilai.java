package jobsheetTugas;
import java.util.Scanner;
public class nilai_1941720021 {
  	public int nilai1;
	public int nilai2;
	public int jumlah;

	public int max(int n1,int n2){
		if (n1 > n2) {
			return n1;
		}else{
			return n2;
		}
	}
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		nilai_1941720021 nl = new nilai_1941720021();

		System.out.print("\nMasukkan jumlah mahasiswa : ");
		nl.jumlah = input.nextInt();

		nilai_1941720021[] nilai = new nilai_1941720021[nl.jumlah];

		for (int i = 0; i < nilai.length ; i++) {
			nilai[i] = new nilai_1941720021();

			System.out.println("\nMahasiswa ke-" + (i+1) + " : ");
			System.out.print("Masukkan Nilai ke 1 : ");
			nilai[i].nilai1 = input.nextInt();
			System.out.print("Masukkan Nilai ke 2 : ");
			nilai[i].nilai2 = input.nextInt();
		}

		System.out.println();

		for (int i = 0; i < nilai.length ; i++) {
                	System.out.println("Nilai Terbaik Mahasiswa ke-" + (i+1) + " : " + nl.max(nilai[i].nilai1 , nilai[i].nilai2));
		}


	}
}

