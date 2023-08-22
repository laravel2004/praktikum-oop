package percobaan_2;

public class Test {
    public static void main(String args[]) {
        Siswa anak = new Siswa();
        anak.setNrp(6);
        System.out.println(anak.nrp);
        int nilai = anak.getNrp();
        System.out.println(nilai);
    }
}
