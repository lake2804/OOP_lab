package Abc;

import java.util.Scanner;
import java.util.Arrays;

public class MatrixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập kích thước ma trận: ");
        int size = sc.nextInt();
        int[][] matrixA = new int[size][size];
        int[][] matrixB = new int[size][size];
        int[][] matrixSum = new int[size][size];

        System.out.println("Nhập ma trận A:");
        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++)
                matrixA[i][j] = sc.nextInt();

        System.out.println("Nhập ma trận B:");
        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++)
                matrixB[i][j] = sc.nextInt();

        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++)
                matrixSum[i][j] = matrixA[i][j] + matrixB[i][j];

        System.out.println("Tổng hai ma trận:");
        for (int[] row : matrixSum)
            System.out.println(Arrays.toString(row));

        sc.close();
    }
}