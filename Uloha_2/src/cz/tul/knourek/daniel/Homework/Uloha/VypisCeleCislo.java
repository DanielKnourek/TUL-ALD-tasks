package cz.tul.knourek.daniel.Homework.Uloha;

import java.util.Scanner;

class VypisCeleCislo
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int val = Integer.parseInt(input.next());
        if(val>=0){
            System.out.print("+");
        }else if(val<0){
            System.out.print("-");
            val *= -1;
        }
        System.out.println(String.format("%03d",val));
    }
}