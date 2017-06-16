/** The class DoubleNode has two pointers and a integer. It is used to represent a single node on a double linked list**/

public class DoubleNode{
	private DoubleNode prev;
	private DoubleNode next;

	public int data;

	//Constructor with no arguments
	public DoubleNode(){
		this(null, -1, null);
	}

	//Constructor with an integer
	public DoubleNode(int data){
		this(null, data, null);
	}

	//Constructor with 3 arguments 
	//@param p is a pointer to a previous node
	//@param data is the int for this node
	//@param n is a pointer to the next node
	public DoubleNode(DoubleNode p, int data, DoubleNode n){
		this.prev = p;
		this.next = n;
		this.data = data;
	}

	//@return the int for the node 
	public int getData(){
		return this.data;
	}

	//@return the pointer to the next node or null if none exists
	public DoubleNode getNext(){
		return this.next;
	}

	//@return the pointer to the previous node or null if none exists
	public DoubleNode getPrev(){
		return this.prev;
	}

	//Setting the data for this node
	public void setData(int data){
		this.data = data;
	}

	//Set the next pointer 
	public void setNext(DoubleNode next){
		this.next = next;
	}

	//Set the prev pointer
	public void setPrev(DoubleNode prev){
		this.prev = prev;
	}

	public String toString(){
		return Integer.toString(this.data);
	}
}