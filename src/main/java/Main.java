import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Calculator calculator = new Calculator();

        System.out.println("Welcome to the calculator app!");

        boolean keepGoing = true;
        while (keepGoing) {
            System.out.println("What would you like to do?");
            Scanner in = new Scanner(System.in);
            String userCommand = in.next();
            int firstNum;
            int secondNum;
            switch(userCommand) {
                case "add":
                    System.out.print("Enter two numbers: ");
                    firstNum = in.nextInt();
                    secondNum = in.nextInt();
                    System.out.print('\n');
                    System.out.println("Your answer: " + calculator.add(firstNum, secondNum));
                    break;

                case "subtract":
                    System.out.print("Enter two numbers: ");
                    firstNum = in.nextInt();
                    secondNum = in.nextInt();
                    System.out.print('\n');
                    System.out.println("Your answer: " + calculator.subtract(firstNum, secondNum));
                    break;

                case "multiply":
                    System.out.print("Enter two numbers: ");
                    firstNum = in.nextInt();
                    secondNum = in.nextInt();
                    System.out.print('\n');
                    System.out.println("Your answer: " + calculator.multiply(firstNum, secondNum));
                    break;

                case "divide":
                    System.out.print("Enter two numbers: ");
                    firstNum = in.nextInt();
                    secondNum = in.nextInt();
                    System.out.print('\n');
                    System.out.println("Your answer: " + calculator.divide(firstNum, secondNum));
                    break;

                case "fib":
                    System.out.print("Enter a number: ");
                    firstNum = in.nextInt();
                    System.out.print('\n');
                    System.out.println("Your answer: " + calculator.fibonacciNumberFinder(firstNum));
                    break;

                case "binary":
                    System.out.print("Enter a number: ");
                    firstNum = in.nextInt();
                    System.out.print('\n');
                    System.out.println("Your answer: " + calculator.intToBinaryNumber(firstNum));
                    break;

                case "quit":
                    keepGoing = false;
                    System.out.println("Goodbye!");
                    break;

                default:
                    keepGoing = false;

            }
        }
    }
}
