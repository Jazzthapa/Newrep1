package grading;
import java.util.Scanner;


public class grade {
		public static void  main(String[]arg)
	{int num;
	Scanner s=new Scanner(System.in);
	
	System.out.println("enter no");
	num=s.nextInt();
	if(num>80)
		System.out.println("Grade A");
	else if(num>=60 && num<=80)
	{System.out.println("Grade B");
	
	}
	else if(num>=50 && num<=60)
	{
		System.out.println("Grade C");
	}
	else if(num>=45 && num<50)
	{System.out.println("Grade D");
	}
	else if(num>=25 && num<45)
	{
		System.out.println("Grade E");
		
	} else 
		
		System.out.println("F");
	
	};
		
	}



