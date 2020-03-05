package Minggu4;

/**
 *
 * @author FauzanOIOI
 */
public class Fibonacci1 {
    static int fibo(int angka) {
        if (angka == 0 || angka == 1) {
            return angka;
        }
        else {
            return (fibo(angka - 1) + fibo(angka - 2));
        }
    }
}
