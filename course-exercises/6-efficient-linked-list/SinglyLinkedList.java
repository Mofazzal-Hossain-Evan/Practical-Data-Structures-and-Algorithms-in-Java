public class SinglyLinkedList {
	private Node first;
	private Node last;

	public SinglyLinkedList() {
		first = null;
		last = null;
	}
	
	// Getter for first property
    public Node getFirst() {
        return first;
    }
	
	// Getter for last property
    public Node getLast() {
        return last;
    }

	public boolean isEmpty() {
		return (first == null);
	}

	// used to insert at the beginning of the list
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		if(isEmpty() == true){
			last = newNode; 
		}
		newNode.next = first;
		first = newNode;
	}

	public void insertLast(int data) {
		Node newNode = new Node();
		newNode.data = data;
		if(isEmpty() == true){
			first = newNode;
			last = newNode;
		} else {
			last.next = newNode; // the next value of the last node will point to the new node
			last = newNode; // we make the new node we created be the last one in the list
		}
	}
    
	public void insertAfterPosition(int data, int position) {
		Node currentFirstNode = first;
		int counter = 1;
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

	public int deleteFirst() {
		int temp = first.data;
		if(first.next == null){
			last = null;
		}
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
}



/* Credits:
// In this file, the method insertAfterPosition() was contributed by Arijit Basuin from Q&A Section
// Q&A Thread: https://www.udemy.com/course/practical-data-structures-algorithms-in-java/learn/lecture/4784644#questions/1724238
// Arijit Basu: https://www.udemy.com/user/arijitbasu4/ 
*/