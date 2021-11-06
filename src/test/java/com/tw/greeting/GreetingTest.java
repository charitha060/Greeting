package com.tw.greeting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GreetingTest {

    private Greeting greeting;

    @BeforeEach
    void beforeEach(){
        greeting = new Greeting();
    }

    @Test
    void should_greet_user_with_name() {
        assertEquals("Hello,Bob", greeting.greet("Bob"));
    }
}