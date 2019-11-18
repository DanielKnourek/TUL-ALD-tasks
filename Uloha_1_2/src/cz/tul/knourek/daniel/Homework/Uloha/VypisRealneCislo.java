package cz.tul.knourek.daniel.Homework.Uloha;

import java.util.Scanner;

class VypisRealneCislo
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        Float val = Float.parseFloat(input.next().replace(",","."));
        System.out.println(String.format("%10.3f",val));
    }
}