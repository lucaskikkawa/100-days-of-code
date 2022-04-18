package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class MainTest
{

    @Test
    public void initFunctiontest()
    {

        String input = "3\n3\n1\n2\n3\n2\n5\n6";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        //String[] args = {};
        //Main.main(args);
        Main.initFunction();


        String consoleOutput = "[1, 2, 2, 3, 5, 6]";


        assertEquals(consoleOutput,out.toString());
    }
}