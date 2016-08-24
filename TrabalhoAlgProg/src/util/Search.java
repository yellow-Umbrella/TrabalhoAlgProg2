package util;

public class Search {
	
	public boolean sequential(LinkedList list, int value) {
		Node no = list.get(0);
		
		while(no != null) {
			if(no.getValue() == value)
				return true;
			no = no.next;
		}
		return false;
	}
	
	public boolean binary(LinkedList list, int value) {
		return binaria(list, value, 0, list.size() - 1);
	}
	
	private boolean binaria(LinkedList list, int value, int start, int end) {
		if(start > end)
			return false;
		else {
			int middle = (end - start)/2, compare = list.get(middle).getValue();
			if(compare == value)
				return true;
			else if(value > compare)
				return binaria(list, value, middle + 1, end);
			else
				return binaria(list, value, start, middle - 1);
		}
	}
	
}
