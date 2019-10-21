package cz.tul.knourek.daniel.Homework.Uloha;

import java.util.Scanner;

public class TabulkaPoradi {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int Row = Integer.parseInt(input.next());
        int Col = Integer.parseInt(input.next());
        int PositionX = Integer.parseInt(input.next());
        int PositionY = Integer.parseInt(input.next());
        int[][] Table = new int[Row][Col];
        int PositionID = 1;
        for (int i = 0; i < Row; i++) {
            for (int j = 0; j < Col; j++) {
                Table[i][j] = PositionID;
                PositionID++;
            }
        }
        System.out.println(Table[PositionX-1][PositionY-1]);
    }

}