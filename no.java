package evenorodd;
import java.util.*;

public class no {
	public static void main(String[]arg)
	{
	int num;
	Scanner s=new Scanner(System.in);

	System.out.println("enter no");
	num=s.nextInt();
	if(num%2==0)
		System.out.println("even");
	else 
		System.out.println("odd");
	}
}
