package gyw3_lab10;

import java.util.ArrayList;

public class lab10 {
	public static void main(String[] args) {
		//testing
		System.out.println(sumOfDigits((-123456)));
		int a[] = {0,1,2,3,4,5};
		printArrayElements(a,1);
		printCombos(a,"",0,3);
	}
	
	public static int sumOfDigits(int x) {
		if(x<0) {
			x = -1*x;
		}
		
		if(x == 0) {
			return 0;
		}else {
			return (x % 10 + sumOfDigits(x/10));
		}
	}
	
	public static void printArrayElements(int a[], int index) {
		System.out.println(a[index]);
		if(index < a.length -1) {
			printArrayElements(a,index+1);
		}
	}
	
	public static void printCombos(int[] a, String out, int startIndex, int k) {
		for(int i = 1; i <= a.length-k+1;i++) {
			for(int x = i+1; startIndex + x < a.length;x++) {
				System.out.println(out+"{"+a[startIndex]+" "+a[startIndex+i]+" "+a[startIndex+x]+"}");
			}
		}
		if(startIndex <= a.length - k) {
			printCombos(a,out,startIndex+1,k);
		}
	}

	
	



}


