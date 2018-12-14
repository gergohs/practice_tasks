import java.util.*;
/* Steps:
#1: ArrayList to store mixed numbers from 1 to 20 - the ArrayList can be expandable
#2: Shuffling the original list
#3: Calculate the sum of the elements in the ArrayList
#4: Remove a random element from the list
#5: Find the missing element, using for:each statement to iterate through the ArrayList
*/
public class findMissingNum {
    public static void main(String[] args) {
// #1
        ArrayList<Integer> listForCheck = new ArrayList<>(
        Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20));
        System.out.println("The original list: " + listForCheck + "\n");
// #2
        Collections.shuffle(listForCheck);
        System.out.println("The shuffled list: " + listForCheck);
// #3
        int sumOfElements = (listForCheck.size() * (listForCheck.size() + 1)) / 2;
// #4
        Random randNum = new Random();
        int randomELement = randNum.nextInt(listForCheck.size());
        listForCheck.remove(listForCheck.size() - randomELement);
        System.out.println("Remove an element: " + listForCheck + "\n");
// #5
        for (Integer elementOfList : listForCheck) {
            sumOfElements -= elementOfList;
        }
        System.out.println("* * * * * The missing number is: " + sumOfElements + " * * * * *");
    }
}
