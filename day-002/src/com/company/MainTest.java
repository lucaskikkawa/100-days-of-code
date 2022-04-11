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
    private String phrase;
    private String answer;

    public MainTest(String phrase, String answer)
    {
        this.phrase = phrase;
        this.answer = answer;
    }

    @Before
    public void setup(){
        test_obj = new Main();
    }

    @Parameterized.Parameters
    public static Collection<Object> testValues(){
        return Arrays.asList(new Object[][]{
            {
                "I am finding Nemo !","I found Nemo at 4!"
            },
            {
                "Nemo is me","I found Nemo at 1!"
            },
            {
                "I Nemo am","I found Nemo at 2!"
            },
            {
                "I am nemo","I can't find Nemo :("
            }
        });

    }

    @Test
    public void test_findNemo()
    {
        assertEquals(answer,test_obj.findNemo(phrase));
    }
}