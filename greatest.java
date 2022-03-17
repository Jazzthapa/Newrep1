package greatest ;
import java.util.*;


public class greatest {
	
	int n1,n2;
	int n3;
	
	
	
	int res;
	int large;
	void input()

	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter numbers");
		n1=s.nextInt();
		n2=s.nextInt();
		n3=s.nextInt();
		n2=large;
		if(n1>n2)
			res=n1;
	
		else 
		{
			res=n2;
		}
		if(n3>n2)
			res=n3;
		else
			res=n2;
		System.out.println("greatest no is ");
	
	}
  void show()
  {
	  System.out.println(res);
	  
		
	}
	
	
	public static void main(String[]arg)
	{
		greatest g=new greatest();
		g.input();
		g.show();
	}

}
