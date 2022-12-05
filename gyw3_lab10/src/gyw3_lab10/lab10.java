package gyw3_lab10;

public class lab10 {
	public static void main(String[] args) {
		System.out.println(sumOfDigits((-123456)));
		int a[] = {0,1,2,3,4,5};
		printArrayElements(a,0);
		printCombos(a,"",0,2);
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
		
		
	}

	
	



}


