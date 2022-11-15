package week6;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
public class v6Exer10 {

    public String[] mapValuesToArray(Map < Integer, String > sourceMap) {
        Collection < String > values = sourceMap.values();
        return values.toArray(new String[0]);
    }
    public static void main(String[] args) {
        v6Exer10 mapToArrayCars = new v6Exer10();
        Map < Integer, String > sourceMap = new HashMap < > ();
        sourceMap.put(1, "Volvo");
        sourceMap.put(2, "Mercedes");
        sourceMap.put(3, "GM");
        String[] targetArray = mapToArrayCars.mapValuesToArray(sourceMap);
        System.out.println(Arrays.toString(targetArray));
    }
}
