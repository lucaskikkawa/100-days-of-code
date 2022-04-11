package com.company;

public class Main {

    public static void main(String[] args) {

    }

    public static String checkBBQ(String[] skewers){
        int veg = 0, non_veg = 0;
        for (int i = 0; i < skewers.length; i++)
        {
            boolean found_non_veg = false;
            String[] splitted = skewers[i].split("");
            for (int j = 0; j < skewers[i].length(); j++)
            {
                if(splitted[j].equals("x")){
                    found_non_veg = true;
                    break;
                }
            }
            if (found_non_veg)
            {
                non_veg++;
            } else
            {
                veg++;
            }

        }
        return String.format("[%d, %d]",veg,non_veg);
    }
}
