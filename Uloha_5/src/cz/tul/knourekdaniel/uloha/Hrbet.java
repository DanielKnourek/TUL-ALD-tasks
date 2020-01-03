package cz.tul.knourekdaniel.uloha;

import java.awt.Point;
import java.util.Scanner;

public class Hrbet {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int height;
        while ((height = input.nextInt()) > 0) {
            int width = input.nextInt();
            int[][] matrix = loadMatrix(height, width);
            
            int biggest = biggestNum(matrix);
            Point start = findFirstOccurrence(matrix, biggest);
            String out;
            
            int[] pos = searchRow(matrix, start, biggest);
            if (pos[0] < 0) {
                pos = searchCol(matrix, start, biggest);
            }
            if (pos[0] < 0 ){
                out = ""+-1;
            }else{
                out = ((pos[0]+1) + " " + (pos[1]+1) + " " + (pos[2]+1) + " " + (pos[3]+1));
            }
            System.out.println(out);
        }
    }

    private static int[] searchCol(int[][] matrix, Point start, int num) {
        int[] pos = new int[]{start.y, start.x, start.y, start.x};
        
        int len = 0;
        for (int y = start.y; y < matrix.length; y++) {
            if (matrix[y][start.x] == num){
                len++;
                pos[2] = y;
            }else{
                break;
            }
        }
        if (len <= 1 || len != NumCount(matrix, num)){
            pos[0] = -1;
        }
        return pos;
    }


    private static int[] searchRow(int[][] matrix, Point start, int num) {
        int[] pos = new int[]{start.y, start.x, start.y, start.x};

        int len = 0;
        for (int x = start.x; x < matrix[0].length; x++) {
            if (matrix[start.y][x] == num){
                len++;
                pos[3] = x;
            }else{
                break;
            }
        }        
        if (len <= 1 || len != NumCount(matrix, num)) {
            pos[0] = -1;
        }
        return pos;
    }
    
    private static Point findFirstOccurrence(int[][] matrix, int num){
        for (int y = 0; y < matrix.length; y++) {
            for (int x = 0; x < matrix[y].length; x++) {
                if (matrix[y][x] == num){
                    return new Point(x,y);
                }
            }
        }        
        return new Point(-1, -1);
    }
    
    private static int NumCount(int[][] matrix, int num) {
        int count = 0;
        for (int[] row : matrix) {
            for (int cell: row) {
                if(cell == num){
                    count++;
                }
            }
        }
        return count;
    }
    
    private static int biggestNum(int[][] matrix) {
        int biggest = Integer.MIN_VALUE;
        for (int[] row: matrix) {
            for (int cell: row) {
                biggest = Math.max(cell, biggest);
            }
        }
        return biggest;
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