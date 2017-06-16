public class DoublyLinkedList{
	Node head, tail;
	int size;

	public DoublyLinkedList(){
		this.head = null;
		this.tail = null;
		this.size = 0;
	}

	public boolean isEmpty(){
		return head == null;
	}

	public int getSize(){
		return size;
	}

	public void push(int data){

		Node newNode = new Node(data);

		if(head == null){
			head = newNode;
			tail = newNode;
		}
		else{
			head.prev = head;
			newNode.next = head;
			head = newNode;
		}

		size++;
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
	//Function to insert element at position
	public void insertAtPosition(int val, int pos){
		Node newNode = new Node(val);

		if(pos == 1){
			push(val);
			return;
		}

		Node ptr = head;

		for(int i = 2; i <= size; i++){
			if(i == pos){
				Node tmp = ptr.next;
				ptr.next = newNode;
				newNode.prev = ptr;
				newNode.next = tmp; 
				tmp.prev = newNode; 
			}

			ptr = ptr.next;
		}

		size++;

	}

	public void deleteAtPos(int pos){
		if(pos == 1){
			if(size == 1){
				head = null;
				tail = null;
				size = 0;
				return;
			}

			head = head.next;
			head.prev = null;
			size--;
			return;
		}

		if(pos == size){
			tail = tail.prev;
			tail.next = null;
			size--;
			return;
		}

		Node ptr = head.next;

		for(int i = 2; i <= size; i++){
			if(i == pos){
				Node p = ptr.prev;
				Node n = ptr.next;

				p.next = n;
				n.prev = p;

				size--;
				return;
			}

			ptr = ptr.next;
		}

	}

	//Adding a node to the end of the list: Given a reference (pointer to pointer) to the head 
	//of a DLL and an int, appends a new node at the end 
	public void append(int data){
		Node newNode = new Node(data);

		if(head == null){
			head = newNode;
			tail = newNode;
		}
		else{
			newNode.prev = tail;
			tail.next = newNode;
			tail = newNode;
		}

		size++;
	}

	public void printList(){
		while(head != null){
			System.out.print(head.data + " ");
			head = head.next;
		}

		System.out.println();
	}


}
