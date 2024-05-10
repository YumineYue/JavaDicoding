package strukturdasar.main;


import java.util.Date;

import org.apache.commons.lang3.time.DateUtils;

import strukturdasar.Kendaraan.*;
import strukturdasar.Musik.gitar;

public class Main{

    public static void main(String[] args){
        System.out.println("Hello World !");

        Kereta.Banyakban();
        Mobil.Banyakban();
        Motor.Banyakban();
        gitar.bunyi();

        Date today = new Date();
        System.out.println("Hari ini = " + today );
        Date tomorrow = DateUtils.addDays(today, 1);
        System.out.println("Besok = " + tomorrow);

    }
}