package week6;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
// not ready! under construction!
class HashSet2 {
    public static void main(String[] args){
        Map<String, String> map = new HashMap<>();
        map.put("Johan", "johan@n0mail.com");
        map.put("Niklas", "niklas@n0mail.com");
        map.put("John", "john@n0mail.com");

        System.out.println(map);
    }

    private HashMap<Object, Object> map;
    Set<Object> keys = map.keySet();
    Collection<Object> values = map.values();
    Set<Map.Entry<Object, Object>> entry = map.entrySet();


}