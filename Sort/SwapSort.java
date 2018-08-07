package Sort;

public class SwapSort {
	public static void main(String[] args) {
		int[] array=new int[9];
		for (int i = 0; i < array.length; i++) {
			array[i]=(int)(Math.random()*1000);
		}
		int[] sortedArray=bubbleSort(array);
		System.out.print("sorted number:");
		for (int i = 0; i < sortedArray.length; i++) {
			System.out.print(sortedArray[i]+" ");
		}
		System.out.println();
		for(int a:bubbleSort(array)){
			System.out.print(a+" ");
		}
	}
	
	public static int[] bubbleSort(int[] array){
		for (int i = 0; i < array.length-1; i++) {
			int currentMin=array[i];
			int currentIndex=i;
			for (int j = i+1; j < array.length; j++) {
				if(currentMin>array[j]){
					currentMin=array[j];
					currentIndex=j;
				}
			}
			if(currentIndex!=i){
				array[currentIndex]=array[i];
				array[i]=currentMin;
			}
		}
		return array;
	}
}
