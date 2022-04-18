package com.company;

import javax.lang.model.type.ArrayType;
import java.util.*;

public class Main {

    public static void main(String[] args) {



    }

    public static List phoneNumber(String digits){

        String[] splitted = digits.split("");

        Map<String, List<String>> map = new HashMap<>();
        map.put("2", List.of(new String[]{"a", "b", "c"}));
        map.put("3", List.of(new String[]{"d", "e", "f"}));
        map.put("4", List.of(new String[]{"g", "h", "i"}));
        map.put("5", List.of(new String[]{"j", "k", "l"}));
        map.put("6", List.of(new String[]{"m", "n", "o"}));
        map.put("7", List.of(new String[]{"p", "q", "r","s"}));
        map.put("8", List.of(new String[]{"t", "u", "v"}));
        map.put("9", List.of(new String[]{"w", "x", "y","z"}));


        List<String> result = new ArrayList<>();
        List<List<String>> digit = new ArrayList<>();

        if (digits.equals("") )
        {
            return Collections.emptyList();
        }
        if (digits.length() == 1)
        {
            return map.get(digits);
        }

        else {

            for (int i = 0; i < digits.length(); i++)
            {
                digit.add(i, map.get(splitted[i]));
            }

            // add to result both char values

            for (int i = 0; i < digit.size() - 1; i++)
            {
                for (int j = 0; j < digit.get(i).size() ; j++)
                {
                    for (int k = 0; k < digit.get(i+1).size(); k++)
                    {
                        String joinedStr = digit.get(i).get(j) + digit.get(i+1).get(k);
                        result.add(joinedStr);
                    }
                }
            }
            return result;
        }
    }
}
