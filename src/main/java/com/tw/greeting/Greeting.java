package com.tw.greeting;

import java.util.Arrays;

public class Greeting {

    String greetMessage = "Hello,";

    public String greet(String[] names) {

        for (String name : names) {
            if (name.equals(""))
                return greetMessage + "my friend";
            else if (name.equals(name.toUpperCase()))
                return greetMessage.toUpperCase() + name + "!";
        }
        return greetMessage + Arrays.toString(Arrays.stream(names).toArray()).replace(",", " and ").replace('[', ' ').replace(']', ' ').trim();
    }
}
