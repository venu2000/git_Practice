import java.util.Scanner;

public class Calculator {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the first number: ");
    int firstNumber = scanner.nextInt();

    System.out.print("Enter the second number: ");
    int secondNumber = scanner.nextInt();

    Calculator calculator = new Calculator();
    System.out.println("Addition: " + calculator.addition(firstNumber, secondNumber));
    System.out.println("Subtraction: " + calculator.sub(firstNumber, secondNumber));
    System.out.println("Multiplication: " + calculator.pow(firstNumber, secondNumber));

    if (secondNumber == 0) {
      System.out.println("Division: cannot divide by zero");
    } else {
      System.out.println("Division: " + calculator.div(firstNumber, secondNumber));
    }

    scanner.close();
  }

  public int addition(int firstNumber, int secondNumber) {
    return firstNumber + secondNumber;
  }

  public int sub(int firstNumber, int secondNumber) {
    return firstNumber - secondNumber;
  }

  public int div(int firstNumber, int secondNumber) {
    return firstNumber / secondNumber;
  }

  public int pow(int firstNumber, int secondNumber) {
    return firstNumber * secondNumber;
  }
}