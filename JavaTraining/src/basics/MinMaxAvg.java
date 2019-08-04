package basics;

public class MinMaxAvg {

	public static void main(String[] args) {
		
		int[] numbers = {11,2,31,43,5,6};
	//	int i = numbers.length;
		//System.out.println(i);
		System.out.println(min(numbers));
		System.out.println(max(numbers));
		System.out.println(avg(numbers));
		
	}
	
	public static int min(int[] n) {
		int minimumNum = n[0];
		int i = n.length;
		
		for(int j=0;j<i;j++) {
			if(minimumNum<n[j]) {
				minimumNum = minimumNum;
			}
			else {
				minimumNum = n[j];
			}
			
		}
		
		return  minimumNum;
	}
	
	public static int max(int[] n) {
		int maxNumber = n[0];
		int i = n.length;
		
		for(int j=0; j<i;j++) {
			if(maxNumber > n[j]) {
				maxNumber = maxNumber;
			}
			else {
				maxNumber = n[j];
			}
		}
		
		return maxNumber;
	}
	
	public static int avg(int[] n) {
		int sum = 0;
		int result;
		//int averageNumber;
		int i = n.length;
		System.out.println("testing "+i);
		
		  while(i-1 >= 0) 
		  { 
			 // System.out.println("testing2 "+i);
			  sum = sum + n[i-1]; 
			//  System.out.println("testing3 "+n[i-1]);
		  i--; 
		  }
		  i = n.length;
		 result = sum/i;
		 
		
		return (result);
	}
}
