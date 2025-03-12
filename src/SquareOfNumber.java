import java.util.Scanner;

public class SquareOfNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scan.nextInt();
        int square = number * number;
        System.out.print("Square of number is: " + square);
    }
}
