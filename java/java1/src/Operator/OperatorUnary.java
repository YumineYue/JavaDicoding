package Operator;

public class OperatorUnary {
    
    public static void main(String[] args) {
        
        System.out.println("Operasi Unary Plus ");
        int nilaiawal = 5;
        int hasil = +nilaiawal;
        
        System.out.println("Hasil +5 = " + hasil);
        System.out.println();

        System.out.println("Operator Unary Minus");
        int nilaiAwal2 = 5;
        nilaiAwal2 = -nilaiAwal2;
        System.out.println("Hasil -5 = " + nilaiAwal2);
        System.out.println();

        System.out.println("Operator peningkatan point 1");
        int nilaiawal3 = 5;
        nilaiawal3++;

        System.out.println("Hasil 5 ++ = " + nilaiawal3);
        System.out.println();

        System.out.println("Operator pengurangan point 1");
        int nilaiawal4 = 5;
        nilaiawal4--;

        System.out.println("Hasil dari 5-- = " + nilaiawal4);
        System.out.println();

        System.out.println("Operator Komplemen Logika ");
        Boolean sukses = false;
        
        System.out.println("Hasil !false = " + sukses);
        System.out.println();
        


    }
}
