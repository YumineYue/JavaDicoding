package Operator;

public class OperatorEquality {
    
    public static void main(String[] args) {
        
        int value = 5;
        int anothervalue =  4;
        boolean result;
        result = value == anothervalue;

        System.out.println("Hasil value == anotherValue' adalah = " + result);
        System.out.println();

        System.out.println("Tidak sama dengan..");
        result = value != anothervalue;
        System.out.println("Hasil value != anothervalue' adalah = " + result);
        System.out.println();

        System.out.println("Lebih besar dari..");
        result = value > anothervalue;
        System.out.println("Hasil value > anothervalue adalah = " + result);
        System.out.println();

        System.out.println("Sama atau lebih besar dari..");
        result = value >= anothervalue;
        System.out.println("Hasil value >= anothervalue adalah = " + result);
        System.out.println();

        System.out.println("Kurang dari..");
        result = value < anothervalue;
        System.out.println("Hasil value < anothervalue adalah = " + result);
        System.out.println();

        System.out.println("Sama atau kurang dari..");
        result = value <= anothervalue;
        System.out.println("Hasil result <= anothervalue = " + result);
        System.out.println();


    }
}
