package practice.problems;

import java.util.*;

public class ReverseArray {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int k=scan.nextInt();
		ArrayList<Integer> arr=new ArrayList<>();
		ArrayList<Integer> arr1=new ArrayList<>();
		arr.add(22);
		arr.add(45);
		arr.add(5);
		arr.add(7);
		arr.add(90);
		
		arr1=reverse(arr,k);
		arr1.forEach(n->System.out.println(n));
		scan.close();
	}
	static ArrayList<Integer> reverse(ArrayList<Integer> arr, int k){
		
		ArrayList<Integer> arr1=new ArrayList<Integer>();
		arr1.addAll(arr);
        int i=0;
        while(i<k){
        	int m=k;
            arr.set(i, arr.get(m));
            m--;
            i++;
            
        }
		
		
		return arr;
	}

}
