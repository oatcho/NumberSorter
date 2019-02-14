import java.util.ArrayList;
import java.util.Collections;

import static com.sun.tools.doclint.Entity.sum;

public class NumberSorterDemo {

    private int firstNumber;
    private int secondNumber;
    private int thirdNumber;
    ArrayList<Integer> sortingArray = new ArrayList<Integer>();


    public void addItemsToArray(int firstNumber, int secondNumber, int thirdNumber){
        sortingArray.add(firstNumber);
        sortingArray.add(secondNumber);
        sortingArray.add(thirdNumber);
        }

    public Integer returnLargestNumberInArray(){
        return Collections.max(sortingArray);
    }

    public Integer returnSmallestNumberInArray(){
        return Collections.min(sortingArray);
    }

    public ArrayList<Integer> sortFromSmallestToLargest(){
        Collections.sort(sortingArray);
        return sortingArray;
    }

    public ArrayList<Integer> sortFromLargestToSmallest(){
        Collections.reverse(sortingArray);
        return sortingArray;
    }

    public double returnAverageOfArrayListCollection(){
        double sum = 0;
        for (double averagingArrayLoop: sortingArray) {
            sum += averagingArrayLoop; }
        return sum/sortingArray.size();
    }

}
