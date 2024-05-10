package inputdanoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bufferedreader {
    public static void main(String[] args) {
        
        InputStreamReader streamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(streamReader);

        System.out.println("Program Penjumlahan Sangat sederhana");
        
        int value = 0;
        int  anothervalue = 0;

        try{
            System.out.println("Masukkan Angka pertama : ");
            value = Integer.parseInt(bufferedReader.readLine());
            System.out.println("Masukkan Angka kedua : ");
            anothervalue = Integer.parseInt(bufferedReader.readLine());
        
        }catch(IOException e){
            e.printStackTrace();
        }
        int resul = value + anothervalue; 
        System.out.println("Hasilnya Adalah : " + resul);
    }
}
