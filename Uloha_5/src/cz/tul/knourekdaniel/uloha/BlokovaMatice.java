package cz.tul.knourekdaniel.uloha;

import java.util.Scanner;

public class BlokovaMatice {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int height = input.nextInt();
        int width = input.nextInt();
        int[][] matrix = loadMatrix(height, width);
        int[] biggestDim = new int[]{0, 0};

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int[] tmp = checkRow(x, y, matrix[x][y], matrix);
                if (tmp[0] * tmp[1] > biggestDim[0] * biggestDim[1]) {
                    biggestDim = tmp;
                }
            }
        }
//        System.out.println("height:"+biggestDim[1] +" width:"+biggestDim[0]);
        System.out.println(biggestDim[1] + " " + biggestDim[0]);
    }

    private static int[] checkRow(int x, int y, int currentNum, int[][] matrix) {
        int width = 0;
        int height = 1;
        for (int curCol = x; curCol < matrix.length; curCol++) {
            if (currentNum == matrix[curCol][y]) {
                width++;
            } else {
                break;
            }
        }
        if (y + 1 < matrix[0].length) {
            int[] tmpRes = checkRow(x, y + 1, currentNum, matrix);
            if (tmpRes[0] == width) {
                height = tmpRes[1] + 1;
            }
        }
        return new int[]{width, height};
    }

    private static int[][] loadMatrix(int height, int width) {
        int[][] matrix = new int[width][height];
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                matrix[x][y] = input.nextInt();
            }
        }
        return matrix;
    }
}
