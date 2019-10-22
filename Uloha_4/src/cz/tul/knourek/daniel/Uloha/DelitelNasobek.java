package cz.tul.knourek.daniel.Uloha;

import java.util.Scanner;

public class DelitelNasobek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean run = true;
        while (run){
            Long InValA = input.nextLong();
            if ( InValA < 0 ){break; }

            Long InValB = input.nextLong();
            Long Nasobek = InValA;
            Long Delitel = 1l;
            Long ValA = InValA;
            Long ValB = InValB;

            while (ValB != 0) {
                long tmp = ValA;
                ValA = ValB;
                ValB = tmp % ValB;
            }
            Delitel = ValA;

//
//            Long i = Delitel;
//            Long SmallerNum = (InValA< InValB) ? InValA:InValB;
//            Long BiggerNum = (InValA > InValB) ? InValB:InValA;
//
//            while (i <= InValA && i <= InValB){
//                if(InValA % i == 0 && InValB % i == 0){Delitel = i;}
//                i++;
//            }
//
//            while (Nasobek % SmallerNum != 0){
////                if(Nasobek % InValA == 0 && Nasobek % InValB == 0){break;}
//                Nasobek += BiggerNum;
//            }
            Nasobek = (InValA * InValB)/Delitel;

            System.out.printf("%d %d%n",Delitel, Nasobek);
        }

//    }
//    public static int gcd(int a, int b) {
//        if (a < 1 || b < 1) throw new IllegalArgumentException("a or b is less than 1");
//        while (b != 0) {
//            int tmp = a;
//            a = b;
//            b = tmp % b;
//        }
//        return a;
    }
}
