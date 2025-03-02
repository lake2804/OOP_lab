package Abc;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số thứ nhất: ");
        double firstNumber = input.nextDouble();
        System.out.print("Nhập số thứ hai: ");
        double secondNumber = input.nextDouble();

        System.out.printf("Tổng: %.2f\n", (firstNumber + secondNumber));
        System.out.printf("Hiệu: %.2f\n", (firstNumber - secondNumber));
        System.out.printf("Tích: %.2f\n", (firstNumber * secondNumber));
        if (secondNumber != 0) {
            System.out.printf("Thương: %.2f\n", (firstNumber / secondNumber));
        } else {
            System.out.println("Không thể chia cho số 0.");
        }
        input.close();
    }
}