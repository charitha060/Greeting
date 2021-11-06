package com.tw.greeting;

public class Greeting {
    private String greet = "Hello,";

    public String greet(String name) {
        if (name == "")
            return greet + "my friend";
        return greet + name;
    }
}
