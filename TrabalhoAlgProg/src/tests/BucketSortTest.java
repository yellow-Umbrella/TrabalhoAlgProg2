package tests;

public class BucketSortTest {

	public boolean[] sort(int[] vet) {
		int max = 0;
		for(int x: vet)
			if(x > max)
				max = x;
		boolean[] bucket = new boolean[max+1];
		
		for(int x: vet)
			bucket[x] = true;
		
		return bucket;
	}
	
	public boolean[] sort(int[] vet, int max) {
		boolean[] bucket = new boolean[max+1];
		
		for(int x: vet)
			bucket[x] = true;
		
		return bucket;
	}
	
	public static void main(String[] args) {
		
		int[] vet = {64, 3, 22, 67, 1, 89};
		boolean[] ret = new BucketSortTest().sort(vet);
		
		for(int i = 0; i < ret.length; i++)
			if(ret[i])
				System.out.printf("%d ", i);
		System.out.println();
		
		int[] vet2 = {64, 3, 22, 67, 1, 89};
		boolean[] ret2 = new BucketSortTest().sort(vet2);
		
		for(int i = 0; i < ret.length; i++)
			if(ret[i])
				System.out.printf("%d ", i);
		
	}

}
