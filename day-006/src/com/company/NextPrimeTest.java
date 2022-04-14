package com.company;

import com.sun.tools.javac.Main;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)

public class NextPrimeTest
{
    private NextPrime test_obj;
    private int num;
    private int nextprime;

    public NextPrimeTest(int num, int nextprime)
    {
        this.num = num;
        this.nextprime = nextprime;
    }

    @Before
    public void setup(){
        test_obj = new NextPrime();
    }

    @Parameterized.Parameters
    public static Collection<Object> testValues(){
        return Arrays.asList(new Object[][]{
            {
                12,13
            },
            {
                24,29
            },
            {
                11,11
            }
        });
    }

    @Test
    public void test_()
    {
        assertEquals(nextprime,test_obj.calc(num));
    }
}