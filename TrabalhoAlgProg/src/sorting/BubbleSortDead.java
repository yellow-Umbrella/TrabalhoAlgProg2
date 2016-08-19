package sorting;

public class BubbleSortDead extends TheDadofSortings {

	@Override
	public void sort(int[] vet) {
		for(int i = 0; i < vet.length-1; i++)
			for(int j = 0; j < vet.length-1; j++)
				if(vet[j] > vet[j+1])
					swap(vet, j, j+1);
	}

}
