package tests;

import sorting.BubbleSortDead;
import util.LinkedList;
import util.Node;

public class LinkedListTest {
	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		list.add(7);
		list.add(150);
		list.add(20);
		list.add(37);
		list.add(1);
		list.add(1300);
		list.add(5);
		list.add(11);
		list.add(2);
		list.add(72);
		list.add(8);
		System.out.println("Test add 7 150 20 37 1 1300 5 11 2 72 8"); //add
		System.out.println();
		
		System.out.println("Test size"); //size
		System.out.println(list.size());
		System.out.println();
		
		System.out.println("Test print by Get method"); //print by get
		for(int i = 0; i < list.size(); i++)
			System.out.printf("%d ", list.getValue(i));
		System.out.println();
		System.out.println();
		
		System.out.println("Test Remove (removing tail)"); //remove tail
		list.remove(10); //remove tail
		System.out.println(list.size());
		for(int i = 0; i < list.size(); i++)
			System.out.printf("%d ", list.getValue(i));
		System.out.println();
		System.out.println();
		
		System.out.println("Test remove (removing head)"); //remove head
		list.remove(0); // remove head
		System.out.println(list.size());
		for(int i = 0; i < list.size(); i++)
			System.out.printf("%d ", list.getValue(i));
		System.out.println();
		System.out.println();
		
		System.out.println("Test remove (random position index=5)"); // remove
		list.remove(5);
		System.out.println(list.size());
		for(int i = 0; i < list.size(); i++)
			System.out.printf("%d ", list.getValue(i));
		System.out.println();
		System.out.println();
		
		System.out.println("Test addOnHead"); //addOnHead
		list.addOnHead(99999); // add on head
		for(int i = 0; i < list.size(); i++)
			System.out.printf("%d ", list.getValue(i)); System.out.println();
		System.out.println();
		
		System.out.println("Test toString"); // test toString
		System.out.println(list); 
		System.out.println();
		
		
		System.out.println("Test addOnIndex"); //add on index
		list.add(7941, 5); // test add index...
		System.out.println(list);
		System.out.println();
		
		System.out.println("Test swap(int i1, int i2)");
		list.swap(0, 5);
		System.out.println(list);
		System.out.println();
		
		System.out.println("Test swap(Node n1, Node n2)");
		Node n1 = list.get(6);
		Node n2 = list.get(1);
		list.swap(n1, n2);
		System.out.println(list);
		System.out.println();
		
		System.out.println("Test bubble"); //not working
		BubbleSortDead dead = new BubbleSortDead();
		dead.sort(list);
		System.out.println(list);
		
	}

}

