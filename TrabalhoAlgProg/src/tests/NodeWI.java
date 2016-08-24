package tests;

import util.Node;

public class NodeWI implements Comparable {
	
	protected int value, index;
	protected NodeWI next, prev;
	
	public NodeWI() {}//
	
	public NodeWI(int value) {
		this.value = value;
		if(this.prev == null)
			this.index = 0;
		else
			this.index = this.prev.getIndex() + 1;
	}
	
	public int getIndex() {
		return this.index;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
	public void setNext(NodeWI next) {
		this.next = next;
	}
	
	public NodeWI getNext() {
		return this.next;
	}
	
	public void setPrev(NodeWI prev) {
		this.prev = prev;
	}
	
	public NodeWI getPrev() {
		return prev;
	}
	
	public String toString() {
		return value + "";
	}

	@Override
	public int compareTo(Object o) {
		if(o instanceof NodeWI) {
			NodeWI node = (NodeWI) o;
			if(this.value > node.value)
				return 1;
			else if(this.value < node.value)
				return -1;
		}
		return 0;
	}

}
