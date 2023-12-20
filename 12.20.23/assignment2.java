package practice;

import java.io.*;

public class assignment2 {

    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(isr);
        int rows = 0, columns = 0;
        int sum = 0;
        double average = 0.0;

        try {
            System.out.println("Number of rows: ");
            rows = Integer.parseInt(input.readLine());

            System.out.println("Number of columns: ");
            columns = Integer.parseInt(input.readLine());

            int[][] a = new int[rows][columns];
            System.out.println("Elements:");

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                	 System.out.println("el. [" + i + "][" + j + "]");
                    a[i][j] = Integer.parseInt(input.readLine());
                    sum += a[i][j];
                }
            }

            int total = rows * columns;
            average = sum / (double) total;

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
