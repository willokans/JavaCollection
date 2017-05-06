/**
 * Created by willokans on 06/05/2017.
 */
public class ArrayListClass {

    public static void main (String[] agrs) {

        //Declare an object of an ArrayList with default size as 10
        java.util.ArrayList<Integer> numbers = new java.util.ArrayList<>();

        //Add value to array list
        numbers.add(100);
        numbers.add(50);
        numbers.add(25);

        //get numbers from the field
        int index1 = numbers.get(0);
        System.out.println("0 index is: " + index1);


        //to get all the value by iterating using a for loop
        System.out.println("\n<<<iteration Number 1>>>");
        for(int i =0; i < numbers.size(); i++) {
            System.out.println("Index " + i + " contains " + numbers.get(i));
        }

        //Second way to iterate list
        System.out.println("\n<<<iteration Number 2>>>");
        for (Integer value : numbers) {
            System.out.println(value);
        }

        System.out.println("\n<<<removing items in the list>>>");
        numbers.remove(0);
        numbers.add(10);
        numbers.remove(numbers.size() -1);

        //to get all the value by iterating using a for loop
        System.out.println("\n<<<iteration Number 1>>>");
        for(int i =0; i < numbers.size(); i++) {
            System.out.println("Index " + i + " contains " + numbers.get(i));
        }




    }
}
