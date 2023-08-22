package latihan_1;

public class Tabungan {
    public int saldo;
    public Tabungan(int saldo) {
        this.saldo = saldo;
    }
    public boolean ambilUang(int uang) {
        if(saldo > uang) {
            saldo = saldo - uang;
            return true;
        }
        else {
            return false;
        }
    }
}
