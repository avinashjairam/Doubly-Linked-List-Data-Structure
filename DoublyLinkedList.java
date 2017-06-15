public class DoublyLinkedList{
	Node head;

	public DoublyLinkedList(){
		head = null;
	}

	public void push(int data){

		Node newNode = new Node(data);

		if(head == null){
			head = newNode;
		}
		else{
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}
	}

	public void insertBefore(Node befNode, int data){
		//Check if the befNode is null
		if(befNode == null){
			System.out.println("the given befNode node cannot be null");
			return;
		}

		//Allocate new Node
		Node newNode = new Node(data);

		//Make the next of the new Node the befNode
		newNode.next = befNode;
	
		newNode.prev = befNode.prev;
		//Make the previous of the befNode the previous of the newNode

		if(newNode.prev != null){
			newNode.prev.next = newNode;
		}
		
	}

	public void insertAfter(Node prevNode, int data){
		//Check if Prev Node is Null
		if(prevNode == null){
			System.out.println("the given previous node cannot be null");
			return; 
		}

		//Allocate new Node
		Node newNode = new Node(data);

		//Make new of newNode as next of previous Node
		newNode.next = prevNode.next;

		//Make the next of prevNode as new node
		prevNode.next = newNode;

		//Make prevNode as the previous of the newNode
		newNode.prevNode = prevNode;

		//Change the previous of newNode's next node
		if(newNode.next != null){
			newNode.next.prev = newNode;
		}

	}

	//Adding a node to the end of the list: Given a reference (pointer to pointer) to the head 
	//of a DLL and an int, appends a new node at the end 
	public void append(int data){
		Node newNode = new Node(data);

		//This node is going to be the last node, so make the next of it null
		newNode.next = null;

		Node last = head;

		//If the list is empty, then make the new node the head of the list 
		if(head == null){
			newNode.prev = null;
			head = newNode;
			return;
		}

		//Otherwise, travel until the last node
		while(last.next != null){
			last = last.next;
		}

		last.next = newNode;
		newNode.prev = last; 
	}

	public void printList(){
		while(head != null){
			System.out.print(head.data);
			head.next;
		}

		System.out.println();
	}


}