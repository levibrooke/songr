package com.lab11.songr;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.Arrays;

@RestController
public class Reverse {
    @GetMapping("/reverse")
    public String getReversed(@RequestParam String phrase) {
        String[] arraySplit = phrase.split(" ");
//        System.out.println(Arrays.toString(arraySplit));
        StringBuilder reversed = new StringBuilder();

        for (int i = arraySplit.length; i > 0; i--) {

            reversed.append(arraySplit[i - 1]);

            if (i - 1 != 0) {
                reversed.append(" ");
            }
        }
        return reversed.toString();
    }
}
