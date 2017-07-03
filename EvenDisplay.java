/*
 * This assignment helps in mastering the concepts to declare and initialize an array.
 */
package assignment_6a; // This java file is inside this package inside src folder
//Main Class
//to understand the working of an Array

import java.util.Scanner;

public class EvenDisplay {

	public static void main(String[] args) //Main Function
	    {
	        int n;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter no. of elements you want in array:");
	        //Reading the digits into Array
	        n = s.nextInt();
	        int a[] = new int[n];
	        System.out.println("Enter all the elements:");
	        //Reading the input and saving it into the array
	        for (int i = 0; i < n; i++) 
	        {
	            a[i] = s.nextInt();
	        }
	        //Displaying the Even Number
	        System.out.print("Even numbers:");
	        for(int i = 0 ; i < n ; i++)
	        {
	        	//Logic to find the given number is Even
	            if(a[i] % 2 == 0)
	            {
	                System.out.print(a[i]+" ");
	            }
	        }
	    }
}
