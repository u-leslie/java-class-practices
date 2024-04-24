package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListOperations {
    public static void main(String[] args) {
        
        List<String> firstList = new ArrayList<>();
        firstList.add("lidvine");
        firstList.add("regis");
        firstList.add("ritha");
        firstList.add("exauce");
        firstList.add("linda");


        List<String> secondList = new ArrayList<>();
        secondList.add("mustapha");
        secondList.add("faith");
        secondList.add("divine");

       
        int indexOfExauce = firstList.indexOf("exauce");
        firstList.add(indexOfExauce, "gisele");

        
        int indexOfFaith = secondList.indexOf("faith");
        if (indexOfFaith != -1) {
            secondList.set(indexOfFaith, "imbabazi faith");
        }

        
        secondList.remove("mustapha");

       
        boolean containsAlice = firstList.contains("alice");
        System.out.println("Is 'alice' in the first list? " + containsAlice);

        
        firstList.addAll(secondList);


        // 6. Sort the concatenated array
        Collections.sort(firstList);
        
        System.out.println("Modified First List: " + firstList);
    }
}
