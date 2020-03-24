package Tugas01;

import tugas01.tugas1;
import tugas01.mergeSort;

public class main {

    public static void main(String[] args) {
        int data[] = {80, 70, 60, 50, 40, 30, 20, 10};
        tugas1 pencarian = new tugas1(data, 8);

        System.out.println("Isi Array : ");
        pencarian.TampilData();
        int cari = 30;
        System.out.println();
        System.out.println("<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>");
        System.out.println("Disorting Dengan Merge Sort");
        System.out.println("<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>");
        mergeSort msort = new mergeSort();
        System.out.println("Data Yang Awal :");
        msort.printArray(data);
        msort.mergeSort(data);
        System.out.println("Data Setelah Diurutkan :");
        msort.printArray(data);

        System.out.println();
        System.out.println("<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>");
        System.out.println("  Menggunakan Binary Search");
        System.out.println("<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>");
        int posisi = pencarian.FindBinarySearch(cari, 0, data.length - 1);
        pencarian.TampilPosisi(cari, posisi);
    }
}
