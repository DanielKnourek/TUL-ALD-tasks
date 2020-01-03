package cz.tul.knourekdaniel.uloha;

import java.awt.*;
import java.util.Scanner;

public class Spirala {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int height;
        
        while ((height = input.nextInt()) > 0) {
            int width = input.nextInt();
            int[][] matrix = loadMatrix(height, width);

            String out;
            out = (check(matrix)) ? "1" : "0";
            
            System.out.println(out);
        }
    }

    private static boolean check(int[][] matrix) {
        Point Direction = new Point(1, 0); // to right
        Point Position = new Point(0, 0);
        int last = Integer.MIN_VALUE;
        boolean correct = true;

        for (int i = 0; i < (matrix.length * matrix[0].length); i++) {
            if (last > matrix[Position.y][Position.x]){
                correct = false;
                break;
            }
            last = matrix[Position.y][Position.x];
            Point nextPosition = new Point(Position.x + Direction.x, Position.y + Direction.y);
            if (validPlace(matrix, nextPosition)){
                matrix[Position.y][Position.x] = Integer.MIN_VALUE;
                Position = nextPosition;
            }else{
                matrix[Position.y][Position.x] = Integer.MIN_VALUE;
                Direction = rotate(1, Direction);
                Position = new Point(Position.x + Direction.x, Position.y + Direction.y);
            }
        }
        
        return correct;
    }

    private static boolean validPlace(int[][] matrix, Point pos) {
        boolean valid;
        valid = (pos.x >= 0 && pos.y >= 0);
        valid = (valid && pos.y < matrix.length && pos.x < matrix[pos.y].length );
        valid = (valid && matrix[pos.y][pos.x] != Integer.MIN_VALUE);
        return valid;
    }

    private static Point rotate(int step, Point direction) {
        int x = (direction.x * cosInDeg(step * 90)) - (direction.y * sinInDeg(step * 90));
        int y = (direction.x * sinInDeg(step * 90)) + (direction.y * cosInDeg(step * 90));
        return new Point(x, y);
    }
    
    private static int sinInDeg(int deg){
    return (int) Math.round( Math.sin( Math.toRadians(deg) ) );
}
    private static int cosInDeg(int deg){
        return (int) Math.round( Math.cos( Math.toRadians(deg) ) );
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