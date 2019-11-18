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









        /*
        //Počet úloh
        for (int i = 0; i < Counter; i++) {
            //Začátek úlohy
            long Values = input.nextLong();
            boolean Valid = true;
            boolean Repeating = false;
            long previous = Long.MIN_VALUE;
            long current;
            long Largest = Long.MIN_VALUE;

            for (int j = 0; j < Values; j++) {
                current = input.nextLong();
                Largest = Math.max(current, Largest);

                if (current == previous+1){
                    previous = current;
                }else if(!Repeating){
                    Repeating = true;
                    previous = Long.MIN_VALUE;
                }else if(Largest == current){
                    Repeating = false;
                }else {
                    Valid = false;
                    break;
                }
            }

            System.out.println((Valid) ? "Je":"Není" );

        }*/
//        do {
//            long smallest = 0, largest = 0;
//            for (int i = 0; i < Counter; i++) {
//                long NumberToTest = input.nextLong();
//                if(i == 0){ smallest = NumberToTest; largest = NumberToTest;}
////                smallest = (NumberToTest < smallest) ? NumberToTest : smallest;
//                smallest = Math.min(NumberToTest, smallest);
////                largest = (NumberToTest > largest) ? NumberToTest : largest;
//                largest = Math.max(NumberToTest, largest);
//            }
//
//            System.out.printf("%d %d%n",smallest , largest);
//
//            Counter = input.nextLong();
//        }while(Counter >= 0);
    }
}
