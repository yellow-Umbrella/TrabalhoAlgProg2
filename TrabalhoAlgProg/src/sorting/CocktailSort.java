package sorting;

public class CocktailSort {

	public int[] doSort(int vet[]) {
		int i, aux;
		int n = vet.length;
		boolean saida = true;
		while (saida) {
			saida = false;
			i = 0; // n-1 pois vamos comparar 1 valor com os demais (n-1)
					// valores
			while (i < (n - 1)) {
				if (vet[i] > vet[i + 1]) { // Compara com o pr�ximo
					saida = true; // fez uma troca
					aux = vet[i];
					vet[i] = vet[i + 1];
					vet[i + 1] = aux;
				}
				i++;
			}
			if (!saida)
				break; // se n�o fez troca, encerra o c�digo
			saida = false;
			i = (n - 2);
			while (i >= 0) {
				if (vet[i] > vet[i + 1]) { //
					saida = true; //
					aux = vet[i];
					vet[i] = vet[i + 1];
					vet[i + 1] = aux;
				}
				i--;
			}
		}

		return vet;

	}
	
	
	
}