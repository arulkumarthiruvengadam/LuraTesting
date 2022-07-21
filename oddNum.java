package day1;
import java.io.*;
import java.util.*;
import java.util.Scanner;

public class oddNum {
	
public void Lura1() {
		int array1[] = {1,2,3,4,5,6,7,-4,-6,-5,-8};
		
		for(int i=0;i<array1.length;i++)
		{
		 if(array1[i]%2==0)
		 {
		  System.out.println("ArrayEven :"+array1[i]+""); 
		 }
		}
		for(int i=0;i<array1.length;i++)
		{
		 if(array1[i]%2!=0)
		 {
		  System.out.println("ArrayOdd:"+array1[i]+""); 
		 }
		}
		for(int i=0;i<array1.length;i++)
		{
		 if(array1[i]>0)
		 {
		  System.out.println("ArrayPositive:"+array1[i]+""); 
		 }
		}
		for(int i=0;i<array1.length;i++)
		{
		 if(array1[i]<0)
		 {
		  System.out.println("ArrayNegative:"+array1[i]+""); 
		 }
		}
		
		char ch = 'l';
		switch(ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		System.out.println(ch+"I s Vowel");
		break;
		default:
			System.out.println(ch+" Is Not Vowel");
		}
		int count = 0;
		System.out.println("Enter a Vowel String");
		Scanner cs = new Scanner(System.in);
		String str1 = cs.nextLine();
		for(int i=0;i<str1.length();i++)
		{
		char cs1= str1.charAt(i);
		if(cs1 == 'a'|| cs1 == 'e' || cs1 == 'i' || cs1 == 'o' || cs1 == 'u')	
		{
			count++;
		}
			}
		System.out.println("Given Character is Vowel:"+count);
		
			
		}
	
	
	

public static void main(String[] args) {
	// TODO Auto-generated method stub
	System.out.println("lura");
	oddNum h = new oddNum();
	h.Lura1();

}

}
