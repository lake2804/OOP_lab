package Abc;
import java.util.Scanner;

public class LinearEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();
        if (a != 0) {
            System.out.println("Nghiệm của phương trình: x = " + (-b / a));
        } else {
            System.out.println("Phương trình vô nghiệm hoặc vô số nghiệm.");
        }
        scanner.close();
    }
}