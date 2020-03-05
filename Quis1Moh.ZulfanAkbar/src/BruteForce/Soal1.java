package BruteForce;

public class Soal1 {

   private static void match(char[] text, char[] pattern) {
     int j;
     int cek = 0;
     for (int i = 0; i <= text.length - pattern.length; i++) {
        j = 0;
        while (j < pattern.length && text[i + j] == pattern[j]){
           j++;
        }
        if (j >= pattern.length) {
           cek++;
        }
     }
     if (cek > 0) {
        System.out.println("DATA COCOK");
     } else {
        System.out.println("DATA TIDAK COCOK");
     }
   }
   public static void main(String[] args) {
      char[] x = {'N', 'G', 'A'};
      char[] y = {'S', 'E', 'M', 'A', 'N', 'G', 'A', 'T'};
      match(y, x);
   }
}
