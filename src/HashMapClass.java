import java.util.List;

/**
 * Created by willokans on 06/05/2017.
 */
public class HashMapClass {

    /**
     * ArrayList Manage arrays internally e.g [0][1][3][4][5]....
     *
     * LinkList consist of element where each element has a reference to the
     * previous and next e.g [0]->[1]->[2]->....
     *
     */

    public static void main(String[] args) {


        /**
         * If you want to add or remove item at the end of your list,
         * use and ArrayList
         * It is faster to add item to the end of an ArrayList when compare to a LinkList
         * It's slower to add item to anywhere else in the list with compare to a linkedlist
         */
        java.util.ArrayList<Integer> arrayList = new java.util.ArrayList<Integer>();


        /**
         * if you want to add or remove item from anywhere else on the list
         * use a linked list
         */
        java.util.LinkedList<Integer> linkedList = new java.util.LinkedList<Integer>();

        doTimings("ArrayList", arrayList);
        doTimings("LinkedList", linkedList);


    }


    private static void doTimings(String type, List<Integer> list) {

        //populate my list
        /**
         * 1E5 is 1 * 10 exponential to the power 5 = 100000 items
         */
        for(int i=0; i < 1E5; i++) {
            list.add(i);
        }

        //get the time
        long start = System.currentTimeMillis();

        /**
         //Add item at end of list
         for(int i=0; i < 1E5; i++) {
         list.add(i);
         }
         */

        //Add item at the beginning of a list
        for(int i=0; i< 1E5; i++) {
            list.add(0, i);
        }

        long end = System.currentTimeMillis();

        System.out.println("Time taken: " + (end - start) + "ms for " + type);
    }
}
