package week6;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
// Create a new hashSet and then convert the hashSet to an arrayList
public class v6Exer6 {
    public String[] mapValuesToArray(Map < Integer, String > sourceMap) {
        Collection < String > values = sourceMap.values();
        return values.toArray(new String[0]);
    }
    public static void main(String[] args) {
        v6Exer6 mapToArrayExample = new v6Exer6();
        Map < Integer, String > sourceMap = new HashMap < > ();
        sourceMap.put(1,"Monday");
        sourceMap.put(2,"Tuesday");
        sourceMap.put(3,"Wednesday");
        sourceMap.put(4,"Thursday");
        sourceMap.put(5,"Friday");
        sourceMap.put(6,"Saturday");
        sourceMap.put(7,"Sunday");
        String[] targetArray = mapToArrayExample.mapValuesToArray(sourceMap);
        System.out.println(Arrays.toString(targetArray));
    }
}

