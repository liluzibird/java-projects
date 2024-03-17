package net.datastructures;

import java.util.Scanner;

public class SearchStack {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // make stack and queue
        Stack<Integer> S = new LinkedStack<>();
        Queue<Integer> Q = new LinkedQueue<>();

        // ask user for number of elements
        System.out.println("Enter the number of elements in the stack:");
        int n = scanner.nextInt();
        
        // ask user to enter element values
        
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the value for element " + (i + 1) + " : ");
            S.push(scanner.nextInt());
        }

        // ask user for element to search
        System.out.println("Enter the element to search for:");
        int z = scanner.nextInt();

        // execute search
        boolean found = findElement(S, Q, z);

        // output search result
        System.out.println("Element " + z + " found: " + found);

        // return to original stack order
        while (!Q.isEmpty()) {
            S.push(Q.dequeue());
        }

        // output stack in its original order
        System.out.println("Stack in original order: " + S.toString());

        // Close scanner
        scanner.close();
    }

    public static boolean findElement(Stack<Integer> S, Queue<Integer> Q, int z) {
        boolean found = false;

        // search stack for element z
        while (!S.isEmpty()) {
            int element = S.pop();
            if (element == z) {
                found = true;
            }
            Q.enqueue(element);
        }

        // return elements back to the stack S
        while (!Q.isEmpty()) {
            S.push(Q.dequeue());
        }

        return found;
    }
}
