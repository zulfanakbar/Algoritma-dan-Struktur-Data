package minggu08;

import java.util.Scanner;

public class mainPostFix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String P, Q;
        System.out.println("Masukkan ekspresi matematika: ");
        Q = sc.nextLine();
        Q = Q.trim();
        Q = Q + ")";
        
        int total = Q.length();
        
        PostFix post = new PostFix(total);
        P = post.konversi(Q);
        System.out.println("Postfix: " + P);
    }
}