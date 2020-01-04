package cz.tul.knourekdaniel.uloha;

import java.util.ArrayList;
import java.util.Scanner;

public class Zavorky {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        boolean valid = true;
        String expression = "";
        String brackets = "{[()]}";
        while ( !(expression += input.nextLine()).toUpperCase().contains("END") )
        expression = expression.substring(5,expression.length()-3).trim();

        ArrayList<Character> order = new ArrayList<>();
        for (char ch : expression.toCharArray()) {
            if (brackets.contains(ch+"")){
                order.add(ch);
            }
        }
        ArrayList<Character> inMemory = new ArrayList<>();
        if (order.size()>0) {
            inMemory.add(order.get(0));
        }
        
        for (int i = 1; i < order.size(); i++) {
            if (brackets.substring(0,3).contains(order.get(i)+"")){
                inMemory.add(order.get(i));
            }else{
                valid = (valid && checkTwin(order.get(i), inMemory.get(inMemory.size()-1), brackets));
                inMemory.remove(inMemory.size()-1);
            }
        }
        System.out.println((valid && inMemory.size() == 0) ? 1 : 0);
    }

    private static boolean checkTwin(Character ch1, Character ch2, String brackets) {
        return (brackets.indexOf(ch1) == brackets.length()-(brackets.indexOf(ch2)+1));
    }
}