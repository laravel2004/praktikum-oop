package tugas;

public class Suhu {
    public double suhu;
    private int pilihan;
    
    public Suhu(double suhu) {
        this.suhu = suhu;
    }
    public void getChoice(int pilihan) {
        this.pilihan = pilihan;
    }
    
    public double generateConvert() {
        double hasil;
        switch (pilihan) {
            case 1:
                hasil = suhu * 2;
                break;
            case 2 :
                hasil = suhu * 3;
            default:
                throw new AssertionError();
        }
        return hasil;
    }
    
}
