package cz.tul.knourek.daniel.Homework.Uloha;

import java.util.Scanner;

public class TabulkaPozice{

    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int Row = Integer.parseInt(input.next());
        int Col = Integer.parseInt(input.next());
        int Position = Integer.parseInt(input.next());
        int ResultRow = Position/Col;
        if (Position%Col != 0 ) { ResultRow++;}
        int ResultCol = Position-((ResultRow-1)*Col);

        System.out.println(ResultRow + " " + ResultCol);
    }

}