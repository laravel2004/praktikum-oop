/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author HP
 */
public class Mahasiswa {
    public String nama;
    public int tahunMasuk;
    public int tahunKeluar;
    private int lamaBelajar;
    
    public Mahasiswa(String nama, int tahunMasuk, int tahunKeluar) {
        this.nama = nama;
        this.tahunMasuk = tahunMasuk;
        this.tahunKeluar = tahunKeluar;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void getIdentitas() {
        System.out.println("nama :" + nama);
        System.out.println("tahn masuk :" + tahunMasuk);
        System.out.println("tahun keluar" + tahunMasuk);
        System.out.println("lama belajar" + lamaBelajar);
    }
    
}
