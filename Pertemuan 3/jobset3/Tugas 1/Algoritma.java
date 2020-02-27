public class Algoritma{

	public String namaMhs;
	public int nilaiTugas;
	public int nilaiKuis;
	public int nilaiUTS;
	public int nilaiUAS;


	public static Double hitungTotalNilai(int tugas,int kuis,int uts,int uas){
		double ntugas = tugas * 0.3f;
		double nkuis = kuis * 0.2f;
		double nUts = uts * 0.2f;
		double nUas = uas * 0.3f;

		return (ntugas + nkuis) + (nUts + nUas);

	}



}