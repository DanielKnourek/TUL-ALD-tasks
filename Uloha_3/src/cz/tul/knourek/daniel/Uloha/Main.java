package cz.tul.knourek.daniel.Uloha;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true){
            boolean A = input.nextInt() != 0;
            boolean B = input.nextInt() != 0;
//            System.out.println(A && B);
//            System.out.println(!A || B);
            System.out.println(A == B);
        }
    }

}