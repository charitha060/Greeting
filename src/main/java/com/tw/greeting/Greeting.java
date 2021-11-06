package com.tw.greeting;

import java.util.Locale;

public class Greeting {

    public String greet(String name) {
        String greetMessage = "Hello,";

        if (name.equals(""))
            return greetMessage + "my friend";
        else if (isUpperCase(name))
            return greetMessage.toUpperCase() + name + "!";
        return greetMessage + name;
    }

    public static boolean isUpperCase(String name) {
        for (int index = 0; index < name.length(); index++) {
            if (!Character.isUpperCase(name.charAt(index))) {
                return false;
            }
        }
        return true;
    }
}
