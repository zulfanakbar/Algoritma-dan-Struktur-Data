package Tugas3;

import java.util.Scanner;
public class maintugas3 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String P, Q, eksp = "";
    System.out.println("<<<<<<<<<<>>>>>>>>>>");
    System.out.println("Progam Konversi I");
    System.out.println("<<<<<<<<<<>>>>>>>>>>");
    System.out.println("Masukkan ekspresi matematika: ");
    Q = sc.nextLine();
    for(int i=(Q.length()-1); i>=0; i--){
        eksp = eksp + Q.charAt(i);
    }
    eksp = eksp.trim();
    eksp = eksp + "(";
    
    int total = eksp.length();
    
    tugas3 pref = new tugas3 (total);
    P = pref.konversi(eksp);
    System.out.println("Prefix : " + new  StringBuffer(P).reverse());
    System.out.println("<<<<<<<<<<>>>>>>>>>>");
  }
}
