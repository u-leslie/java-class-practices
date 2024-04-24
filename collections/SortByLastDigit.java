package collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortByLastDigit {
    public static void main(String[] args) {
   
        List<Integer> numberList = new ArrayList<>();
        numberList.add(95);
        numberList.add(50);
        numberList.add(14);
        numberList.add(22);
        numberList.add(35);

        System.out.println("Initial List: " + numberList);

        Collections.sort(numberList, new LastDigitComparator());

      
        System.out.println("Sorted List (based on last digit): " + numberList);
    }

    static class LastDigitComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer num1, Integer num2) {
            int lastDigitNum1 = num1 % 10;
            int lastDigitNum2 = num2 % 10;

            return Integer.compare(lastDigitNum1, lastDigitNum2);
        }
    }
}
