import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

public class NumberSorterTest {

    private NumberSorterDemo newDemo;
//    private ArrayList<Integer> numbersSmallestToLargest;
    private ArrayList<Integer> numbersLargestToSmallest;

    @Before
    public void create(){
        newDemo = new NumberSorterDemo();
        newDemo.addItemsToArray(10, 50, 100);

    }

    @Test
    public void shouldReturnLargestNumberInArray(){
        int result = newDemo.returnLargestNumberInArray();

        assertThat(result, equalTo(100));
    }

    @Test
    public void shouldReturnSmallestNumberInArray(){
        int result = newDemo.returnSmallestNumberInArray();

        assertThat(result, equalTo(10));
    }

    @Test
    public void shouldSortFromSmallestToLargest(){
        ArrayList<Integer> result = newDemo.sortFromSmallestToLargest();
//        numbersSmallestToLargest = new ArrayList<>(Arrays.asList(10, 50, 100));

        assertThat(result.get(0), equalTo(10));
        assertThat(result.get(1), equalTo(50));
        assertThat(result.get(2), equalTo(100));
    }

    @Test
    public void shouldSortFromLargestToSmallest(){
        ArrayList<Integer> result = newDemo.sortFromLargestToSmallest();
        numbersLargestToSmallest = new ArrayList<>(Arrays.asList(100, 50, 10));

        assertThat(result, equalTo(numbersLargestToSmallest));
    }

    @Test
    public void shouldReturnAverageOfArrayListCollection(){
        double result = newDemo.returnAverageOfArrayListCollection();

        assertThat(result, equalTo(53.333333333333336));
    }


}
