package tugastiga;
import java.util.Scanner ;
public class fibonaci {

        public static void main(String[] args) {

            String kalimat;
            int PanjangKalimat, JumlahHuruf = 1;
            Scanner scan = new Scanner(System.in);
            System.out.println("Masukkan kalimat yang inginkan : ");
            kalimat = scan.nextLine();
            char[] arrHuruf = kalimat.toCharArray();
            PanjangKalimat = arrHuruf.length;

            for (int i = 0; i < PanjangKalimat; i++) {
                for (int j = 0; j < PanjangKalimat; j++) {
                    if (arrHuruf[i] != ' ') {
                        if (i != j && (arrHuruf[i] == arrHuruf[j])) {
                            JumlahHuruf++;
                            arrHuruf[j] = ' ';
                        }
                        if (j == PanjangKalimat - 1) {
                            System.out.println("Jumlah huruf  '" + arrHuruf[i] + "' = " + JumlahHuruf);
                            JumlahHuruf = 1;
                        }
                    }
                }
            }
        }
    }
