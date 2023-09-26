
package latihan1;

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
        double volume = shape.calculateVolume();
        double result = this.volume - volume;
        return result;
    }
    
    private double calculateVolume () {
        volume = length * width * heigth;
        return volume;
    }
    
    public void cetak() {
        calculateVolume();
        System.out.println("panjang x lebar x tinggi : " + length + "x" + width + "x" + heigth);
        System.out.println("Volume : " + volume);
    }
}
