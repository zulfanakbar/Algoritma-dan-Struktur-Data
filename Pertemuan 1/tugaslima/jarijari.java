package tugaslima;

import java.util.Scanner;

public class jarijari {

    static Scanner sc = new Scanner(System.in);

    static void menu() {
        System.out.println("______________________");
        System.out.println("1. luas segiempat");
        System.out.println("2. luas lingkaran");
        System.out.println("3. luas segitiga");
        System.out.println("4. keluar");
        System.out.println("______________________");
    }

    static void memilih() {
        int menu;
        System.out.print("Pilih menu: ");
        menu = sc.nextInt();
        switch (menu) {

            case 1:
                segiempat();
                System.out.println("______________________");
                menu();
                memilih();
                break;

            case 2:
                lingkaran();
                System.out.println("______________________");
                menu();
                memilih();
                break;

            case 3:
                segitiga();
                System.out.println("____________________");
                menu();
                memilih();
                break;

            case 4:
                System.out.println("ThankYou");
                System.exit(0);

            default:
                System.out.println("Maaf! Menu tidak valid!");
        }
    }

    static void segiempat() {
        int sisi, luas;
        System.out.println("Masukkan sisi: ");
        sisi = sc.nextInt();
        luas = sisi * sisi;
        System.out.println("Luas Segiempat = " + luas);
        System.out.println();
    }

    static void lingkaran() {
        float phi = 3.14F, jari2, luas;
        System.out.print("Masukkan jari-jari : ");
        jari2 = sc.nextInt();
        luas = phi * jari2 * jari2;
        System.out.print("luas = " + luas);
        System.out.println();
    }

    static void segitiga() {
        int alas, tinggi;
        float luas;
        System.out.print("Masukkan alas: ");
        alas = sc.nextInt();
        System.out.print("Masukkan tinggi: ");
        tinggi = sc.nextInt();
        luas = alas * tinggi / 2;
        System.out.println("Luas Segitiga = " + luas);
        System.out.println();
    }

    public static void main(String[] args) {
        menu();
        memilih();
    }
}
