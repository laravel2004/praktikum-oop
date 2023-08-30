package percobaan_2;

class switchName {
    public static void main(String args[]) {
        char firstInitial = 'a';
        System.out.println("Masukan huruf awal anda : ");
        try {
            firstInitial = (char) System.in.read();
        }
        catch(Exception e) {
            System.out.println("Error : " + e.toString());
        }
        switch (firstInitial) {
            case 'a':
                System.out.println("Nama anda pasti asep!");
            case 'b':
                System.out.println("Nama anda pasti brodin!");
            case 'c':
                System.out.println("Nama anda pasti cecep!");
            default:
                System.out.println("Nama anda tidak dikenal");
        }
    }
}
