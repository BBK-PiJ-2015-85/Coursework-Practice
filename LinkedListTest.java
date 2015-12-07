public class LinkedListTest {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList("0");
		ll.add("1");
		ll.add("2");
		ll.add("3");
		ll.add("4");
		ll.add("5");
		
		ll.print();
		System.out.println();
		ll.delete("0");
		ll.delete("1");
		ll.delete("2");
		ll.delete("3");
		ll.delete("4");
		ll.delete("5");
		ll.print();
	}
}