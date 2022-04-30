package com.company;

import java.util.Arrays;

class Main{
    public static int waterCalc(int[] arr)
    {
        int amount_water = 0;
        int n = arr.length;

        // iterar o array, excluindo o primeiro e ultimo termo
        for (int i = 1; i < n - 1 ; i++)
        {
            int left = arr[i];
            // percorro o array a partir da esquerda e armazeno o maior valor
            for (int j = 0; j < i; j++)
            {
                left = Math.max(left,arr[j]);
            }

            // percorro o array a partir de i até a direita para achar o maior valor.

            int right = arr[i];
            for (int j = i; j < n; j++)
            {
                right = Math.max(right,arr[j]);
            }

            amount_water += Math.min(left,right) - arr[i];
        }

        return amount_water;

    }

    public static void main(String[] args)
    {
        int[] array = { 0, 1, 0, 2, 1, 0,
                1, 3, 2, 1, 2, 1 };
        System.out.print(waterCalc(array));


    }

}
