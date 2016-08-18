package sorting;

public class SelectionSort extends TheDadofSortings {

	@Override
	public void sort(int[] vet) {
		
		for(int i = 0; i < vet.length-1; i++) {
			int min = i;
			for(int j = i+1; j < vet.length; j++)
				if(vet[j] < vet[min])
					min = j;
			if(min != i)
				swap(vet, i, min);
		}
		
	}
	

}
