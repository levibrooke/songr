package com.lab11.songr;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CapitalizeTest {

    @Test
    public void getCapitalized() {
        Capitalize classUnderTest = new Capitalize();
        String result = classUnderTest.getCapitalized("test");

        assertEquals("TEST",
                result);
    }
}