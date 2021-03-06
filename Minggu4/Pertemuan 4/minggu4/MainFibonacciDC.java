package Minggu4;

import static Minggu4.Fibonacci1.fibo;
import java.util.Scanner;

public class MainFibonacciDC {

    public static void main(String[] args) {
        // Divide Conquer
        Scanner input = new Scanner(System.in); //0(1)
        int i; //0(1)
        int j = 0; //0(1)
        System.out.print("Masukkan bil Fibonacci :"); //0(1)
        int n = input.nextInt(); //0(1)
        
        System.out.print("Hasil bil Fibonacci : "); //0(1)
        
        System.out.println(""); //0(1)
        for(i = 1; i<=n; i++){ //0(n)
            System.out.println("Fibonacci ke-" + i + ":"+ fibo(j)); //0(1)
            j++; //0(1)
        }
        System.out.println(); //0(1)
    }
}

// = 0(1+1+1+1+1+1+1+(n*1*1)+1)
// = 0(8 n)
// = 0(n)