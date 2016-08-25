package util;

import java.util.Iterator;
import java.util.NoSuchElementException;


public class LinkedList implements List , Iterable<Node>{
	
	private int size = 0;
	private Node head, tail;
	
	/**
	 * Construtor cria uma lista vazia.
	 */
	public LinkedList() {}
	
	/**
	 * Contrutor cria uma lista com o vetor recebido.
	 * @param vet
	 */
	public LinkedList(int vet[]) {
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
	public boolean add(int obj, int index) throws RuntimeException { //incompleto
		if(isEmpty())
			throw new RuntimeException("Lista vazia...");
		if(index >= 0 && index < size) {
			Node node = head;
			while(index > 1) {
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
		else
			throw new RuntimeException("IndexOutOfBoundsExceptionLOL");
	}
	
	/**
	 * Retira o noh correspondente ao index.
	 * @param index da posicao a ser retirada.
	 */
	@Override
	public void remove(int index) {
		if(size > 0 && index < size) {
			if (index == 0) {
				head = head.next;
				head.prev = null;
			}
			else if (index == size - 1) {
				tail = tail.prev;
				tail.next = null;
			}
			else {
				Node remove = head;
				while(index > 0) {
					remove = remove.next;
					index--;
				}
				
				remove.prev.next = remove.next;
				remove.next.prev = remove.prev;
				remove = null;
			}
			size--;
		}
		
	}
	
	/**
	 * Troca os valores das posicoes
	 */
	@Override
	public void swap(int i1, int i2) throws RuntimeException {
		if(isEmpty())
			throw new RuntimeException("Lista vazia...");
		
		if((i1 >= 0 && i1 < size) && (i2 > 0 && i2 < size)) {
			int value1 = get(i1).value;
			int value2 = get(i2).value;
			
			get(i1).value = value2;
			get(i2).value = value1;
		}
		else
			throw new RuntimeException("Index invalido...");
		
	}
	
	/**
	 * Troca os valores dos nodes.
	 * @param n1
	 * @param n2
	 * @throws RuntimeException
	 */
	public void swap(Node n1, Node n2) throws RuntimeException {
		if(isEmpty())
			throw new RuntimeException("Lista vazia...");
		
		if(n1 != null && n2 != null) {
			int aux = n1.value;
			n1.value = n2.value;
			n2.value = aux;
		}
		else
			throw new RuntimeException("Noh nulo...");
			
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
			throw new RuntimeException("Lista vazia...");
		
		Node node = head;
		while(index > 0) {
			node = node.next;
			index--;
		}
		
		return node;	
	}
	
	/**
	 * Retorna o final (tail) da lista.
	 * @return
	 */
	public Node getTail() {
		return tail;
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
	
	/**
	 * 
	 * @param begin include 0
	 * @param end exclude end i.e end 10 go only to 9
	 * @return
	 */
//	public LinkedList subList(int begin, int end) {
//		LinkedList newList = new LinkedList();
//		Node nodeB = get(begin);
//		nodeB.prev = null;
//		newList.head = nodeB;
//		
//		Node nodeE = get(end-1);
//		nodeE.next = null;
//		newList.tail = nodeE;
//		
//		Node n = newList.head;
//		while(n != null) {
//			newList.size++;
//			n = n.next;
//		}
//		
//		return newList;
//	}
	
	@Override
	public String toString() {
		String stg = "";
		if(size > 0) {
			Node node = head;
		
			while(node != null) {
				stg += node.value + " ";
				node = node.next;
			}
		}
		return stg;
		
	}

	@Override
	public Iterator<Node> iterator() {
		final LinkedList list = this;
		
		return new Iterator<Node>() {
			final Node first = list.head;
			Node current = null;
			
			@Override
			public boolean hasNext() {
				if(list.isEmpty() || current == list.tail) //ask why it does'n work with .equals()
					return false;
				return true;
			}

			@Override
			public Node next() {
				if(list.isEmpty())
					throw new NoSuchElementException();
				else if(current == null) {
					this.current = first;
					return current;
				}
				else if(current.next == null)
					throw new NoSuchElementException();
				
				this.current = current.next;
				return current;
			}
			
			
		};
	}

}
