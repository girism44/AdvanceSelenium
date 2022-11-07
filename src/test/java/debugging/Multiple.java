package debugging;

public class Multiple {

	public static void main(String[] args) {
		System.out.println("main method");
		int a=10;
		int b=20;
		int result=multiple(10,20);
		System.out.println(result);

	}
	public static int multiple(int a,int b)
	{
		System.out.println("enter into add method");
		return a*b;
		
	}


	}


