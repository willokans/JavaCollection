import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by willokans on 06/05/2017.
 */
public class SortedMapClass {

    public static void main(String[] args) {


        //HashMap does keep your value in a sorted sequence
        Map<Integer, String> hashMap = new HashMap<Integer, String>();

        //To keep you value together, we use a LinkedHashMap
        Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();

        Map<Integer, String> treeMap = new TreeMap<Integer, String>();

        System.out.println("<<for hashMap>>");
        testMap(hashMap);

        System.out.println("<< for LinkedHashMap >>");
        testMap(linkedHashMap);

        System.out.println("<< for treeMap >>");
        testMap(treeMap);
        //Tree Maps will always sort out the key




    }

    public static void testMap(Map<Integer, String> map) {

        //input data into Map
        map.put(9, "Goat");
        map.put(4, "Cow");
        map.put(5, "Ram");
        map.put(7, "Cat");
        map.put(1, "Dog");
        map.put(2, "Horse");
        map.put(3, "goat");
        map.put(6, "Bee");
        map.put(8, "Fly");

        //Iterate through Map
        for (Integer key : map.keySet()) {
            //map.key-set return a collect of a set
            String value = map.get(key);

            System.out.println(key + " :" + value);
        }



    }

}
