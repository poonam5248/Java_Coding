
//package LearningJava;

/*import java.util.Scanner;
public class Array_Sum {

	public static void main(String[] args) {
		int n, sum=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number of Elements in an Array: ");
		//n[i]=scanner.nextInt();
		int[] array = new int[n];
		System.out.print("Enter the Elemnets of array: ");
		for(int i=0;i<n;i++)
		{
			array[i]= scanner.nextInt();
			
		}
		for(int num: array) {
			sum=sum+num;
			
		}
		System.out.println("Sum of array elements is: " +sum);		
	}
}*/


import java.util.Scanner;
public class Array_Sum{
   public static void main(String args[]){
	   int n;
      Scanner scanner = new Scanner(System.in);
      int[] array = new int[n];
      int sum = 0;
      System.out.println("Enter the elements:");
      for (int i=0; i<n; i++)
      {
    	  array[i] = scanner.nextInt();
      }
      for( int num : array) {
          sum = sum+num;
      }
      System.out.println("Sum of array elements is:" +sum);
   }
}