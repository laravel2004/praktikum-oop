package tugas_2;

public class Mobil {
    public String merek;
    public String warna;
    public String jenis;
    public int harga;
    public int jumlahPenumpang;
    
    public Mobil(String merek, String warna, String jenis, int harga, int jumlahPenumpang) {
        this.merek = merek;
        this.warna = warna;
        this.jenis = jenis;
        this.harga = harga;
        this.jumlahPenumpang = jumlahPenumpang;
    }
    public void infoMobil() {
        System.out.print(merek + " ");
        System.out.print(warna + " ");
        System.out.print(jenis + " ");
        System.out.print(harga + " ");
        System.out.println(jumlahPenumpang);
    }
}
