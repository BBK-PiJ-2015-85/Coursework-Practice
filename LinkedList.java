public class LinkedList {
	private LinkedList next;
	private String value;
	
	public LinkedList(){
		super();
	}
	
	public LinkedList(String value) {
		this.next = null;
		this.value = value;
	}
	
	public String getValue(){
		return value;
	}
	
	public void add(String value) {
		
		if (value == null) {
			this.value = value;
		} else if (next == null){
			next = new LinkedList(value);
		} else {
			next.add(value);
		}
	}
	
	public void print() {
		System.out.print(value + ",");
		if (next != null) {
			next.print();
		}
	}
	
	public void delete(String value) {
		if (this.value.equals(value)) {
			//this is the first in the list
			if (next == null) {
				this.value = null;
			} else {
				this.value = next.value;
				this.next = next.next;
			}			
		} else if (next == null) {
			//have reached end of list and not found element to delete
			System.out.println("Element not found.");
			return;
		} else if (next.value.equals(value)) {
			//next item is the one to delete
			if (next.next == null) {
				next = null;
			} else {
				next = next.next;
			}
		} else {
			next.delete(value);
		}
	}
}