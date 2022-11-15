package week6;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
public class v6Exer9 {
        public String[] mapValuesToArray(Map < Integer, String > sourceMap) {
            Collection < String > values = sourceMap.values();
            return values.toArray(new String[0]);
        }
        public static void main(String[] args) {
            v6Exer9 mapToArrayExample = new v6Exer9();
            Map < Integer, String > cars = new HashMap < > ();
            cars.put(1, "Volvo");
            cars.put(2, "Mercedes");
            cars.put(3, "GM");
            String[] targetArray = mapToArrayExample.mapValuesToArray(cars);
            System.out.println(Arrays.toString(targetArray));
        }
    }
