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
    private int[] heights;
    private int result;


    public MainTest(int[] heights, int result)
    {
        this.heights = heights;
        this.result = result;
    }



    @Before
    public void setup(){
        test_obj = new Main();
    }

    @Parameterized.Parameters
    public static Collection<Object> testValues(){
        return Arrays.asList(new Object[][]{
            {
                    new int[]{ 0, 1, 0, 2, 1, 0,
                            1, 3, 2, 1, 2, 1 },
                    6
            },
            {
                new int[]{4,2,0,3,2,5},
                    9
            },
            {
                new int[]{ 7, 0, 4, 2, 5, 0, 6, 4, 0, 5},
                    25
            }
        });
    }

    @Test
    public void test_()
    {
        assertEquals(result,test_obj.waterCalc(heights));
    }
}