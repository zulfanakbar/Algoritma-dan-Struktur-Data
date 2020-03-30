package Tugas2;

import java.util.Scanner;

public class Tugas2Main {

    public static void main(String[] args) {
        Scanner w = new Scanner(System.in);
        Tugas2 kalimat = new Tugas2(2);
        System.out.print("Masukkan kalimat : ");
        for (int a = 0; a < 2; a++) {
            String data = w.next();
            kalimat.push(data);
        }
        kalimat.print();
    }
}
