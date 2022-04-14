package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        System.out.println(SockPairs("AA"));
    }

    public static int SockPairs (String socks)
        {
            if (socks.length() != 0)
            {
                String[] splitted = socks.split("");
                int sum = 0;
                Map<String,Integer > test = new HashMap<>();
                for (int i = 0; i < splitted.length; i++) // add socks to map
                {
                    if (test.containsKey(splitted[i]) )
                    {
                        test.put(splitted[i],test.get(splitted[i])+1);
                    }
                    else {
                        test.put(splitted[i], 1);
                    }
                }

                for (int value: test.values()) // count how many socks
                {
                    int num_pair = value / 2;
                    sum += num_pair;
                }
                return sum;
            } else
            {
                return 0;
            }



        }
}
