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
    private String[] skewers;
    private String result;

    public MainTest(String[] skewers, String result)
    {
        this.skewers = skewers;
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
                new String[] {
                        "--oooo-ooo--",
                        "--xx--x--xx--",
                        "--o---o--oo--",
                        "--xx--x--ox--",
                        "--xx--x--ox--"
            },"[2, 3]"
            },
            {
                new String[]{
                        "--oooo-ooo--",
                        "--xxxxxxxx--",
                        "--o---",
                        "-o-----o---x--",
                        "--o---o-----"
                },
                    "[3, 2]"
            }
        });
    }

    @Test
    public void test_()
    {
        assertEquals(result,test_obj.checkBBQ(skewers));
    }
}