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

    public void returnLargestNumberInArray(){
        Collections.max(sortingArray);
    }

    public void returnSmallestNumberInArray(){
        Collections.min(sortingArray);
    }

    public void sortFromSmallestToLargest(){
        Collections.sort(sortingArray);
    }

    public void sortFromLargestToSmallest(){
        Collections.reverse(sortingArray);
    }

    public double returnAverageOfArrayListCollection(){
        double sum = 0;
        for (Integer sortLoop: sortingArray) {
            sum += sortLoop; }
        return sum;
    }


}
