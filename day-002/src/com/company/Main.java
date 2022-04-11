package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static String findNemo(String phrase){
        String []splitted = phrase.split(" ");
        int position = 0;
        for (int i = 0; i < splitted.length; i++)
        {
            if (splitted[i].equals("Nemo"))
            {
                position = i + 1;
                break;
            }
        }
        if (position != 0)
        {
            return String.format("I found Nemo at %s!",position);
        } else
        {
            return "I can't find Nemo :(";
        }
    }
}
