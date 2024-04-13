import java.util.Scanner;

public class printLinkedList {
    public static void printLinkedList(IntNode headNode) {
    if (headNode == null) {
        return;
    }
    headNode.printData(); // Use printData() method of IntNode class
    if (headNode.getNext() != null) {
        printLinkedList(headNode.getNext());
    }
}


    public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    int size;
    int value;
    size = scnr.nextInt();
    value = scnr.nextInt();
    IntNode headNode = new IntNode(value); // Make head node as the first node
    IntNode lastNode = headNode;           // Node to add after
    IntNode newNode;                       // Node to create
    // Insert the second and the rest of the nodes
    for (int n = 0; n < size - 1; ++n) {
        value = scnr.nextInt();
        newNode = new IntNode(value);
        lastNode.insertAfter(newNode);
        lastNode = newNode;
    }
    // Call printLinkedList() with the head node
    printLinkedList(headNode);
}

}
