package Tugas2;
import java.util.Scanner;
public class Tugas2Main {
    public static void menu() {
        System.out.println("+--------------------------+");
        System.out.println("|        MENU PASIEN       |");
        System.out.println("+--------------------------+");
        System.out.println("| 1. Input Antrian Pasien  |");
        System.out.println("| 2. Print Antrian         |");
        System.out.println("| 3. Cari Antrian          |");
        System.out.println("| 4. Hapus Antrian         |");
        System.out.println("| 5. keluar                |");
        System.out.println("+--------------------------+");
    }
    public static void SubMenu1(){
        System.out.println("+--------------------------+");
        System.out.println("|        Menu Hapus        |");
        System.out.println("+--------------------------+");
        System.out.println("| 1. Hapus Antrian Pasien  |");
        System.out.println("| 2. Hapus Semua Antrian   |");
        System.out.println("| 3. Kembali               |");
        System.out.println("+--------------------------+");
    }
    public static void subMenu2(){
        System.out.println("+--------------------------+");
        System.out.println("|        Menu Print        |");
        System.out.println("+--------------------------+");
        System.out.println("| 1. Tampil Semua Antrian  |");
        System.out.println("| 2. Tampil Antrian Awal   |");
        System.out.println("| 3. Tampil Antrian Akhir  |");
        System.out.println("| 4. Kembali               |");
        System.out.println("+--------------------------+");
    }
    public static void main(String[] args) {
        LinkedListTugas2 zul = new LinkedListTugas2();
        Scanner fan = new Scanner (System.in);
        int pilih, pilih1, pilih2;
        do {
            menu();
            System.out.print("Pilih Menu : ");
            pilih = fan.nextInt();
            try{
                switch (pilih){
                    case 1 : 
                        System.out.print("Masukkan Antrian : ");
                        String antrian = fan.next();
                        System.out.print("Masukkan NIK : ");
                        String nik = fan.next();
                        System.out.print("Masukkan Nama : ");
                        String nama= fan.next();
                        System.out.print("Masukkan Poli yang di tuju : ");
                        String poli = fan.next();
                        zul.add(antrian, nik, nama, poli);
                        break;
                    case 4 :
                        do{
                            SubMenu1();
                            zul.print();
                            System.out.print("Pilih Menu Hapus : ");
                            pilih1 = fan.nextInt();
                            
                            switch (pilih1){
                                case 1 :
                                    System.out.print("Masukkan No Antrian yang akan dihapus : ");
                                    String antrian1 = fan.next();
                                    zul.remove(antrian1);
                                    break;
                                case 2 :
                                    zul.clear();
                                    break;
                            }
                        } while(pilih1==1 || pilih1==2);
                        break;
                    case 3 :
                        System.out.print("Masukkan No Antrian yang anda cari : ");
                        String antri = fan.next();
                        zul.carikey(antri);
                        break;
                    case 2 :
                        do{
                            subMenu2();
                            System.out.print("Pilih menu yang anda Inginkan : ");
                            pilih2 = fan.nextInt();
                           
                            switch (pilih2){
                                case 1 :
                                    zul.print();
                                    break;
                                case 2 :
                                    zul.getFirst();
                                    break;
                                case 3 :
                                    zul.getlast();
                                    break;
                            }
                        } while (pilih2==1 || pilih2==2);
                        break;
                }
            }catch(Exception e){
            System.out.println(e.getMessage());
            }
        }while(pilih==1 || pilih==2 || pilih==3 || pilih==4);
    } 
}
