public class Test{
	public static void main(String [] args){
		DoublyLinkedList list = new DoublyLinkedList();

		list.append(5);
			//			System.out.println("head is " + list.head.data);


		list.printList();

		list.push(1);
		

		list.push(2);
			list.push(3);
		list.push(4);
		list.append(5);
		list.push(3);
		list.insertAtPosition(1,66);
		list.push(4);
		list.append(5);
		list.printList();

		//list.printList();
	}
}