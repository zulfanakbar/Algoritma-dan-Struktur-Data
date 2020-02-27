import java.util.Scanner;
public class MainDiagram{

	public static void main(String[]args){
		
		//Input Kandidat Terpilih
		//Input jumlah elemen array
		//Input hasil pemilihan suara
	
		Scanner input = new Scanner(System.in);
		//Instansisasi Object class Diagram
		Diagram dg = new Diagram();

		// System.out.print("\nBanyak Kandidat : ");
		// dg.jumlahKandidat = input.nextInt();
		//Instansiasi Array object class Diagram
		Diagram[] dia = new Diagram[dg.jumlahKandidat];
		
		for (int i = 0; i < dg.jumlahKandidat  ; i++) {
			dia[i] = new Diagram();
			System.out.print("\nNama Kandidat ke-" + (i+1) + " : ");
			dia[i].kandidat = input.nextLine();
		}
		System.out.println();
		for (int i = 0; i < dg.jumlahKandidat ; i++) {
			System.out.print("Jumlah Suara kandidat ke -" + (i+1) + " : ");
			dia[i].suara = input.nextInt();
			dg.jumlahSuara += dia[i].suara;
		}


		int hasil = dg.hitung(dg.jumlahSuara , dia[0].suara , dia[1].suara, dia[2].suara, dia[3].suara);
		// System.out.println(dg.jumlahSuara);
		// System.out.print("Pemenang : " + dg.hitung(dg.jumlahSuara , dia[0].suara , dia[1].suara, dia[2].suara, dia[3].suara));
		
		if (hasil == 0) {
			System.out.println("Masing-masing kandidat memiliki mayoritas yang hampir sama");
			
		}else{
			System.out.println("Ketua BEM yang terpilih adalah " + dia[hasil-1].kandidat);	
		
		}

		
		// System.out.println("total " + dg.jumlahSuara);
		// System.out.println("\n\nKetua Terpilih adalah : " + );

	}




}