package tugas002;

public class array2D {

    public int[][] data;
    public int jmlhBarisData, JmlhDataKolom, baris = -1, kolom = -1;

    public array2D(int[][] Data, int jmlDataBaris, int jmlDataKolom) {
        JmlhDataKolom = jmlDataBaris;
        JmlhDataKolom = jmlDataKolom;
        data = new int[jmlDataBaris][jmlDataKolom];
        for (int a = 0; a < jmlhBarisData; a++) {
            for (int b = 0; b < JmlhDataKolom; b++) {
                data[a][b] = Data[a][b];
            }
        }
    }

    public void FindSeqSearch(int cari) {
        for (int a = 0; a < jmlhBarisData; a++) {
            for (int b = 0; b < JmlhDataKolom; b++) {
                if (data[a][b] == cari) {
                    baris = a;
                    kolom = b;
                    break;
                }
            }
        }
    }

    public void TampilData() {
        for (int a = 0; a < jmlhBarisData; a++) {
            for (int b = 0; b < JmlhDataKolom; b++) {
                System.out.print(data[a][b] + " ");
            }
            System.out.println();
        }
    }
}
