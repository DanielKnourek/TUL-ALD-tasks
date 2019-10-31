package cz.tul.knourek.daniel.Uloha;

import java.util.Scanner;

public class Cifry {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true){
            Long InVal = input.nextLong();
            if ( InVal < 0 ){ break; }

            Long Zbytek = InVal;
            int SoucetCifer = 0;
            int NasobekCifer = 1;

            do {
                Long CifraN = Zbytek % 10;
                Zbytek = Zbytek / 10;
                SoucetCifer += CifraN;
                NasobekCifer *= CifraN;
            }while(Zbytek > 0);

            System.out.printf("%d %d%n", SoucetCifer, NasobekCifer);
        }
    }
}
