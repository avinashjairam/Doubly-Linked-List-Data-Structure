public class Test{
	public static void main(String [] args){
		DoublyLinkedList list = new DoublyLinkedList();

		list.append(5);
		list.push(1);


		list.push(2);
		list.printList();
		list.push(3);
		list.push(4);
		list.append(5);
		list.push(3);

		list.push(4);
		list.append(5);
		list.printList();
		list.deleteInt(3);
		list.printList();
		//list.printListBackwards();

		list.reverseList();
		list.printList();
	}
}