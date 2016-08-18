 package util;
 
 class Node {
	 
	 protected int value;
	 protected Node next, prev;
	 
	 public Node() {
		 
	 }
	 
	 public Node(int value) {
		 this.value = value;
	 }
	 
 }
 
/**
 * 
 * @author yellow-Umbrella
 *
 */
public class DoublyLinkedList implements List {
	
	private int size = 0;
	private Node head, tail;
	
	public DoublyLinkedList() {
		
	}
	
	public DoublyLinkedList(int vet[]) {
		first(new Node(vet[0]));
		size++;
		for(int i = 1; i < vet.length; i++, size++)
			add(vet[i]);
	}
	
	/**
	 * Adiciona inteiro no final da lista.
	 * @param obj inteiro a ser colocado na lista.
	 */
	@Override
	public void add(int obj) {
		Node node = new Node(obj);
		
		if(isEmpty()) {
			first(node);
		}
		else {
			tail.next = node;
			node.prev = tail;
			tail = node;
			size++;
		}
	}
	
	/**
	 * Adiciona inteiro na cabeca da lista.
	 * @param obj
	 */
	public void addOnHead(int obj) {
		Node node = new Node(obj);
		if(isEmpty()) {
			first(node);
		}
		
		else {
			node.next = head;
			head.prev = node;
			head = node;
			size++;
		}
			
	}
	
	/**
	 * Adiciona o inteiro no index fornecido.
	 * @param Obj inteiro a ser adicionado
	 * @param index da posicao a ser adicionado 
	 */
	@Override
	public boolean add(int obj, int index) throws RuntimeException {
		if(isEmpty())
			throw new RuntimeException("Lista vazia...");
		
		Node node = head;
		while(index > 0) {
			node = node.next;
			index--;
		}
		
		Node newNode = new Node(obj);
		newNode.next = node.next;
		newNode.prev = node;
		node.next = newNode;
		size++;
		
		return true;
	}
	
	/**
	 * Retira o noh correspondente ao index.
	 * @param index da posicao a ser retirada.
	 */
	@Override
	public void remove(int index) {
		if(size > 0) {
			Node remove = head;
			while(index > 0) {
				remove = remove.next;
				index--;
			}
			
			remove.prev.next = remove.next;
			remove.next.prev = remove.prev;
			remove = null;
			size--;
			
		}
		
	}
	
	/**
	 * Troca os valores das posicoes
	 */
	@Override
	public boolean swap(int i1, int i2) throws RuntimeException {
		if(isEmpty())
			throw new RuntimeException("Lista vazia...");
		
		int value1 = get(i1).value;
		int value2 = get(i2).value;
		
		get(i1).value = value2;
		get(i2).value = value1;
		
		return true;
	}
	
	/**
	 * Retorna o tamanho da lista.
	 */

	@Override
	public int size() {
		return size;
	}
	
	/**
	 * Retorna o noh correspondente na posicao index.
	 * @param index da posicao desejada.
	 * @throws RuntimeException se a lista estiver vazia.
	 */
	@Override
	public Node get(int index) throws RuntimeException {
		if(isEmpty())
			throw new RuntimeException("Lista vazia");
		
		Node node = head;
		while(index > 0) {
			node = node.next;
			index--;
		}
		
		return node;	
	}
	
	/**
	 * Retorna o valor do noh na posicao index.
	 * @param index da posicao desejada
	 * @return Valor que esta no noh do index.
	 * @throws RuntimeException
	 */
	public int getValue(int index) throws RuntimeException {
		if(isEmpty())
			throw new RuntimeException("Lista vazia...");
		
		Node node = head;
		while(index > 0) {
			node = node.next;
			index--;
		}
		
		return node.value;
	}
	
	/**
	 * Retorna true se a lista esta vazia e false caso contrario.
	 */
	@Override
	public boolean isEmpty() {
		return head == null;
	}
	
	/**
	 * Inicia a lista.
	 * @param node
	 */
	private void first(Node node) {
		this.head = node;
		this.tail = node;
		size++;
	}
	
	@Override
	public String toString() {
		String stg = "";
		if(size > 0) {
			Node node = head;
		
			while(node != null) {
				stg += node.value;
				node = node.next;
			}
		}
		return stg;
	}

}
