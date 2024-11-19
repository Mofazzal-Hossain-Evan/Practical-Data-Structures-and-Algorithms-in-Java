/* Ignore this file: Instructor Code (For Testing) */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.udemy.ucp.*;

public class Evaluate {
    // Test 6 of the following functionalities using just one simple LL [1,2,3,4,5,6]
    // Print relavant output
    // 1. Test insertion at (1.1) Beginning, (1.2) middle, and (1.3) at last positions.
    @Test
    public void test_insert_beginning_1(){
        SinglyLinkedList list1 = new SinglyLinkedList();
        // Test Insertion
        list1.insertFirst(10);
        System.out.println("Linked List:");
        list1.displayList();
        assertEquals(10, list1.getFirst().data);
    }
    @Test
    public void test_insert_beginning_2(){
        int[] input = new int[]{1,2,3,4,5,6};
        SinglyLinkedList list1 = new SinglyLinkedList();
        for(int i=0; i<input.length; i++) { 
            list1.insertLast(input[i]); 
        }
        System.out.println("Linked List Input:");
        list1.displayList();
        // Test Insertion
        list1.insertFirst(10);
        System.out.println("Linked List after Insertion:");
        list1.displayList();
        Node testFirst = list1.getFirst();
        assertEquals(10, testFirst.data);
    }
    @Test
    public void test_insert_middle_1(){
        int[] input = new int[]{10,5};
        SinglyLinkedList list1 = new SinglyLinkedList();
        for(int i=0; i<input.length; i++) { 
            list1.insertLast(input[i]); 
        }
        System.out.println("Linked List Input:");
        list1.displayList();
        // Test Insertion
        list1.insertAfterPosition(8, 1);
        System.out.println("Linked List after Insertion:");
        list1.displayList();
        Node currentNode = list1.getFirst();
        currentNode = currentNode.next;
        assertEquals(8, currentNode.data);
    }
    @Test
    public void test_insert_middle_2(){
        int[] input = new int[]{1,2,3,4,5,6};
        SinglyLinkedList list1 = new SinglyLinkedList();
        for(int i=0; i<input.length; i++) { 
            list1.insertLast(input[i]); 
        }
        System.out.println("Linked List Input:");
        list1.displayList();
        // Test Insertion
        list1.insertAfterPosition(100, 3);
        System.out.println("Linked List after Insertion:");
        list1.displayList();
        Node currentNode = list1.getFirst();
        int counter = 1;
        while(counter<4) {
            currentNode = currentNode.next;
            counter++;
        }
        assertEquals(100, currentNode.data);
    }
    @Test
    public void test_insert_end(){
        int[] input = new int[]{1,2,3,4,5,6};
        SinglyLinkedList list1 = new SinglyLinkedList();
        for(int i=0; i<input.length; i++) { 
            list1.insertLast(input[i]); 
        }
        System.out.println("Linked List Input:");
        list1.displayList();
        // Test Insertion
        list1.insertLast(37);
        Node testLast = list1.getLast();
        assertEquals(37, testLast.data);
        System.out.println("Linked List after Insertion:");
        list1.displayList();
    }
    // 2. Test (2.1) first & (2.2) last property getters
    // 2.1 Test if first is pointing to first node using first_getter()
    // 2.2 Test if last is pointing to last node using last_getter() and a while loop
    @Test
    public void test_first_getter(){
        int[] input = new int[]{1,2,3,4,5,6};
        SinglyLinkedList list1 = new SinglyLinkedList();
        for(int i=0; i<input.length; i++) { 
            list1.insertLast(input[i]); 
        }
        assertEquals(input[0], list1.getFirst().data);
        System.out.println("Linked List Input:");
        list1.displayList();
        System.out.println("First Node Data:" + list1.getFirst().data);
    }
    
    @Test
    public void test_last_getter(){
        int[] input = new int[]{1,2,3,4,5,6};
        SinglyLinkedList list1 = new SinglyLinkedList();
        for(int i=0; i<input.length; i++) { 
            list1.insertLast(input[i]); 
        }
        assertEquals(input[input.length-1], list1.getLast().data);
        System.out.println("Linked List Input:");
        list1.displayList();
        System.out.println("Last Node Data:" + list1.getLast().data);
    }
    @Test
    public void test_delete_first(){
        int[] input = new int[]{10,8,5};
        SinglyLinkedList list1 = new SinglyLinkedList();
        for(int i=0; i<input.length; i++) { 
            list1.insertLast(input[i]); 
        }
        System.out.println("Linked List Input:");
        list1.displayList();
        // Test Deletion
        list1.deleteFirst();
        System.out.println("Linked List after Deletion:");
        list1.displayList();
        Node currentNode = list1.getFirst();
        assertEquals(input[1], list1.getFirst().data);
    }
}
