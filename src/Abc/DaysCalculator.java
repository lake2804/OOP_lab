package Abc;

import java.time.YearMonth;
import java.util.Scanner;

public class DaysCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tháng (1-12): ");
        int month = sc.nextInt();
        System.out.print("Nhập năm: ");
        int year = sc.nextInt();
        YearMonth ym = YearMonth.of(year, month);
        System.out.println("Số ngày trong tháng: " + ym.lengthOfMonth());
        sc.close();
    }
}