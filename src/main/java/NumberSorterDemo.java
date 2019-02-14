import java.util.ArrayList;
import java.util.Collections;

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

    public void returnAverageOfArrayListCollection(){

    }




}
