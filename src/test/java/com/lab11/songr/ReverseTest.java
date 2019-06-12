package com.lab11.songr;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ReverseTest {

    @Test
    public void getReversed() {
        Reverse classUnderTest = new Reverse();
        String result = classUnderTest.getReversed("here a test");

        assertEquals("test a here",
                result);
    }
}