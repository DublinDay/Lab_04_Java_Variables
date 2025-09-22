//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int intOperandA = 1;
        int intOperandB = 8;
        int intSum = 10;
        int intProduct = 30;
        int intDifference = 29;
        int intQuotient = 40;
        int intModulo = 60;
        double doubleOperandA = 90.1;
        double doubleOperandB = 5.5;
        double doubleSum = 12.2;
        double doubleProduct = 82.6;
        double doubleDifference = 76.5;
        double doubleQuotient = 94.4;
        double doubleModulo = 56.6;

            intSum = intOperandA + intOperandB;
            System.out.println("The sum using ints of " + intOperandA + " " + intOperandB + " is " + intSum);
            intProduct = intOperandA * intOperandB;
            System.out.println("The product using ints of " + intOperandA + " " + intOperandB + " is " + intProduct);
            intDifference = intOperandA - intOperandB;
            System.out.println("The difference using ints of " + intOperandA + " " + intOperandB + " is " + intDifference);
            intProduct = intOperandA/intOperandB;
            System.out.println("The quotient using ints of " + intOperandA + " " + intOperandB + " is " + intQuotient);
            intModulo = intOperandA%intOperandB;
            System.out.println("The modulo using ints of " + intOperandA + " " + intOperandB + " is " + intModulo);

        doubleSum = doubleOperandA + doubleOperandB;
        System.out.println("The sum using doubles of " + doubleOperandA + " " + doubleOperandB + " is " + doubleSum);
        doubleProduct = intOperandA * intOperandB;
        System.out.println("The product using doubles of " + doubleOperandA + " " + doubleOperandB + " is " + doubleProduct);
        doubleDifference = doubleOperandA - doubleOperandB;
        System.out.println("The difference using doubles of " + doubleOperandA + " " + doubleOperandB + " is " + doubleDifference);
        doubleProduct = doubleOperandA/doubleOperandB;
        System.out.println("The quotient using doubles of " + doubleOperandA + " " + doubleOperandB + " is " + doubleQuotient);
        doubleModulo = doubleOperandA%intOperandB;
        System.out.println("The modulo using doubles of " + doubleOperandA + " " + doubleOperandB + " is " + doubleModulo);

        int numKidsInFam = 4;
        boolean rainToday= true;
        double gasPrice= 2.85;
        int favNum = 14;
        double shoeSize = 10.5;
        String birthMonth = "October";
        String fullName = "Dublin Liberty Marcella Day";

        System.out.println("The number of kids in my family, including me, is " + numKidsInFam);
        System.out.println("Has it rained today? " + rainToday);
        System.out.println("The price of gas today is " + gasPrice);
        System.out.println("My favorite number is " + favNum);
        System.out.println("My shoe size is " + shoeSize);
        System.out.println("My birth month is " + birthMonth);
        System.out.println("My full name is " + fullName);

    }
}