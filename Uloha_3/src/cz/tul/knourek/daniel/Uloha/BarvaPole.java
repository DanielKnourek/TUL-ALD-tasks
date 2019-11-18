package cz.tul.knourek.daniel.Uloha;

import java.util.Scanner;

public class BarvaPole {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean run = true;
        while (run) {
            int InX = input.nextInt();
            if ( InX < 0 ){break; }

            int InY = input.nextInt();
            boolean IsWhite = true;

            if(InY % 2 == 0 && InX % 2 == 1){ IsWhite = false;};
            if(InY % 2 == 1 && InX % 2 == 0 ){IsWhite = false;} ;

//            System.out.printf("Cell with column:%d and row:%d is %n", InX, InY);
            String ColorString = (IsWhite) ? "BILA" : "CERNA";
            System.out.printf(ColorString + "%s%n", "");
        }
    }
}
