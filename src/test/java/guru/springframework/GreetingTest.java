package guru.springframework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreetingTest {

    @Test
    void helloWorld() {
        Greeting greeting = new Greeting();
        String result = greeting.helloWorld();
        System.out.println(result);
        assertEquals("Hello World", result);
    }

    @Test
    void testHelloWorld() {
        String myName = "Paul";
        Greeting greeting = new Greeting();
        String result = greeting.helloWorld(myName);
        System.out.println(result);
        assertEquals("Hello Paul", result);
    }
}