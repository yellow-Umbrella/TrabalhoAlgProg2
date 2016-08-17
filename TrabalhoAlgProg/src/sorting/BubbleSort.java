package sorting;
import sorting.DadSort;

/* 	 Ordenação “por bolha”
   	 É considerado um dos algoritmos mais simples para ordenação
   	 Em geral, se pensarmos em ordenar uma sequência é uma das primeiras ideias que temos
   	 A ideia é percorrer o vetor diversas vezes, a cada passagem fazendo o maior elemento “flutuar" para o final da sequência
   	 MUITO RUIM! 
   
   	 Estável
   
   	 Tempo:
   		 Pior caso: O(n2)
   		 Caso médio: O(n2)
		 Melhor caso: O(n) [Já otimizado para verificar se não ocorreu nenhuma troca]
		
	 Espaço:
		 Pior caso: O(n) total, O(1) auxiliar */

public class BubbleSort extends DadSort {

	@Override
	public void sort(int[] vet) {
		
		for (int i = 0; i < vet.length; i++) {
			for (int j = 0 ; j < vet.length; j++) {
				if (vet[j] > vet[j+1])
					swap(vet, j, (j + 1));
			}
		}

	}

}
