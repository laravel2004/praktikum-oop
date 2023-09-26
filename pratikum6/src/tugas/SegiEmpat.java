/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author HP
 */
//import java.lang.Math;

public class SegiEmpat {
    public double panjang;
    public double lebar;
    private double diagonal;
    
    public SegiEmpat(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    public double getLuas() {
        return panjang * lebar;
    }
    
    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }
    
    public void setLebar(double lebar) {
        this.lebar = lebar;
    }
    
    public double getDiagonal() {
        diagonal = Math.sqrt((panjang*panjang) + (lebar * lebar));
        return diagonal;
    }
    
}
