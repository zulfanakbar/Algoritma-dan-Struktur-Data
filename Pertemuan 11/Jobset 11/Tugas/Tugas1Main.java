package Tugas;
import java.util.Scanner;
public class Tugas1Main {
     public static void menu() {
        System.out.println("+----------------------+");
        System.out.println("|    DATA MAHASISWA    |");
        System.out.println("+----------------------+");
        System.out.println("| 1. Tambah Mahasiswa  |");
        System.out.println("| 2. Hapus Mahasiswa   |");
        System.out.println("| 3. Tampil mahasiswa  |");
        System.out.println("| 4. keluar            |");
        System.out.println("|----------------------|");
    }
    public static void main(String[] args) {
        LinkedListTugas1 su = new LinkedListTugas1();
        Scanner njay = new Scanner(System.in);
        int pilih;
        do{
        menu();
        System.out.print("Pilih Menu : ");
        pilih = njay.nextInt();
        try{
            switch(pilih){
                case 1: 
                    System.out.println("++++++++++++++++++++++++++++++++++");
                    System.out.println("--> Masukkan Biodata Mahasiswa <--");
                    System.out.println("++++++++++++++++++++++++++++++++++");
                    System.out.print("NIM : ");
                    String nim = njay.next();
                    System.out.print("Nama : ");
                    String nama = njay.next();
                    System.out.print("Alamat Tinggal : ");
                    String alamat = njay.next();
                    System.out.println("++++++++++++++++++++++++++++++++++");
                    su.add(nim, nama, alamat);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Hapus Data Mahasiswa");
                    su.print();
                    System.out.println("Masukkan NIM Mahasiswa yang ingin dihapus!");
                    System.out.print("NIM : ");
                    String delete = njay.next();
                    System.out.println();
                    System.out.println("------------------------------------------");
                    su.removeValue(delete);
                    System.out.println("Data Setelah dihapus: ");
                    su.print();
                    System.out.println("------------------------------------------");
                    break;
                case 3:
                    su.print();
                    System.out.println();
                    System.out.println("Apakah Anda ingin melakukan pencarian data mahasiswa? 1/2 ");
                    int pilih2;
                    pilih2 = njay.nextInt();
                        if (pilih2==1) {
                            System.out.println("Masukkan NIM mahasiswa yang ingin dicari!");
                            System.out.print("NIM : ");
                            String search=njay.next();
                            System.out.println("-----------------------------------------");
                            su.findKey(search);
                            System.out.println("-----------------------------------------");
                        }     
                break;    
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    } 
     while (pilih==1 || pilih==2 || pilih==3);
}
}
