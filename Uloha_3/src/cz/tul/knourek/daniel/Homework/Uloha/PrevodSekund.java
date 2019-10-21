package cz.tul.knourek.daniel.Homework.Uloha;

import java.util.Scanner;

public class PrevodSekund {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sekundy = sc.nextInt();
        System.out.println(String.format("%02d:%02d:%02d",sekundy/3600,sekundy%3600/60,sekundy%60));
    }
    
}