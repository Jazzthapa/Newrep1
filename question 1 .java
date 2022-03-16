package mar;

import java.util.Scanner;

public  class marks {
	float marks ;
	Scanner s;
	void result() {
		System.out.println("Enter marks");
		marks=s.nextFloat();
		String res=marks>40?"pass" : "fail";
		System.out.println(res);
	}
	
	public static void main(String[] args) {
		marks m=new marks();
		m.result();
		
	}

	}


