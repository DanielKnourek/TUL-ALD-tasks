package cz.tul.knourekdaniel.uloha;

import java.util.Scanner;

public class TestCyklickePosloupnosti {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long Counter = input.nextLong();
        //Počet úloh
        for (int i = 0; i < Counter; i++) {
            //Začátek úlohy
            boolean Valid = true;
            long Largest = Long.MIN_VALUE;
            long Vals = input.nextLong();

            long Previous = input.nextLong();
            Largest = Math.max(Previous, Largest);
            for (int j = 0; j < Vals-1; j++) {
                long Current = input.nextLong();
                Largest = Math.max(Current, Largest);
                if ( Current == Previous + 1 ){
                    Previous = Current;
                }else if ( Current == 0){
                    Previous = 0;
                }else{
                    Valid = false;
                }
            }
            System.out.printf("%d%n",(Valid) ? Largest+1 : -1);
        }
    }
}
