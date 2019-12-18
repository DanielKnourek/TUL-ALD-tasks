package cz.tul.knourekdaniel.uloha;

import java.util.Arrays;
import java.util.Scanner;

public class BlokovaMatice {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int height = input.nextInt();
        int width = input.nextInt();
        int[][] matrix = loadMatrix(height, width);
        int[] biggestDim = comparingMethod(height, width, matrix);
        String output = (biggestDim[0] <= 0) ? "-1" : (biggestDim[0] +" "+ biggestDim[1]);
        System.out.println(output);
    }

    private static int[] comparingMethod(int height, int width, int[][] matrix){
        int[] biggestDim = new int[]{0,0};
        int comparingNum = matrix[0][0];
        int[] comparingRow = matrix[0];

        biggestDim[1] = getBlockWidth(matrix);
        biggestDim[0] = getBlockHeight(matrix);

        for (int y = 0; y < height; y++) {
            if (comparingNum != matrix[y][0]){
                comparingNum = matrix[y][0];
                comparingRow = matrix[y];
                continue;
            }
            if (!checkRowValidity(matrix[y], biggestDim[1])){
                biggestDim[0] = -1;
                return biggestDim;
            }

            if (!Arrays.equals(comparingRow, matrix[y])){
                biggestDim[0] = -1;
                return biggestDim;
            }
        }
        return biggestDim;
    }

    private static boolean checkRowValidity(int[] matrix, int width) {
        boolean vaild = true;
        int len = 0;
        int prev = matrix[0];
        for (int i = 1; i < matrix.length; i++) {
            if (len < width){
                if (matrix[i] == prev){
                    len++;
                }else{
                    len = 0;
                }
            }else{
                return false;
            }
            prev = matrix[i];
        }
        if (len >= width){ vaild = false;}
        return vaild;
    }

    private static int getBlockWidth(int[][] matrix){
        int previous = matrix[0][0];
        int length = 0;
        for (int x = 0; x < matrix[0].length; x++) {
            if (previous != matrix[0][x]){
                return length;
            }
            length++;
        }
        return length;
    }
    private static int getBlockHeight(int[][] matrix){
        int previous = matrix[0][0];
        int length = 0;
        for (int y = 0; y < matrix.length; y++) {
            if (previous != matrix[y][0]){
                return length;
            }
            length++;
        }
        return length;
    }

    private static int[][] loadMatrix(int height, int width) {
        int[][] matrix = new int[height][width];
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                matrix[y][x] = input.nextInt();
            }
        }
        return matrix;
    }
}