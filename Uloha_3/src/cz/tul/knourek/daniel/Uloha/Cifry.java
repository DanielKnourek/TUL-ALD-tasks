package cz.tul.knourek.daniel.Uloha;

import java.util.Scanner;

public class Cifry {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true){
            long InVal = input.nextLong();
            if ( InVal <= 0 ){ break; }

            long Zbytek = Math.abs(InVal);
            long SoucetCifer = 0L;
            long NasobekCifer = 1L;

            do {
                long CifraN = Zbytek % 10;
                Zbytek = Zbytek / 10;
                SoucetCifer += CifraN;
                NasobekCifer *= CifraN;
            }while(Zbytek > 0);

            System.out.printf("%d %d%n", SoucetCifer, NasobekCifer);
        }
    }
}
