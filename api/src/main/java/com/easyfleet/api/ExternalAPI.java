package com.easyfleet.api;

import org.springframework.stereotype.Service;

@Service
public class ExternalAPI {
 
    public String isEvenOrOdd(Integer number) {
        return number % 2 == 0 ? "Even" : "Odd";
    }
}