package cz.tul.knourekdaniel.uloha;

import java.util.Scanner;

public class Hrbet {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int height;
        while ((height = input.nextInt()) > 0){
            int width = input.nextInt();
            
            int[][] matrix = loadMatrix(height, width);
            
            int[] pos = searchRows(matrix);
            if (pos[0] == -1) {
                pos = searchcols(matrix);
            }
            if (pos[0] == -1){
                System.out.println(-1);
            }else{
                System.out.println(pos[0] + " " + pos[1] + " " + pos[2] + " " + pos[3]);
            }

        }
    }

    private static int[] searchcols(int[][] matrix) {
        int[] pos = new int[4];
        int len = 1;
        int prev = matrix[0][0];
        boolean found = false;

        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == 0 && j == 0){ continue; }

                if (prev == matrix[j][i]){
                    len++;
                    if (!found){
                        pos[0] = i;
                        pos[1] = j+1;
                    }
                    found = true;
                }else if (len > 1){
                    pos[2] = pos[0]+len-1;
                    pos[3] = pos[1];
                    return pos;
                }
                prev = matrix[j][i];
            }
        }
        pos[0] = -1;
        return pos;
    }

    private static int[] searchRows(int[][] matrix) {
        int[] pos = new int[4];
        int len = 1;
        int prev = matrix[0][0];
        boolean found = false;
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == 0 && j == 0){ continue; }
                
                if (prev == matrix[i][j]){
                    len++;
                    if (!found){
                        pos[0] = i-len;
                        pos[1] = j;
                    }
                    found = true;
                }else if (len > 1){
                    pos[2] = pos[0];
                    pos[3] = pos[1]+len-1;
                    return pos;
                }
                prev = matrix[i][j];
            }
        }
        pos[0] = -1;
        return pos;
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