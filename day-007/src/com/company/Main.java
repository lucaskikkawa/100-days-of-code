package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
	    initFunction();
    }

    public static void initFunction(){
        Scanner sc = new Scanner(System.in);
        int m,n;
        //System.out.println("Please type m:");
        m = sc.nextInt();
        //System.out.println("Please type n:");
        n = sc.nextInt();
        int[] nums1 = new int[m+n];
        int[] nums2 = new int[n];
        int[] mergeArray;

        // fill nums1 array

        for (int i = 0; i < m ; i++)
        {
                //System.out.println(String.format("Please type array1[%d] value",i));
                nums1[i] = sc.nextInt();
        }
        for (int i = m; i < m+n; i++)
        {
            nums1[i] = 0;
        }

        // fill nums2 array

        for (int i = 0; i < n ; i++)
        {
            //System.out.println(String.format("Please type array2[%d] value",i));
            nums2[i] = sc.nextInt();
        }

        mergeArray = merge(nums1,nums2,m,n);
        BubbleSort(mergeArray);
        System.out.print(Arrays.toString(mergeArray));



    }

    public static int[] merge ( int[] array_m, int[] array_n, int m, int n ){
        int[] mergeArray = new int[array_m.length];

        // fill merge with array1
        for (int i = 0; i < array_m.length - 1; i++)
        {
            mergeArray[i] = array_m[i];
        }
        // fill merge with array2
        int j = 0; // iterator array_n
        for (int i = m ; i < m + n; i++)
        {
            mergeArray[i] = array_n[j];
            j++;
        }



        return mergeArray;
    }

    public static void BubbleSort(int[] array){
        for (int i = 0; i < array.length-1; i++)
        {
            for (int j = 0; j < array.length - 1; j++)
            {
                if (array[j] > array[j+1])
                {
                    int aux = array[j];
                    array[j] = array[j+1];
                    array[j+1] = aux;

                }
            }
        }
    }



}
