package debugging;

public class Add {

	public static void main(String[] args) {
		System.out.println("main method");
		int a=10;
		int b=20;
		int result=add(10,20);
		System.out.println(result);

	}
	public static int add(int a,int b)
	{
		System.out.println("enter into add method");
		return a+b;
		
	}

}
//https://testleaf.herokuapp.com/pages/Calendar.html url