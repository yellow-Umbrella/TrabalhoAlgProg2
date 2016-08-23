package util;

public class Node implements Comparable {
	
	protected int value;
	protected Node next, prev;
	
	public Node() {}//
	
	public Node(int value) {
		this.value = value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
	public void setNext(Node next) {
		this.next = next;
	}
	
	public Node getNext() {
		return this.next;
	}
	
	public void setPrev(Node prev) {
		this.prev = prev;
	}
	
	public Node getPrev() {
		return prev;
	}
	
	public String toString() {
		return value + "";
	}

	@Override
	public int compareTo(Object o) {
		if(o instanceof Node) {
			Node node = (Node) o;
			if(this.value > node.value)
				return 1;
			else if(this.value < node.value)
				return -1;
		}
		return 0;
	}

}


/*
 * class Node {
	 
	 protected int value;
	 protected Node next, prev;
	 
	 public Node() {}
	 
	 public Node(int value) {
		 this.value = value;
	 }
	 
 }
 * 
 * 
*/
