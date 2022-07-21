package day1;
import java.io.*;
import java.util.*;
import java.lang.*;

import java.util.Scanner;

public class helloWorld {
	
	public void Lura() {
		System.out.println("Enter the String:");
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		StringBuilder input1 = new StringBuilder();
		input1.append(input);
		input1.reverse();
		System.out.println(input1);
		
		
		/*int c;
		int  A1[] = {1,7,0,5,6,-8,9};
		System.out.println("Enter the Array IS");
		for(int i=0;i<A1.length;i++)
		{
			for(int j=i;j<A1.length;j++)
			{
				if(A1[i]>A1[j])
				{
				c=A1[i];
				A1[i]=A1[j];
				A1[j]=c;
				}
				
			}
		}
		for(int a:A1) {
			System.out.println("Ascending order is:"+a);
			
		}
		for(int i=0;i<A1.length;i++)
		{
			for(int j=i;j<A1.length;j++)
			{
				if(A1[i]<A1[j])
				{
				c=A1[i];
				A1[i]=A1[j];
				A1[j]=c;
				}
				
			}
		}
		for(int a:A1) {
			System.out.println("Descending order is:"+a);
			
		}
		for(int i=0;i<A1.length;i++)
		{
			System.out.println("Enter the Array IS"+A1[i]);
		}*/
		/* Scanner s = new Scanner(System.in);
		System.out.println("Enter the First Number");
	    int	a = s.nextInt();
	    */
	    /*System.out.println("Enter the Second Number");
	    int	b = s.nextInt();
	    */
	    //c = first+second;
	    	
	    /*if(a%11==0)
	    {
	    	System.out.println("Number is Prime :"+a);
	    	
	    }
	    else
    	{
    		System.out.println("number is Not Prime :"+a);
    		
    		*/
		/*for(int A2=0;A1[]>0;A1[]++)
		{
			
		System.out.println("number is Not Prime :"+a);
    	} */
	    
	}
	    
	    /*c = first;
		first = second;
		second = c;
		System.out.println("the Value of After a is:"+first);
		System.out.println("the Value of After b is:"+second);
		*/
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lura");
		helloWorld h = new helloWorld();
		h.Lura();
	
	}

}
