package tugas03;

import tugas03.array1D;

public class MAIN {

    public static void main(String[] args) {
        int data[] = {12, 17, 2, 1, 70, 50, 90, 17, 2, 90}, pos = -1;
        System.out.println("==============================");
        System.out.println("Sorting Dengan Merge Sort");
        System.out.println("==============================");
        array1D msort = new array1D();
        System.out.println("Data Awal :");
        msort.printArray(data);
        msort.mergeSort(data);
        System.out.println("Setelah Diurutkan :");
        msort.printArray(data);
        System.out.println("==============================");

        array1D cariData = new array1D(data, 10);
        System.out.println();
        System.out.println("Isi Array : ");
        cariData.TampilData();
        int cari = data[data.length - 1];
        System.out.println();
        System.out.println("===================================");
        System.out.println("Menggunakan Binary Search");
        System.out.println("===================================");
        array1D pencarian = new array1D(data, 10);
        for (int i = 0; i < data.length; i++) {
            int posisi = pencarian.FindBinarySearch(cari, i, data.length - 1);
            if (pos == posisi) {
                continue;
            }
            pos = posisi;
            pencarian.TampilPosisi(cari, posisi);
        }
        System.out.println("===================================");
        System.out.println();

        
        int min = data[0];
        int max = data[0];

        for (int i = 0; i < 10; i++) {
            if (data[i] < min) {
                min = data[i];
            } else if (data[i] > max) {
                max = data[i];
            }
        }
        System.out.println("==============================");
        System.out.println("								Brute Force");
        System.out.println("==============================");
        System.out.println("Nilai Maksimal\t : " + max);
        System.out.println("==============================");
    }
}
