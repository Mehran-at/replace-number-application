//Develop the following code:
//      a. Define the replaceAll action that receives a collection of numbers and two numbers. It will replace the first number with the second number every time it appears in the collection. Then it returns this modified collection.
//      b. Define a collection of numbers.
//      c. Write a code that replaces every occurrence of the number 13 with the number 49 and says the new collection.
//Available actions: getSeveralNumbers()
//
//Collection example: [4, 13, 6, 49, 13, 6]
//Collection replaced: [4, 49, 6, 49, 49, 6]
import java.util.ArrayList;
import java.util.List;

public class ReplaceAllApplication {
    public static void main(String[] args) {
        ReplaceNumber replaceNumber = new ReplaceNumber();
        List<Integer> integers = new ArrayList<>();
        integers.add(4);
        integers.add(13);
        integers.add(6);
        integers.add(49);
        integers.add(13);
        integers.add(6);
        List<Integer> severalNumbers = replaceNumber.getSeveralNumbers(integers, 13, 1);
        System.out.println(severalNumbers);
    }
}
