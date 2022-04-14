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
    private int[] saturdays;
    private int result;

    public MainTest(int[] saturdays, int result)
    {
        this.saturdays = saturdays;
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
                new int[]{
                    3,4,1,2
                },
                    2
            },
            {
                new int[]{
                        10,11,12,9,10
                },
                    3
            },
            {
                new int[]{
                        6,5,4,3,2,9
                },
                    1
            },
                {
                    new int[]{
                            9,9
                    },
                        0
                }
        });
    }

    @Test
    public void test_progressDays()
    {
        assertEquals(result,test_obj.progressDays(saturdays));
    }
}