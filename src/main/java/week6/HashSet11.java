package week6;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
class HashSet11 {
    public static void main(String[] args) {
        //Creating HashSet and adding elements
        Map<String, Integer> carMapping = new HashMap<>();
        carMapping.put("Volvo", 1);
        carMapping.put("Mercedes", 2);
        carMapping.put("GM", 3);

        System.out.println(carMapping);

        Set<String> keys = carMapping.keySet();
        Collection<Integer> values = carMapping.values();
        Set<Map.Entry<String, Integer>> entries = carMapping.entrySet();

        for (Map.Entry<String, Integer> pair : entries) {
//           System.out.println(pair.getKey());
            System.out.println(pair.getValue());
        }

        // iterating map using forEach
        carMapping.forEach(HashSet11::accept);
        System.out.println("Iterating map using forEach method: " +"\n keys: " + keys +"\n and values: " + values);
    }
    private static void accept(String keys, Integer values) {

    }
}
