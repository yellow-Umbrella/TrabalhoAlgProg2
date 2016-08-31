package util;

public class Node implements Comparable<Object> {
	
	protected int value;
	protected Node next, prev;
	
	public Node() {}//
	
	public Node(int value) {
		this.value = value;
	}
	
	public Node(Node node) {
		this.value = node.value;
		this.next = node.next;
		this.prev = node.prev;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
	public void setNext(Node next) {
		this.next = next;
		if(next != null)
			next.prev = this;
	}
	
	public Node getNext() {
		return this.next;
	}
	
	public void setPrev(Node prev) {
		this.prev = prev;
		if(prev != null)
			prev.next = this;
	}
	
	public Node getPrev() {
		return prev;
	}
	
	public String toString() {
		return value + "";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Node) {
			Node node = (Node) obj;
			if(this.value == node.value)
				return true;
		}
		return false;
	}

	@Override
	public int compareTo(Object o) {
		if(o instanceof Node) {
			Node node = (Node) o;
			if(this.value > node.value)
				return 1;
			else if(this.value < node.value)
				return -1;
			else 
				return 0;
		}
		return 0;
	}

}
