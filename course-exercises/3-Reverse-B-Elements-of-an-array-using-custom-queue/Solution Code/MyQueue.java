public class MyQueue {
	
	private int maxSize; // initializes the set number of slots
	private int[] queArray; // slots to main the data
	private int front; // this will be the index position for the element in the front
	private int rear; // going to be the index position for the element at the back of the line
	private int nItems; // counter to maintain the number of items in our queue
	
	public MyQueue(int size){
		this.maxSize = size;
		this.queArray = new int[size];
		front = 0; // index position of the first slot of the array
		rear = -1; // there is no item in the array yet to be considered as the last item.
		nItems =0; // we don't have elements in the array yet
	}
	
	public void insert(int j){
		if(rear == maxSize -1){
			rear = -1;
		}
		rear++;
		queArray[rear] = j;
		nItems ++;
	}
	
	public int remove(){ // remove item from the front of the queue
		int temp = queArray[front];
		front++;
		if(front == maxSize){
			front = 0; // we can set front back to the 0th index so that we can utilize the entire array again
		}
		nItems --;
		return temp;
	}
	
	public int peekFront(){
		return queArray[front];
	}
	
	public boolean isEmpty(){
		return (nItems ==0);
	}
	
	public boolean isFull(){
		return (nItems == maxSize);
	}
	
	public void view(){
		System.out.print("[ ");
		for(int i = 0; i < queArray.length; i++){
			System.out.print(queArray[i]+ " ");
		}
		System.out.print("]");
	}
}