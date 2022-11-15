package week6;
import java.util.*;

public class v6Exer8 {

    public String[] mapValuesToArray(Map < Integer, String > sourceMap) {
        Collection < String > values = sourceMap.values();
        return values.toArray(new String[0]);
    }

    public static void main(String[] args) {

        Set<String> sourceMap = new HashSet<>();

        // Add elements using add method
        sourceMap.add("asdf");
        sourceMap.add("trewq");
        sourceMap.add("kjhyt");
        sourceMap.add("oinjuy");
        sourceMap.add("juhyt");
        sourceMap.add("cggfr");
        sourceMap.add("zcvgt");

        System.out.println(sourceMap);



        v6Exer7 mapToArrayExample = new v6Exer7();
        Map < Integer, String > newsourceMap = new HashMap < > ();
        newsourceMap.put(1,"asdf");
        newsourceMap.put(6,"frewq");
        newsourceMap.put(4,"djhyt");
        newsourceMap.put(5,"einjuy");
        newsourceMap.put(3,"cuhyt");
        newsourceMap.put(2,"bggfr");
        newsourceMap.put(7,"gcvgt");
        String[] targetArray = mapToArrayExample.mapValuesToArray(newsourceMap);
        System.out.println(Arrays.toString(targetArray));
    }
}