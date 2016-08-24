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
		return binaria(list, value, 0, list.size()-1);
	}
	
	private boolean binaria(LinkedList list, int value, int start, int end) {
		int middle = (end-start)/2;
		Node no = list.get(middle);
		
		if(no.getValue() == value)
			return true;
		else if (start >= end)
			return false;
		else if(no.getValue() > value) {
			return binaria(list, value, start, middle - 1);
		}
		else if (no.getValue() < value)
			return binaria(list, value, middle + 1, end);
		else
			return false;
	}
	
}
