package latihan1;

public class Nasabah  {
    private String namaAwal;
    private String namaAkhir;
    private Tabungan tabungan;
    private String pin;
    
    public Nasabah(String namaAwal, String namaAkhir) {
        this.namaAwal = namaAwal;
        this.namaAkhir = namaAkhir;
        this.tabungan = new Tabungan(0);
        this.pin = "123123";
    }
    
    public String getNamaAwal() {
        return namaAwal;
    }
    public String getNamaAkhir() {
        return namaAkhir;
    }
    
    public String getPin() {
        return pin;
    }
    
    public String setPin(String pin) {
        this.pin = pin;
        return this.pin;
    }
    
    public Tabungan getTabungan() {
        return tabungan;
    }
    public void setTabungan(Tabungan tabungan) {
        this.tabungan = tabungan;
    }
}
