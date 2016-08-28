package tests;

<<<<<<< HEAD
import sorting.MergeSort;
=======
import toDo.MergeSort;
>>>>>>> branch 'master' of https://github.com/yellow-Umbrella/TrabalhoAlgProg2.git
import util.LinkedList;

public class MergeSortTest {
	
	public static void main(String[] args) {
		
		int[] vet = {5, 1, 3, 7, 2};
		LinkedList list = new LinkedList(vet);
		MergeSort merge = new MergeSort();
		System.out.println(list.size() + " " + list.getHead() + " " + list.getTail() + "\n" + list);
		
		merge.sort(list);
		
<<<<<<< HEAD
		System.out.println(list.size() + " " + list.getHead() + " " + list.getTail() + "\n" + list);
=======
		new MergeSort().sort(list);
		
		System.out.println(list);
>>>>>>> branch 'master' of https://github.com/yellow-Umbrella/TrabalhoAlgProg2.git
		
	}

}
