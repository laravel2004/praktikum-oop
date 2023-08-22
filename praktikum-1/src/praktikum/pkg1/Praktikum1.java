package praktikum.pkg1;

import java.util.Scanner;

public class Praktikum1 {

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int menu = menu();
        System.out.println("Masukan nilai yang ingin dikonversi : ");
        int numberDecimal = number.nextInt();
        if (menu == 1) {
            String binaryresult = decimalToBinner(numberDecimal);
            console(binaryresult);
        } else if (menu == 2) {
            String hexaresult = decimalToHexa(numberDecimal);
            console(hexaresult);
        }

        number.close();
    }

    public static String decimalToBinner(int decimal) {
        String resultBinner = "";
        while (decimal > 0) {
            int modulo = decimal % 2;
            resultBinner = modulo + resultBinner;
            decimal = decimal / 2;
        }
        return resultBinner;
    }

    public static String decimalToHexa(int decimal) {
        String resultHexa = "";
        while (decimal > 0) {
            int modulo = decimal % 16;
            if (modulo > 9) {
                char hexa = (char) (modulo - 10 + 'A');
                resultHexa = hexa + resultHexa;

            } else {
                resultHexa = modulo + resultHexa;
            }
            decimal = decimal / 16;
        }
        return resultHexa;
    }

    public static int menu() {
        Scanner menu = new Scanner(System.in);
        System.out.println("Pilih Menu");
        System.out.println("1. Decimal to Binner");
        System.out.println("2. Decimal to Hexadecimal");
        int respon = menu.nextInt();
        return respon;
    }

    public static void console(String binaryresult) {
        System.out.println("Hasil nya adalah " + binaryresult);
    }
}
