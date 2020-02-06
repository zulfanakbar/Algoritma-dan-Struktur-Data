package tugaspertemuansatu;

import java.util.Scanner;

public class waralaba {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ulng = "y";
        int harga = 0, hargatotal = 0;
        int menu, menu1;
        while (ulng.equalsIgnoreCase("y")) {

            System.out.println("Menu pilihan paket makanan");
            System.out.println("A. Paket Chicken");
            System.out.println("B. Paket Oke");
            System.out.println("----------------------------------");
            System.out.println("Pilih paket yang akan di beli");
            menu = sc.nextInt();
            sc.nextLine();
            switch (menu) {
                case 1:
                    System.out.println("A. Paket Chicken A = 12K");
                    System.out.println("B. Paket Chicken B = 15K");
                    System.out.println("C. Paket Chicken C = 20K");
                    System.out.println("Pilih paket yang akan di beli");
                    menu1 = sc.nextInt();
                    sc.nextLine();
                    switch (menu1) {
                        case 1:
                            harga = 12000;
                            break;
                        case 2:
                            harga = 15000;
                            break;
                        case 3:
                            harga = 20000;
                            break;
                    }
                    break;
                case 2:
                    System.out.println("A. Paket Oke A = 10K");
                    System.out.println("B. Paket Oke B = 12K");
                    System.out.println("C. Paket Oke C = 15K");
                    System.out.println("Pilih paket yang akan di beli");
                    menu1 = sc.nextInt();
                    sc.nextLine();
                    switch (menu1) {
                        case 1:
                            harga = 10000;
                            break;
                        case 2:
                            harga = 12000;
                            break;
                        case 3:
                            harga = 15000;
                            break;

                    }
            }
            System.out.println("Masukkan jumlah : ");
            int jumlah = sc.nextInt();
            sc.nextLine();
            System.out.println("Apakah anda ingin membeli lagi ?");
            ulng = sc.nextLine();
            hargatotal += harga * jumlah;
        }
        System.out.println("hargatotal= " + hargatotal);

    }

}
