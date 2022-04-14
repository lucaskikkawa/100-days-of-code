package com.company;

public class Main {

    public static void main(String[] args) {

    }

    public static int progressDays (int[] saturdays)
        {
            int count_prog_days = 0;
            for (int i = 0; i < saturdays.length-1; i++) // until next-to-last item in array
            {
                if (saturdays[i+1] > saturdays[i])
                {
                    count_prog_days++;
                }
            }
            return count_prog_days;
        }
}
