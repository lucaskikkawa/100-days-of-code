package com.company;

public class NextPrime
{
    public static void main(String[] args)
    {
        System.out.println(calc(24));
    }
    public static int calc (int n)
        {
            boolean n_isPrime = true;

            // check if n is prime
            if (n == 1)
            {
                return n;
            } else
            {
                for (int i = 2; i < n / 2; i++)
                {
                    if (n % i == 0)
                    {
                        n_isPrime = false;
                    }
                }
            }

            if (n_isPrime)
            {
                return n;
            } else
            {
                // finds next prime
                boolean found_prime = false;
                boolean num_isPrime = true;
                int num = n;
                while (!found_prime)
                {
                    num++;
                    for (int i = 2; i < num / 2; i++)
                    {
                        if (num % i == 0)
                        {
                            num_isPrime = false;
                        }
                    }
                    if (num_isPrime)
                    {
                        found_prime = true;
                    } else
                    {
                        num_isPrime = true; // resets
                    }
                }
                return num;
            }
        }
}
