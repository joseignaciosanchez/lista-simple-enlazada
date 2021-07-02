package ListAssigment;

public class ListaTester {

	public static void main(String[] args) {
		
		SinglyLinkedList sll = new SinglyLinkedList();
        sll.add(3);
        sll.add(4);
        sll.add(10);
        sll.add(5);
        sll.add(15);
        sll.add(2);
        sll.remove();
        sll.remove();        
        sll.removeAt(5);
        sll.removeAt(10);
        sll.printValues();

	}

}
