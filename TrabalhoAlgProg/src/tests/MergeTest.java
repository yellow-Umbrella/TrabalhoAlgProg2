package tests;

import sorting.InsertionSortO;
import util.LinkedList;

public class MergeTest {
	public static void main(String[] args) {
		InsertionSortO merge = new InsertionSortO();
		int[] vet = {7, 676, 22, 11, 72, 31, 11, 0, 1, 2, 3, 676, 5, 4};
		LinkedList list = new LinkedList(vet);
		
		System.out.println(list);
		System.out.println(list.size() + " " + list.getHead().getValue() + " " + list.getTail().getValue());
		
		merge.sort(list);
		
		System.out.println(list);
		System.out.println(list.size() + " " + list.getHead().getValue() + " " + list.getTail().getValue());		
		
	}

}
