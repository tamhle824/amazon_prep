package samplePrograms;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap<>();

        map.put("a",10);
        map.put("b", 20);
        map.put("c",30);

        System.out.println("Size of map is " + map.size());
    }
    
}
