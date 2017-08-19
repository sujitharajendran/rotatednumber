package guviproject;
import java.util.*;
public class Rotatenumber {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int [n];
	int tp[]=new int[n];
	for(int i=0;i<n;i++){
		a[i]=sc.nextInt();
	
	}
	System.out.println("enter the k element");
	int k=sc.nextInt();
	for(int i=n-k-1;i<n;i++){
		tp[i]=a[i];
	System.out.println(tp[i]);
	}
	for(int i=0 ;i<n-k-1;i++){
		tp[i]=a[i];
		System.out.println(tp[i]);
	}

}
}