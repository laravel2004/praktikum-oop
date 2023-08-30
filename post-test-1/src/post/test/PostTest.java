package post.test;

import java.util.Scanner;

public class PostTest {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int limit = scan.nextInt();
        
        Persegi persegi[] = new Persegi[limit];
        Segitiga segitiga[] = new Segitiga[limit];
        Lingkaran lingkaran[] = new Lingkaran[limit];
        Trapesium trapesium[] = new Trapesium[limit];
        Balok balok[] = new Balok[limit];
        Kubus kubus[] = new Kubus[limit];
         
         for(int i = 0; i < limit; i++) {
             persegi[i] = new Persegi(i+ 1);
             System.out.println("Persegi ke : " + (i+1));
             System.out.println("luas : " + persegi[i].luas());
             System.out.println("keliling :" + persegi[i].keliling());
         }
         for(int i = 0; i < limit; i++) {
             segitiga[i] = new Segitiga(i+1);
             System.out.println("Segitiga ke : " + i);
             System.out.println("luas : " + segitiga[i].luas());
             System.out.println("keliling :" + segitiga[i].keliling());
         }
         for(int i = 0; i < limit; i++) {
             lingkaran[i] = new Lingkaran(i+1);
             System.out.println("Lingkaran ke : " + i);
             System.out.println("luas : " + lingkaran[i].luas());
             System.out.println("keliling :" + lingkaran[i].keliling());
         }
         for(int i = 0; i < limit; i++) {
             trapesium[i] = new Trapesium(i+1);
             System.out.println("Trapesium ke : " + i);
             System.out.println("luas : " + trapesium[i].luas());
             System.out.println("keliling :" + trapesium[i].keliling());
         }
         for(int i = 0; i < limit; i++) {
             balok[i] = new Balok(i+1);
             System.out.println("Balok ke : " + i);
             System.out.println("luas : " + balok[i].luas());
             System.out.println("volume :" + balok[i].volume());
         }
         for(int i = 0; i < limit; i++) {
             kubus[i] = new Kubus(i+1);
             System.out.println("Kubus ke : " + i);
             System.out.println("luas : " + kubus[i].luas());
             System.out.println("volume :" + kubus[i].volume());
         }
         
    }
    
}
