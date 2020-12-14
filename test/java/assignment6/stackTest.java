/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment6;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 *
 * @author ninte
 */
public class stackTest {

    @AfterAll
    public static void tearDownClass() {

    }

    @BeforeEach
    public void setUp() {}

    /**
     * Test of pop method, of class stack.
     */
    @Test
    public void testPopEmpty() {
        System.out.println("pop empty");
        PrintStream previousConsole = System.out;

        ByteArrayOutputStream newConsole0 = new ByteArrayOutputStream();
        System.setOut(new PrintStream(newConsole0));

        stack instance = new stack();

        ByteArrayOutputStream newConsole1 = new ByteArrayOutputStream();
        System.setOut(new PrintStream(newConsole1));

        int result = instance.pop();

        String pushOutput = newConsole1.toString();
        String expectedOutput = "Stack is Empty";

        System.setOut(previousConsole);

        assertEquals(pushOutput, expectedOutput);
    }

    @Test
    public void testPopNonEmpty() {
        System.out.println("pop nonempty");
        PrintStream previousConsole = System.out;

        ByteArrayOutputStream newConsole0 = new ByteArrayOutputStream();
        System.setOut(new PrintStream(newConsole0));

        stack instance = new stack();
        instance.push(123);

        ByteArrayOutputStream newConsole1 = new ByteArrayOutputStream();
        System.setOut(new PrintStream(newConsole1));

        int result = instance.pop();

        String pushOutput = newConsole1.toString();
        String expectedOutput = "123";

        System.setOut(previousConsole);

        assertEquals(pushOutput, expectedOutput);
    }

    /**
     * Test of push method, of class stack.
     */
    @Test
    public void testPushWithoutCapacity() {
        System.out.println("push without capacity");
        PrintStream previousConsole = System.out;

        ByteArrayOutputStream newConsole0 = new ByteArrayOutputStream();
        System.setOut(new PrintStream(newConsole0));

        stack instance = new stack(3);
        instance.push(1);
        instance.push(2);
        instance.push(3);

        ByteArrayOutputStream newConsole1 = new ByteArrayOutputStream();
        System.setOut(new PrintStream(newConsole1));

        instance.push(0);

        String pushOutput = newConsole1.toString();
        String expectedOutput = "Stack is Full";

        System.setOut(previousConsole);

        assertEquals(pushOutput, expectedOutput);
    }

    @Test
    public void testPushWithCapacity() {
        System.out.println("push with capacity");
        PrintStream previousConsole = System.out;

        ByteArrayOutputStream newConsole0 = new ByteArrayOutputStream();
        System.setOut(new PrintStream(newConsole0));

        stack instance = new stack();

        ByteArrayOutputStream newConsole1 = new ByteArrayOutputStream();
        System.setOut(new PrintStream(newConsole1));

        instance.push(0);

        String pushOutput = newConsole1.toString();
        String expectedOutput = "[0]";

        System.setOut(previousConsole);

        assertEquals(pushOutput, expectedOutput);
    }

    /**
     * Test of peek method, of class stack.
     */
    @Test
    public void testPeekEmpty() {
        System.out.println("peek empty");
        PrintStream previousConsole = System.out;

        ByteArrayOutputStream newConsole0 = new ByteArrayOutputStream();
        System.setOut(new PrintStream(newConsole0));

        stack instance = new stack();

        ByteArrayOutputStream newConsole1 = new ByteArrayOutputStream();
        System.setOut(new PrintStream(newConsole1));

        int result = instance.peek();

        String peekOutput = newConsole1.toString();
        String expectedOutput = "Stack is Empty";

        System.setOut(previousConsole);

        assertEquals(expectedOutput, peekOutput);
    }

    @Test
    public void testPeekNotEmpty() {
        System.out.println("peek not empty");
        PrintStream previousConsole = System.out;

        ByteArrayOutputStream newConsole0 = new ByteArrayOutputStream();
        System.setOut(new PrintStream(newConsole0));

        stack instance = new stack();
        instance.push(123);

        ByteArrayOutputStream newConsole1 = new ByteArrayOutputStream();
        System.setOut(new PrintStream(newConsole1));

        int result = instance.peek();

        String peekOutput = newConsole1.toString();
        String expectedOutput = "123";

        System.setOut(previousConsole);

        assertEquals(peekOutput, expectedOutput);
    }

}