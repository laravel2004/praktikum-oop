package classFibbonacciPrima;

import java.util.List;
import java.util.Scanner;

public class PraktikumFibonacciPrima {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukan nilai : ");
        long limit = scan.nextInt(); // Ganti dengan batas angka yang diinginkan
        if(limit >= 50000) {
            System.out.println("angka terlalu besar");
            return;
        }
        List<Integer> primeSeries = Prima.generatePrimes(limit);
        List<Integer> fibonacciSeries = Fibonacci.generateFibonacci(limit);

        
        System.out.println("Deret bilangan prima kurang dari " + limit + ": " + primeSeries);
        System.out.println("Banyak bilangan : " + primeSeries.size() );
        System.out.println("Deret bilangan fibonacci kurang dari " + limit + ": " + fibonacciSeries);
        System.out.println("Banyak bilangan : " + fibonacciSeries.size() );
        
    }
    
}
