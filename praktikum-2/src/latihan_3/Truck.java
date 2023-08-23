package latihan_3;

public class Truck {
    public double muatan;
    public double muatanmaks;
    
    public Truck(double muatanmaks){
        this.muatanmaks = muatanmaks;
    }
    
    public void tambahMuatan(double berat) {
        if((muatan + berat) < muatanmaks) {
            muatan += berat;
        }
    }
    public double getMuatanMaks() {
        return muatanmaks;
    }
    public double getMuatan() {
        return muatan;
    }
}
