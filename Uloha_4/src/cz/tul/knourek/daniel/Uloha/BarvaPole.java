package cz.tul.knourek.daniel.Uloha;

import java.util.Scanner;

public class BarvaPole {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ProblemCount = input.nextInt();
            int InRow = input.nextInt();
            int InCol = input.nextInt();

            System.out.printf("%d %d %n",InRow,InCol);
    }
}
