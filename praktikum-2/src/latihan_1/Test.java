package latihan_1;

public class Test {
    public static void main(String args[]) {
        Tabungan tabungan = new Tabungan(5000);
        System.out.println("Saldo awal : " + tabungan.saldo);
        tabungan.ambilUang(2300);
        System.out.println("Jumlah Uang yang Diambil : 2300");
        System.out.println("Saldo sekarang : " + tabungan.saldo);
    }
}
