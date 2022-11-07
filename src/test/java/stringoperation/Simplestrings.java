package stringoperation;

public class Simplestrings {
	public static void main(String[] args) {
		String str ="GIRISH  Shivanand  Math";
		System.out.println(str);
		String [] name=str.split("  ");
		String fname=name[0];
		String mname=name[1];
		String lname=name[2];
		System.out.println(fname);
		System.out.println(mname);
		System.out.println(lname);
		
			}

}
