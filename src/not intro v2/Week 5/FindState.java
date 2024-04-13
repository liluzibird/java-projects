import java.util.Scanner;
import java.util.ArrayList;

public class FindState {
    public static void findData(ArrayList<String> allStates, int minIndex, int maxIndex) {
        int rangeSize;
        int middleIndex;
        /* Your code goes here */
        rangeSize = (maxIndex - minIndex) + 1; // +1 because the range is inclusive
        middleIndex = (minIndex + maxIndex) / 2;

        System.out.println("Number of elements in the range: " + rangeSize);
        System.out.println("Middle index: " + middleIndex);
        System.out.println("Element at middle index: " + allStates.get(middleIndex));
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        ArrayList<String> dataList = new ArrayList<String>();
        int numData;
        int i;
        numData = scnr.nextInt();
        for (i = 0; i < numData; ++i) {
            dataList.add(scnr.next());
        }
        findData(dataList, 0, dataList.size() - 1);
    }
}
