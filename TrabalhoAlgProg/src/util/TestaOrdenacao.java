package util;

public class TestaOrdenacao {

	/**
	 * Verifica se a lista esta ordenada.
	 * @param list
	 */
	public void testar(LinkedList list) {
		for(Node node = list.getHead(); node.getNext() != null; node = node.getNext()) {
			if(node.getNext().getValue() < node.getValue()) {
				System.out.println("Problemas!");
				break;
			}
		}
		System.out.println("OK");
	}

}
