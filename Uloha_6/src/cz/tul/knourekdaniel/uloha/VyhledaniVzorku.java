package cz.tul.knourekdaniel.uloha;

import java.util.Scanner;

public class VyhledaniVzorku {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String[] result = new String[]{"Vyskyt vzorku je mozny", "Vyskyt vzorku neni mozny"};
        char[] base = ("QWERTYUIOPASDFGHJKLZXCVBNM ").toCharArray();
        char[] offset;
        boolean isPossible;

        int problems = input.nextInt();
        input.nextLine();
        for (int problem = 0; problem < problems; problem++) {
            isPossible = false;
            String original = input.nextLine();
            String sample = input.nextLine();

            for (int i = 1; i < base.length+1; i++) {
                offset = shift(base, i);
                String encodedOriginal = encode(original, base, offset);
                if (encodedOriginal.contains(sample)) {
                    isPossible = true;
                    break;
                }
            }
            System.out.println((isPossible) ? result[0] : result[1]);
        }
    }

    private static String encode(String original, char[] base, char[] offset) {
        StringBuilder encoded = new StringBuilder();
        for (int i = 0; i < original.length(); i++) {
            encoded.append(findShiftedChar(original.charAt(i), base, offset));
        }
        return encoded.toString();
    }

    private static char findShiftedChar(char charAt, char[] base, char[] offset) {
        char out = charAt;
        for (int i = 0; i < base.length; i++) {
            if (charAt == base[i]) {
                out = offset[i];
                break;
            }
        }
        return out;
    }

    private static char[] shift(char[] base, int spaces) {
        char[] shifted = new char[base.length];
        for (int i = 0; i < base.length; i++) {
            shifted[(i + spaces + base.length) % shifted.length] = base[i];
        }
        return shifted;
    }
}