package jobsheetTugas;
import java.util.Scanner;
public class diagram_1941720021 {
  public int id;
	public String nama;
	public String game;
	public int hari;
	public double harga;
	public int select;
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.println("Persewaan Video Game ");

		diagram_1941720021 dg = new diagram_1941720021();

		diagram_1941720021[] sewa = new diagram_1941720021[2];
		sewa[0] = new diagram_1941720021();
		sewa[0].id =  1487;
		sewa[0].game = "Batman Lego";
		sewa[0].harga = 3000;

		sewa[1] = new diagram_1941720021();
		sewa[1].id = 1458;
		sewa[1].game = "God Of War";
		sewa[1].harga = 5000;

		System.out.print("Masukkan nama anda : ");
		dg.nama = input.nextLine();

		System.out.println("Game");
		for (int i = 0; i < sewa.length ; i++) {
			System.out.println((i+1) + ".) " + sewa[i].game );
		}

		System.out.print("Masukkan pilihan : ");
		dg.select = input.nextInt();

		if (dg.select > 0 && dg.select <= (sewa.length)) {
			
			System.out.print("Sewa berapa hari : ");
			dg.hari = input.nextInt();

			System.out.println("\nData : ");
			System.out.println("id\t\t = " + sewa[(dg.select-1)].id);
			System.out.println("Nama\t\t = " + dg.nama);
			System.out.println("Game\t\t = " + sewa[(dg.select-1)].game);
			System.out.println("Lama Pinjam\t = " + dg.hari + " Hari ");
			System.out.println("Harga\t\t = " + (sewa[(dg.select-1)].harga * dg.hari));
			

		}else{
			System.exit(0);
		}
	}
}

