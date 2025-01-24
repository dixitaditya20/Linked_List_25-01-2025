import java.util.LinkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

       // Insert Data in Linked List Start
        list.add(10);
        list.add(14);
        list.add(1);
        list.add(6);
        System.out.println("Linked List : " + list);
        // Insert Data in Linked List End

        // Insert Data at Start of Linked List Start
         list.addFirst(5);
         list.addFirst(98);
         System.out.println("Adding Data in Linked List at 1st : " + list);
        // Insert Data at Start of Linked List End

        // Insert Data at End of Linked List Start
         list.addLast(100);
         list.addLast(200);
         System.out.println("Adding Data in Linked List at Last : " + list);
        // Insert Data at End of Linked List End

        // Search Data in Linked List Start
        System.out.println("Search Data in Linked List : " + list.contains(10));

        //Advance Search Start
        for(int i : list){
            if(i == 10){
                System.out.println("Advanced For Loop Data Found : " + i);
            }
        }
        //Advance Search End

        // Search Data in Linked List End

        // Check if the element 10 is present in the list Start
        // using contains() method
        System.out.println("Is the element 10 present in the list? " + list.contains(10));
        // Check if the element 10 is present in the list End

        //Remove Data from Linked List Start
        list.remove(1);
        System.out.println("Linked List after removing 1st element : " + list);
        //Remove Data from Linked List End

        //Remove last first element from Linked List Start
        list.removeFirst();
        System.out.println("Remove First Linked List after removing : " + list);
        //Remove last first element from Linked List End

        //Remove first last element from Linked List Start
        list.removeLast();
        System.out.println("Remove Last Linked List after removing : " + list);
        //Remove first last element from Linked List End

    }
}