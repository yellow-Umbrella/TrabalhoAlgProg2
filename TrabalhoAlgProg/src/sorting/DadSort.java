package sorting;
public abstract class DadSort implements doSort {

	@Override
	public void swap(int[] vet, int i, int j) {
		// TODO Auto-generated method stub

	}

	@Override
	public void print(int[] vet) {
		for (int i = 0; i < vet.length; i++) {
			System.out.printf("%d", vet[i]);
			if (i != vet.length-1)
				System.out.println();
			else
				System.out.printf(" ");
		}
	}

}
