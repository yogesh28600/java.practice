package arrays.ieee;
import java.util.*;

public class Program {

	public static void main(String[] args)  {

		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int m=scan.nextInt();
		int p=scan.nextInt();
		
		Rules[] rule=new Rules[m];
		for(int i=0;i<=m-1;i++) {
			rule[i]=new Rules(scan.nextInt(),scan.nextInt(),scan.nextInt());
		}
	}

}
