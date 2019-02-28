package Sort;

public class InsertionSort {
	public static void main(String[] args) {
		int[] array=new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i]=(int)(Math.random()*10000);
		}		
		System.out.print("insertionsorted numbers:");
		for(int array1:insertionSort(array)){
			System.out.print(array1+" ");
		}
	}
	public static int[] insertionSort(int[] array) {
		for(int i=1;i<array.length;i++){
			int currentValue=array[i];
			int j;
			for(j=i-1;j>=0 && currentValue<array[j];j--){
				array[j+1]=array[j];
			}
			array[j+1]=currentValue;
		}
		return array;
	}

}
