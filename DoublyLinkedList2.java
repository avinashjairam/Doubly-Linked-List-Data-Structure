//This class implements a doubly linked list of integers in Java
//The instance variables head and tail are initially null
//As elements are added, head points to the first element on the list and tail points to the last element. Each node on the list is
//of type DoubleNode.  Each DoubleNode holds a pointer to the previous node and a pointer to the next node in the list. 

public class DoublyLinkedList2{
	private DoubleNode head;
	private DoubleNode tail;

	//Constructs a new DoublyLinkedList object with head and tail as null
	public DoublyLinkedList2(){
		head = null;
		tail = null;
	}

	//Returns true if the list is empty
	public boolean isEmpty(){
		return head == null;
	}

	//Adding a node to the end of the list 
	public void append(int data){
		DoubleNode newNode = new DoubleNode(tail, data, null);

		if(isEmpty()){
			head = tail = newNode;
		}
		else{
			tail.setNext(newNode);
			tail = newNode;
		}
	}

	//Add a node to the front of the list
	public void push(int data){
		DoubleNode newNode = new DoubleNode(null, data, head);

		if(isEmpty()){
			head = tail = newNode;
		}
		head.setPrev(newNode);
		head = newNode;
	}

	//Remove a node from the front of the list
	public int removeFront(){
		int x = head.data;

		if(!isEmpty()){
			if(head == tail){
				head = tail = null;
			}
			else{
				head = head.getNext();
				head.setPrev(null);
			}
		}

		return x;
	}

	//Remove a Node from the end of the list

	public int removeEnd(){
		int x = tail.data;

		if(!isEmpty()){
			if(head == tail){
				head = tail = null;
			}

			tail = tail.getPrev();
			tail.setNext(null);

		}
		
		return x; 
	}

	//Count The Number of Nodes in the list
	public int countNodes(){
		int count = 0;
		DoubleNode temp = head;

		while(head != null){
			count++;
			temp = head.getNext();
		}

		return count;
	}

	//Deletes the first occurence of the a number in the list. The list is not modified at all. 
	public void deleteInt(int x){
		DoubleNode temp = head; 

		while(temp.getData() != x){
			temp = temp.getNext();
		}
		if(temp != null){
			//if the item to be deleted is head 
			if(temp.getPrev() == null){
				head = temp.getNext();

				if(!isEmpty()){
					head.setPrev(null);
				}
			}
			else if(temp.getNext() == null){
				tail = tail.getPrev();

				if(!isEmpty()){
					tail.setNext(null);
				}
			}
			else{
				temp.getPrev().setNext(temp.getNext());
				temp.getNext().setPrev(temp.getPrev());
			}
		}

	}

	public void printList(){
		DoubleNode temp = head;

		while(temp != null){
			System.out.print(temp.data + " ");
			temp = temp.getNext();
		}

		System.out.println();
	}
	

}