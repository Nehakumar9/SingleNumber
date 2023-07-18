package singlenumber;

import java.util.Scanner;

public class SingleNumber {
	public static int singleNumber(int[] arr)
	{
		int result =0;
		for(int i=0;i<arr.length;i++)
		{
			result = result^arr[i];
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int[] arr = new int[number];
		for(int i=0;i<number;i++)
		{
			arr[i] = scanner.nextInt();
		}
		int print = singleNumber(arr);
		System.out.println(print);
	}

}
