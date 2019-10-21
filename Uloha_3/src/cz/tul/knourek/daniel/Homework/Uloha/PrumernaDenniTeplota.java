package cz.tul.knourek.daniel.Homework.Uloha;

import java.util.Scanner;
import java.util.Locale;

public class PrumernaDenniTeplota {
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        float prumernaTeplota = 0;

        prumernaTeplota += sc.nextFloat();
        prumernaTeplota += sc.nextFloat();
        prumernaTeplota += sc.nextFloat()*2;
        prumernaTeplota /= 4;
        
        System.out.format(Locale.US, "%1.2f", prumernaTeplota);
    }
}

