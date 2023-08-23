package tugas_2;

public class Test {
    public static void main(String asd[]) {
        Mobil mobil1 = new Mobil("Toyota", "Biru", "minibus", 2000, 7);
        Mobil mobil2 = new Mobil("Daihatsu", "Hitam", "pickup", 1500, 2);
        Mobil mobil3 = new Mobil("Suzuki", "Silver", "suv", 1800, 5);
        Mobil mobil4 = new Mobil("Honda", "Merah", "sedan", 1300, 5);
        mobil1.infoMobil();
        mobil2.infoMobil();
        mobil3.infoMobil();
        mobil4.infoMobil();
    }
}
