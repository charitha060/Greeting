package com.tw.greeting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GreetingTest {

    @Test
    void should_greet_user_with_name() {
        Greeting greeting = new Greeting();

        String expected = "Hello,Bob";
        String actual = greeting.greet("Bob");

        assertEquals(expected, actual);

    }
}