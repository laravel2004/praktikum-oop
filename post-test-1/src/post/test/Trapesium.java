/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package post.test;

/**
 *
 * @author HP
 */
public class Trapesium {
    int sisi;
    
    public Trapesium (int sisi) {
        this.sisi = sisi;
    }
    
    public int luas() {
        return (sisi + sisi) / 2 * sisi;
    }
    public int keliling() {
        return sisi * 4;
    }
}
