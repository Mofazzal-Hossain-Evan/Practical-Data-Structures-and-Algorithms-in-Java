/* 
// In this file, the method insertAfterPosition() was contributed by Arijit Basuin Q&A Section
// Arijit Basu: https://www.udemy.com/user/arijitbasu4/ 
// Q&A Thread: https://www.udemy.com/course/practical-data-structures-algorithms-in-java/learn/lecture/4784644#questions/1724238
*/

package ds.singlylinkedlist;

public class SinglyLinkedList {
	private Node first;
	private Node last;

	public SinglyLinkedList() {

	}

	public boolean isEmpty() {
		return (first == null);
	}

	// used to insert at the beginning of the list
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = first;
		first = newNode;
	}

	public Node deleteFirst() {
		Node temp = first;
		first = first.next;
		return temp;
	}

	public void displayList() {
		System.out.println("List (first --> last) ");
		Node current = first;
		while (current != null) {
			current.displayNode();
			current = current.next;
		}
		System.out.println();
	}

	public void insertLast(int data) {
		Node current = first;
		while (current.next != null) {
			current = current.next; // we'll loop until current.next is null
		}
		Node newNode = new Node();
		newNode.data = data;
		current.next = newNode;
	}

	/**
	 * 
	 * Insert after a specified node
	 * 
	 * @param data
	 * 
	 * @param position
	 * 
	 */

	public void insertAfterPosition(int data, int position) {
		Node currentFirstNode = first;
		int counter = 0;
		while (currentFirstNode != null) {
			if (position == counter) {
				Node newNode = new Node();
				newNode.data = data;
				newNode.next = currentFirstNode.next;
				currentFirstNode.next = newNode;
				break;
			}
			else {
				currentFirstNode = currentFirstNode.next;
				counter++;
			}
		}
	}

}
