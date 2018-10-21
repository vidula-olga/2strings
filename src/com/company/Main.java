package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static List<String> splitToWords(String value) {
        String[] words=value.split("[ ,\\.!\\(\\)]");
        ArrayList<String> result = new ArrayList<>();
        for (String word:words) {
            if (! word.isEmpty())
                result.add(word);
        }
        return result;
    }

    public static void main(String[] args) {
        String string1 = "cтрочка пробел, запятая. точка! восклицательный(знак)скобка";
        String string2 = "пробел точка знак";
        List<String> words1=splitToWords(string1);
        List<String> words2=splitToWords(string2);

        for (String word:words1) {
            System.out.println(word);
        }


    }
}
