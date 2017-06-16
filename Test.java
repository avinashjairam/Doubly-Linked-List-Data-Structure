public class Test{
	public static void main(String [] args){
		DoublyLinkedList list = new DoublyLinkedList();

		list.append(5);
			//			System.out.println("head is " + list.head.data);


		list.printList();

		list.push(1);
		//				System.out.println("head is " + list.head.data);

		list.push(2);
		//		System.out.println("head is " + list.head.data);

		// list.insertAtPosition(2,6);
		// list.printList();
		list.push(3);
		list.push(4);
		list.append(5);
		list.push(3);
		list.push(4);
		list.append(5);
		list.printList();
//		list.deleteAtPos(1);
		list.deleteAtPos(2);
		list.printList();
	}
}