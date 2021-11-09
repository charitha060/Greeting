package com.tw.greeting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GreetingTest {

    private Greeting greeting;

    @BeforeEach
    void beforeEach() {
        greeting = new Greeting();
    }

    @Test
    void should_greet_with_name() {
        assertEquals("Hello,Bob", greeting.greet(new String[]{"Bob"}));
    }

    @Test
    void should_return_simple_greet_message_when_name_is_not_entered() {
        assertEquals("Hello,my friend", greeting.greet(new String[]{""}));
    }

    @Test
    void should_handle_shouting() {
        assertEquals("HELLO,JERRY!", greeting.greet(new String[]{"JERRY"}));
    }

    @Test
    void should_handle_two_names_of_input() {
        assertEquals("Hello,Jill and Jane", greeting.greet(new String[]{"Jill", "Jane"}));
    }
}