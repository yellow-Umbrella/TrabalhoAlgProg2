package util;

public class Node implements Comparable<Object> {
	
	protected int value;
	protected Node next, prev;
	
	/**
	 * Contrutor que cria um Nó vazio.
	 */
	public Node() {}
	
	/**
	 * Contrutor que cria um Nó com o valor recebido.
	 * @param value
	 */
	public Node(int value) {
		this.value = value;
	}
	
	/**
	 * Contrutor que cria uma cópia do Nó recebido.
	 * @param node
	 */
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
	
	/**
	 * Método que retorna em String o valor do nó.
	 */
	@Override
	public String toString() {
		return value + "";
	}
	
	/**
	 * Método que diz se o nó é igual ao recebido.
	 */
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Node) {
			Node node = (Node) obj;
			if(this.value == node.value)
				return true;
		}
		return false;
	}

	/**
	 * Método que compara os valores dos nós.
	 */
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
