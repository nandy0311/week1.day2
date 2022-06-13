package week1.day2;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
		int sum, n;
		n= arr.length;
		System.out.println("arr length is " + n);
		sum= (n+1)*(n+2)/2;
		System.out.println( "array sum should be " + sum);
		for( int i= 0; i< n; i++) {
			
			// sum should be  36 , but array sum is only 31, hence 36- 31= 5
			sum -= arr[i];
			System.out.println(sum);
			
		}
		System.out.println("hence duplicate is " + sum);
		
	}

}
