package util;

public class Search {
	/**
	 * Executa a busca sequencial do valor dado na lista dada
	 * @param list
	 * @param value
	 * @return
	 */
	public boolean sequential(LinkedList list, int value) {
		Node no = list.get(0);
		
		while(no != null) {
			if(no.getValue() == value)
				return true;
			no = no.next;
		}
		return false;
	}
	
	/**
	 * Executa a busca binária do valor dado na lista dada
	 * @param list
	 * @param value
	 * @return
	 */
	public boolean binary(LinkedList list, int value) {
		return binary(list, value, 0, list.size() - 1);
	}

	private boolean binary(LinkedList list, int value, int start, int end) {
		int middle = (start + end)/2;
		int compare = list.get(middle).getValue();
		
		if(start > end)
			return false;
		else if(compare == value)
			return true;
		else if(value > compare)
			return binary(list, value, middle + 1, end);
		else
			return binary(list, value, start, middle - 1);
	}
	
}
