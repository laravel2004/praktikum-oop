/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan1;

/**
 *
 * @author HP
 */
public class Tabungan {
    private int saldo;
    
    public Tabungan(int saldo) {
        this.saldo = saldo;
    }
    public int getSaldo() {
        return saldo;
    }
    public void simpanUang(int simpan) {
        saldo += simpan;
    }
    public boolean ambilUang(int tarik) {
        if(saldo < tarik) {
            return false;
        }
        else{
            saldo -= tarik;
            return true;
        }
    }
}
