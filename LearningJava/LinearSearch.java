package LearningJava;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		
		int p,n,search,array[];
		
		Scanner in= new Scanner(System.in);
		
		System.out.println("Enter Number of Elements: ");
		
		n=in.nextInt();
		
		array = new int[n];
		
		System.out.println("Enter " + n + " Integers");
		
		for(p=0;p<n;p++)
			array[p]=in.nextInt();
		
		System.out.println("Enter Value to find");

		search= in.nextInt();
		
		for(p=0;p<n;p++)
		{
			
			if(array[p]==search)
			{
				System.out.println(search + " is present at location " + (p+1) + "." );
				break;
				
			}
		}
		
		if(p==n) 
		{
			System.out.println(search + " isn't present in array.");
		}	
	}
}
