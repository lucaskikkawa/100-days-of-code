package com.company;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)

public class MainTest
{
    private Main test_obj;
    private int input;
    private int expected;

    public MainTest(int input, int expected)
    {
        this.input = input;
        this.expected = expected;
    }

    @Before
    public void setup(){
        test_obj = new Main();
    }

    @Parameterized.Parameters
    public static Collection<Object> testValues(){
        return Arrays.asList(new Object[][] {
                {
                    65, 23725
                },
                {
                    0, 0
                },
                {
                    20, 7300
                }
        });
    }

    @Test
    public void test_calcAges()
    {
        assertEquals(expected,test_obj.calcAge(input));
    }
}