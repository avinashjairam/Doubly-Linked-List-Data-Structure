public class Test{
	public static void main(String [] args){
		DoublyLinkedList list = new DoublyLinkedList();

		list.push(1);
		list.push(2);
		list.push(3);
		list.push(4);

		list.printList();

		list.append(5);

		list.printList();
	}
}