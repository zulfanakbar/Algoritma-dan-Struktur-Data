public class Diagram{

	//Input Kandidat Terpilih
	//Input jumlah elemen array
	//Input hasil pemilihan suara
	
	//Tambahan :
	//Input Jumlah Suara Setiap kandidat

	public int suara;
	public int jumlahSuara = 0;
	public int jumlahKandidat = 4;
	public String kandidat;

	//Khusus
	public static int control = 0;
	public static int nilai = 1;
	public static int accept = 0;
	public static int accept2 = 0;

	public static int array[] = new int[10000];

	public static int hitung(int js,int k1, int k2, int k3, int k4){
		if (nilai == 5) {
			nilai = 1;
		}

		// if (js%2==0) {
			if (nilai == 1 && k1 > 0) {
				array[control] = nilai;
				control++;
				nilai++;
				return hitung(js,k1-1,k2,k3,k4);
			}else if (nilai == 2 && k2 > 0) {
				array[control] = nilai;
				control++;
				nilai++;
				return hitung(js,k1,k2-1,k3,k4);
			}else if (nilai == 3 && k3 > 0){
				array[control] = nilai;
				control++;
				nilai++;
				return hitung(js,k1,k2,k3-1,k4);
			}else if (nilai == 4 && k4 > 0) {
				array[control] = nilai;
				control++;
				nilai++;
				return hitung(js,k1,k2,k3,k4-1);
			}else if(k1 == 0 && k2 == 0 && k3 == 0 && k4 == 0){
				
				if (array[accept] == array[accept+1] && accept+1 < js) {
					return array[accept];
				}else if(accept+2 < js){
					accept += 2;
					return hitung(js,k1,k2,k3,k4);
				}else{
					// return hitung(js,k1,k2,k3,k4);
					return 0;
				}

			}else{
				nilai++;
				return hitung(js,k1,k2,k3,k4);

			}

		// }else{
		// 	//ganjil
		// 	return 1;
		// }

	}

	

}