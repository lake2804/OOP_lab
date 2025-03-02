package Abc;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayUtils {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử: ");
        int n = sc.nextInt();
        double[] arr = new double[n];
        double sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử " + (i + 1) + ": ");
            arr[i] = sc.nextDouble();
            sum += arr[i];
        }
        Arrays.sort(arr);
        System.out.println("Mảng đã sắp xếp: " + Arrays.toString(arr));
        System.out.println("Tổng các phần tử: " + sum);
        System.out.println("Giá trị trung bình: " + (sum / n));
        sc.close();
    }
}