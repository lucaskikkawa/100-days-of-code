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
    private String socks;
    private int num_pairs;

    public MainTest(String socks, int num_pairs)
    {
        this.socks = socks;
        this.num_pairs = num_pairs;
    }

    @Before
    public void setup(){
        test_obj = new Main();
    }

    @Parameterized.Parameters
    public static Collection<Object> testValues(){
        return Arrays.asList(new Object[][]{
            {
                "AA",1
            },
            {
                "ABABC",2
            },
            {
                "CABBACCC",4
            }
        });
    }

    @Test
    public void test_SockPairs()
    {
        assertEquals(num_pairs,test_obj.SockPairs(socks));
    }
}