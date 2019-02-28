package Sort;

public class RealBUbbleSort {
	public static void main(String[] args) {
		int[] array=new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i]=(int)(Math.random()*1000);
		}
		System.out.print("bubbleSorted numbers: ");
		for(int array1:bubbleSort(array)){
			System.out.print(array1+" ");
		}
	}
	public static int[] bubbleSort(int[] array) {
		for(int i=0;i<array.length-1;i++){
			for (int j = 0; j < array.length-1-i; j++) {
				if(array[j]>array[j+1]){
					int tempMax=array[j];
					array[j]=array[j+1];
					array[j+1]=tempMax;
				}
			}
		}
		return array;
	}

}
