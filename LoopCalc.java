import java.util.Scanner;

public class LoopCalc {

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        int numberOne;
        String operand;
        int numberTwo;
        int result;

        while (true) {

            System.out.println("Please enter a number: ");
            numberOne = sc.nextInt();

            System.out.println("Please enter an operand(use +,-,*, or / ");
            operand = sc.next();

            System.out.println("Please enter another number: ");
            numberTwo = sc.nextInt();

            if (numberOne == 0 && numberTwo == 0){
                break;
            }

            switch (operand) {
                case "+":
                    System.out.println(" Your result is: " + (numberOne + numberTwo));
                    break;

                case "-":
                    System.out.println(" Your result is: " + (numberOne - numberTwo));
                    break;

                case "*":
                    System.out.println(" Your result is: " + (numberOne * numberTwo));
                    break;

                case "/":
                    System.out.println(" Your result is: " + numberOne / numberTwo);
                    break;

            }



        }

    }
}
