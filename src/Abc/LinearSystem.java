package Abc;

import java.util.Scanner;

public class LinearSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập a11: ");
        double a11 = sc.nextDouble();
        System.out.print("Nhập a12: ");
        double a12 = sc.nextDouble();
        System.out.print("Nhập b1: ");
        double b1 = sc.nextDouble();

        System.out.print("Nhập a21: ");
        double a21 = sc.nextDouble();
        System.out.print("Nhập a22: ");
        double a22 = sc.nextDouble();
        System.out.print("Nhập b2: ");
        double b2 = sc.nextDouble();

        double D = a11 * a22 - a12 * a21;
        double Dx = b1 * a22 - b2 * a12;
        double Dy = a11 * b2 - a21 * b1;

        if (D == 0) {
            if (Dx == 0 && Dy == 0) {
                System.out.println("Hệ phương trình có vô số nghiệm.");
            } else {
                System.out.println("Hệ phương trình vô nghiệm.");
            }
        } else {
            double x = Math.round((Dx / D) * 100.0) / 100.0;
            double y = Math.round((Dy / D) * 100.0) / 100.0;
            System.out.printf("Nghiệm của hệ phương trình là: x = %.2f, y = %.2f\n", x, y);
        }
        sc.close();
    }
}