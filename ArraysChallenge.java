import java.util.Scanner;

public class ArraysChallenge {
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		int[] arr = getIntegers(5);
		int[] sorted = sortIntegers(arr);
		printArray(sorted);
		

	}

	private static int[] getIntegers(int capacity) {
		int[] hold = new int[capacity];
		System.out.println("Please, enter " + capacity+" integers.");
		for(int i =0; i<hold.length; i++){
			hold[i]=scan.nextInt();
		}
		return hold;
	}
	
	//accept and array and print out content
	
	public static void printArray(int[] arr){
		for(int i =0; i<arr.length; i++){
			System.out.println("Element "+i + " contents"+arr[i]);
		}
	
	}
	
	public static int[] sortIntegers(int[] arr){
		int[] sortedArray = new int[arr.length];
		for(int i =0; i <arr.length; i++){
			sortedArray[i]=arr[i];
		}
		boolean flag = true;
		int temp;
		while(flag){
			flag = false;
			for(int i = 0; i<sortedArray.length-1; i++){
				temp= sortedArray[i];
				sortedArray[i] = sortedArray[i+1];
				sortedArray[i+1] = temp;
				flag =true;
			}
		}
		return sortedArray;
	}
	

}
