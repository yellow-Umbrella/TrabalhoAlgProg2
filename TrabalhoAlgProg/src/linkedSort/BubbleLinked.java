package linkedSort;

import util.LinkedList;

public class BubbleLinked {
	
	public void sort(LinkedList list) {
		for(int i = 0; i < list.size()-1; i++)
			for(int j = 0; j < list.size()-1; j++)
				if(list.getValue(j) > list.getValue(j+1))
					list.swap(j, j+1);
		
	}

}
