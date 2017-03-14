package sortingAlgos;

public class SortingAlgo {
	
	public void BubbleSort(int[] a){
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a.length; j++){
				if(a[i] > a[j])
					swap(a[i], a[j]);
			}
		}
	}
	
	private void swap(int a, int b){
		int temp = a;
		a = b;
		b = a;
	}
	
	
	public void QuickSort(int[] a){
		
	}

}
