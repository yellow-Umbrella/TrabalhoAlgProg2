package sorting;

//To-Do optimization

public class InserctionSortOptimized extends TheDadofSortings {
	
	@Override
	public void sort(int[] vet) {
		int j;
		for(int i = 1; i < vet.length; i++) {
			j = i;
			while(j > 0 && vet[j-1] > vet[j]) {
				swap(vet, j, j-1);
				j = j-1;
			}
			
		}
		
	}

}
