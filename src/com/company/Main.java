package com.company;

public class Main {
    private static String[] splitToWords(String value) {
        return value.split(" ");
    }

    public static void main(String[] args) {
        String string1 = "cтрочка пробел, запятая. точка! восклицательный(знак)скобка";
        String string2 = "пробел точка знак";
        String[] words1=splitToWords(string1);
        String[] words2=splitToWords(string2);

        for (String word:words1) {
            System.out.println(word);
        }


    }
}
