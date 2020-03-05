package Pertemuan4;
import static Pertemuan4.maxmin.max_min;
import java.util.Scanner;

public class minMax {
    public int nilaiArray;
    
    public static void main(String[] args) {
        minMax[] ppArray = new minMax[5]; //O(1)
        ppArray[0] = new minMax();//O(1)
        
        Scanner sc = new Scanner(System.in);//(1)
        
        for(int i=0 ; i<5; i++) //O(n)
        {
            ppArray[i] = new minMax();//O(1)
            System.out.println("Nilai array indeks ke-"+i);//O(1)
            System.out.println("Masukkan nilai: ");//O(1)
            ppArray[i].nilaiArray = sc.nextInt();//O(1)
        }
        //inisialisasi Nilai pada min dan max
        int min=ppArray[0].nilaiArray; //O(1)
        int max=ppArray[0].nilaiArray; //O(1)
        
        for (int i=0; i<5; i++){ //O(n)
          if (ppArray[i].nilaiArray<min) //O(1)
              min=ppArray[i].nilaiArray; //O(1)
          else if(ppArray[i].nilaiArray>max) //O(1)
              max=ppArray[i].nilaiArray; //O(1)
        }
        System.out.println("BruteForce"); //O(1)
        System.out.println("Nilai Minimal : "+ min); //O(1)
        System.out.println("Nilai Maksimal : "+ max); //O(1)
        
        int arr[] = new int[5]; //O(1)
        for (int i = 0; i<5; i++){ //O(n)
            arr[i]=ppArray[i].nilaiArray; //O(1)
        }
            maxmin hasil = new maxmin();//O(1)
            
            max_min(arr, 0, 4, hasil);//O(1)
            
            System.out.println("Divide Conqueror");//O(1)
            System.out.println("NIlai Minimal: " + hasil.minimum + "\nNilai Maksimaly: " + hasil.maximum);//O(1)
            System.out.print("\n");//O(1)
    }
}


