package util;

public interface List {
	
	void add(int obj);
	boolean add(int obj, int index);
	void remove(int index);
	int size();
	Node get(int index);
	void swap(int i1, int i2);
	boolean isEmpty();

}
