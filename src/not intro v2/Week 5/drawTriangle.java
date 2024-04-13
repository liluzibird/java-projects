import java.util.Scanner;
public class drawTriangle {
    public static void drawTriangle(int baseLength) {
        drawTriangleHelper(baseLength, 1, 9);
    }
    
    public static void drawTriangleHelper(int baseLength, int currentLength, int spaces) {
        if (currentLength > baseLength) {
            return;
        }
        for (int i = 0; i < spaces; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < currentLength; i++) {
            System.out.print("*");
        }
        System.out.println();
        drawTriangleHelper(baseLength, currentLength + 2, spaces - 1);
    }
    
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int baseLength;
        baseLength = scnr.nextInt();
        drawTriangle(baseLength);
    }
}
