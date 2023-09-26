/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan1;

/**
 *
 * @author HP
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Shape kubus = new Shape(5, 5, 5);
        Shape balok = new Shape(10, 5, 5);
        kubus.cetak();
        balok.cetak();
        Double selisihVolume = kubus.compareTo(balok);
        System.out.println("Selisih Volume ="+selisihVolume);
    }
    
}
