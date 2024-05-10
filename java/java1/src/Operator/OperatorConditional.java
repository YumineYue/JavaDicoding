package Operator;

public class OperatorConditional {
    
    public static void main(String[] args) {
        
        int value = 4;
        int anothervalue = 5;

        System.out.println("Conditional AND ");
        boolean result = value == 3 && anothervalue == 5;
        boolean AnotherResult = value != 3 && anothervalue == 5;

        System.out.println("Hasil Operator AND pada syarat value == 3 dan anothervalue == 5 adalah " + result);
        System.out.println("Hasil Operator AND pada syarat value != 3 dan anothervlue == 5 adalah " + AnotherResult);
        System.out.println();

        System.out.println("Conditional OR");
        result = value == 3 || anothervalue == 5;
        AnotherResult = value != 3 || anothervalue == 5;

        System.out.println("Hasil Operator OR pada syarat value == 3 dan anothervalue == 5 adalah " + result);
        System.out.println("Hasil Operator OR pada syarat value != 3 dan anothervalue == 5 adalah " + AnotherResult);
        System.out.println();
        
    }
}
