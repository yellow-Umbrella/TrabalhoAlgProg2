package tests;

import java.awt.List;

import util.LinkedList;

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
		
		System.out.println(list.size());
		
		for(int i = 0; i < list.size(); i++)
			System.out.printf("%d ", list.getValue(i));
		System.out.println();
		
		list.remove(10); //remove tail
		System.out.println(list.size());
		for(int i = 0; i < list.size(); i++)
			System.out.printf("%d ", list.getValue(i));
		System.out.println();
		
		list.remove(0); // remove head
		System.out.println(list.size());
		for(int i = 0; i < list.size(); i++)
			System.out.printf("%d ", list.getValue(i));
		System.out.println();
		
		list.remove(5); // remove head
		System.out.println(list.size());
		for(int i = 0; i < list.size(); i++)
			System.out.printf("%d ", list.getValue(i));
		System.out.println();
		
		System.out.println();
		System.out.println("Add on head test...");
		
		list.addOnHead(99999);
		for(int i = 0; i < list.size(); i++)
			System.out.printf("%d ", list.getValue(i));
		System.out.println();
		
		System.out.println(list);
		
		
		
		
	}

}

