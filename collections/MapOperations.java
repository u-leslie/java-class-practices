package collections;

import java.util.HashMap;
import java.util.Map;

public class MapOperations {
    public static void main(String[] args) {
       
        Map<String, Integer> ageMap = new HashMap<>();
        ageMap.put("jean", 21);
        ageMap.put("clementine", 19);
        ageMap.put("alex", 21);
        ageMap.put("patrick", 22);
        ageMap.put("jean", 20); 

        
        System.out.println("Initial Map: " + ageMap);

        ageMap.put("alex", 25);

      
        System.out.println("Map after updating age of 'alex': " + ageMap);

        
        boolean containsAge50 = ageMap.containsValue(50);
        
        System.out.println("Is there age 50 in the map? " + containsAge50);
    }
}
