package day1;

import java.util.Scanner;

public class findVowel {
	public void Lura()
	{
		String str = null;
		Scanner Sc =new Scanner(System.in);
		System.out.println("Enter a String:");
		String str1 = Sc.nextLine();
		str = str1.toLowerCase();
		System.out.println("Vowels in the Given String:");
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a'|| str.charAt(i)=='e'|| str.charAt(i)=='i'|| str.charAt(i)=='o'|| str.charAt(i)=='u')
			{
				
			System.out.print(" "+str.charAt(i));
			}
		}
	}
		public void factFind()
		{
		int num =10;
		int factorial = 1;
		for(int i=1;i<=num;++i)
		{
	    factorial = factorial*i;
		}
		System.out.println("Factorial Number is"+factorial);
		}
		public void diffFact()
		{
		int i=1,num1=10;
		long factorial1=1;
		while(i <= num1)
		{
			factorial1 *= i;
			i++;
		}
		System.out.println("factorial of"+num1+" "+factorial1);
		}

public static void main(String[] args) {
	// TODO Auto-generated method stub
	System.out.println("lura");
	findVowel h = new findVowel();
	h.Lura();
	h.factFind();
	h.diffFact();
}

}