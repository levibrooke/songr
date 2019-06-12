package com.lab11.songr;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Capitalize {
    @GetMapping("capitalize/{phrase}")
    public String getCapitalized(@PathVariable String phrase) {
        return phrase.toUpperCase();
    }
}
