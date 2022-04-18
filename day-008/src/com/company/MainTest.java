package com.company;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)

public class MainTest
{
    private Main test_obj;
    private String digits;
    private List answer;

    public MainTest(String digits, List answer)
    {
        this.digits = digits;
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
                "23", Arrays.asList("ad","ae","af","bd","be","bf","cd","ce","cf")
            },
            {
                "", Collections.emptyList()
            },
            {
                "2",Arrays.asList("a","b","c")
            }
        });
    }

    @Test
    public void test_()
    {
        assertEquals(answer,test_obj.phoneNumber(digits));
    }
}