package inputdanoutput;

import java.util.Scanner;

public class inputoutputfunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program penjumlahan sangat sederhana");
        System.out.println("Masukkan akan pertama : ");
        int value = scanner.nextInt();
        System.out.println("Masukkan Angka Kedua : ");
        int anothervalue = scanner.nextInt();
        int result = value + anothervalue;
        System.out.println("Hasilnya adalah : " + result);

    }

}
