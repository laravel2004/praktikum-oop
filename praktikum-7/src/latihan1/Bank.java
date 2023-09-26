package latihan1;

import java.util.ArrayList;

public class Bank {
    private int jumlahNasabah;
    private ArrayList<Nasabah> nasabah;
    
    public Bank() {
        this.jumlahNasabah = 0;
        this.nasabah = new ArrayList<>();
    }
    
    public void tambahNasabah(String namaAwal, String namaAkhir, int saldo, String pin) {      
        this.nasabah.add(new Nasabah(namaAwal, namaAkhir));
        this.getNasabah(nasabah.size()-1).setTabungan(new Tabungan(saldo));
        this.getNasabah(nasabah.size()-1).setPin(pin);
    }
    
    public void removeNasabah(int index) {
        this.nasabah.remove(index);
        this.jumlahNasabah -= 1;
    }
    
    public void updateNasabah(int index, Nasabah nasabah,int saldo, String pin) {
        this.nasabah.remove(index);
        this.nasabah.add(nasabah);
        this.getNasabah(index).setTabungan(new Tabungan(saldo));
        this.getNasabah(index).setPin(pin);
    }
    
    public boolean isNasabahExist(String namaAwal, String namaAkhir) {
        for(Nasabah nasabah :this.nasabah) {
            if(nasabah.getNamaAwal().equals(namaAwal) && nasabah.getNamaAkhir().equals(namaAkhir)) {
                return true;
            }
        }
        return false;
    }
    
    public int getJumlahNasabah() {
        return nasabah.size();
    }
    public Nasabah getNasabah(int index) {
        return nasabah.get(index);
    }
    public int getIndexNasabah(String namaAwal, String namaAkhir) throws Exception{
        int index = 0;
        for(Nasabah nasabah : this.nasabah) {
            if(nasabah.getNamaAwal().equals(namaAwal) && 
                    nasabah.getNamaAkhir().equals(namaAkhir)) {
                return index;
            }
            index++;
        }
        throw new  Exception("user not found");
    }
}
