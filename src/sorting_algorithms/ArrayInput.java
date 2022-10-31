package sorting_algorithms;

import java.util.Scanner;

public class ArrayInput {
	public int[] input()
	{
		Scanner scan=null;
		try {
			scan=new Scanner(System.in);
			System.out.println("Length of Array");
			int n=scan.nextInt();
			int[] arr =new int[n];
			for(int i=0;i<=n-1;i++) {
				System.out.println(" Element of index "+ i);
				arr[i]=scan.nextInt();
			}
			return arr;
			
		}
		finally {
			scan.close();
		}

	}

}
