/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment6;

import java.util.Stack;

/**
 *
 * @author ninte
 */

public class stack {
    private Stack < Integer > myStack;
    private int myCapacity;
    private int myNextElement;

    stack() {
        myStack = new Stack < > ();
        myCapacity = 20;
        myNextElement = 0;
        System.out.println(myStack + " " + myCapacity);
    }

    stack(int capacity) {
        myStack = new Stack < > ();
        myCapacity = capacity;
        myNextElement = 0;
        System.out.println(myStack + " " + myCapacity);
    }

    public int pop() {
        if (!myStack.isEmpty()) {
            int topItem = myStack.pop();
            myNextElement--;
            System.out.print(topItem);
            return topItem;
        } else {
            System.out.print("Stack is Empty");
        }

        return -1;
    }

    public void push(int item) {
        if (myNextElement != myCapacity) {
            myStack.add(item);
            myNextElement++;
            System.out.print(myStack);
        } else {
            System.out.print("Stack is Full");
        }

    }

    public int peek() {
        if (!myStack.isEmpty()) {
            int topItem = myStack.peek();
            System.out.print(topItem);
            return topItem;
        } else {
            System.out.print("Stack is Empty");
        }

        return -1;
    }

    public boolean empty() {
        boolean isEmpty = myStack.isEmpty();
        return isEmpty;
    }

    public static void main(String[] args) {
        //System.out.println("xxxxxxx");
        //stack xyz = new stack();
        //stack xyz = new stack(3);
        //xyz.peek();
        //xyz.pop();
        //xyz.push(1);
        //xyz.pop();
        //xyz.pop();
        //xyz.push(2);
        //xyz.push(3);
        //xyz.push(4);
        //xyz.push(5);
        //xyz.pop();
        //xyz.pop();
        //xyz.pop();
        //xyz.push(6);
        //xyz.push(7);
        //xyz.push(8);
        //xyz.push(9);
        //xyz.push(10);
        //xyz.push(11);
        //xyz.push(12);
        //xyz.push(13);
        //xyz.push(14);
        //xyz.push(15);
        //xyz.push(16);
        //xyz.push(17);
        //xyz.push(18);
        //xyz.push(19);
        //xyz.push(20);
        //xyz.push(21);
        //xyz.push(22);
    }

}