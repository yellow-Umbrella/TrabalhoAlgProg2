package util;

public class Node {
	
	protected int value;
	protected Node next, prev;
	
	public Node() {}
	
	public Node(int value) {
		this.value = value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
	public String toString() {
		String ret = "";
		return ret + value;
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
