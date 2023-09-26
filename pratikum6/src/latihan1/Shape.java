/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan1;

/**
 *
 * @author HP
 */
public class Shape {
    public double length;
    public double width;
    public double heigth;
    public double volume;
    
    public Shape(double length, double width, double heigth) {
        this.length = length;
        this.width = width;
        this.heigth = heigth;
    }
    
    public double compareTo(Shape shape) {
        shape.calculateVolume();
        if(shape.volume > this.volume) {
            return shape.volume - this.volume;
        }
        else {
            return this.volume - shape.volume;
        }
    }
    
    private void calculateVolume () {
        volume = length * width * heigth;
        
    }
    
    public void cetak() {
        calculateVolume();
        System.out.println("panjang x lebar x tinggi : " + length + "x" + width + "x" + heigth);
        System.out.println("Volume : " + volume);
    }
}
