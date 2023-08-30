package post.test;

public class Kubus {
    int sisi;
    Persegi persegi;
    
    public Kubus (int sisi) {
        this.persegi = new Persegi(sisi); 
        this.sisi = sisi;
    }
    
    
    public int volume() {
        return sisi * sisi * sisi;
    }
    public int luas(){
        int luasPersegi = persegi.luas();
        return (luasPersegi * 6);
    }
}
