import java.util.Scanner;

public class SumOfuserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the first number: ");
        Double num1 = input.nextDouble();
        System.out.print("Input the second number: ");
        Double num2 = input.nextDouble();
        Double sum = num1 + num2;
        System.out.println();
        System.out.println("Sum: " + sum);
    }
}
