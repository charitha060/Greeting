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
    void should_greet_with_name() {
        assertEquals("Hello,Bob", greeting.greet("Bob"));
    }

    @Test
    void should_return_simple_greet_message_when_name_is_not_entered() {
        assertEquals("Hello,my friend",greeting.greet(""));
    }
}