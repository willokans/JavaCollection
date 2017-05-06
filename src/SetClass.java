import java.util.Set;
import java.util.TreeSet;

/**
 * Created by willokans on 06/05/2017.
 */
public class SetClass {

    //A set is a kind of collection that stores only unique elements

    public static void main(String[] args) {


        //HashSet does not retain order and it can and will rearrange themself
        //Set<String> set1 = new HashSet<String>();

        //to order your item used linkedHashSet
        //Set<String> set1 = new LinkedHashSet<String>();

        //It you want it in natural order e.g A, B C ... or 1, 2,3... is TreeSet
        Set<String> set1 = new TreeSet<>();


        //add element to my set
        set1.add("Dog");
        set1.add("Cat");
        set1.add("Snake");
        set1.add("Bear");

        //Add duplicate items does nothing
        set1.add("Snake");

        //Set is good when sorting out duplicate from a list of set

        //print out the set
        System.out.println(set1);

        //iterate through a set
        for (String elment : set1) {
            System.out.println(elment);
        }

        //Does set contain a given item
        if (set1.contains("Hack")) {
            System.out.println("Contains Hack");
        } else {
            set1.add("Hack");
            for (String element : set1) {
                System.out.println(element);
            }
        }

    }
}
