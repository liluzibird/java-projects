/*
 * Project Name: Java Project 1: StackElementFinder
 * Name: Albert Huynh
 * Email: alberth03@protonmail.com
 */

package net.datastructures;

public class ConcatenateTest {
    public static void main(String[] args) {
//------------------------------------------------------------
        //Initialize Q1 and Q2
        LinkedQueue<Integer> Q1 = new LinkedQueue<>();
        LinkedQueue<Integer> Q2 = new LinkedQueue<>();

        //--------------------------------------------------------
        // Add elements to Q1 and Q2 for testing
        Q1.enqueue(1);
        Q1.enqueue(2);
        Q1.enqueue(3);
        Q1.enqueue(4);
        Q1.enqueue(5);
        
        Q2.enqueue(6);
        Q2.enqueue(7);
        Q2.enqueue(8);
        Q2.enqueue(9);
        Q2.enqueue(10);

        // Now concatenate Q2 to Q1
        Q1.concatenate(Q2);

        //---------------------------------------------------------------------
        //Q1 should have all elements 1-10
        //Q2 should be empty
        System.out.println("Q1 concatenated: " + Q1); //has elements
        System.out.println("Q2 concatenated: " + Q2); //Emptied
    }
}
