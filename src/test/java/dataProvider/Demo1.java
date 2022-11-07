package dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo1 {
	@Test(dataProvider="dataForTicketBooking")
	public void bookTicketTest(String source,String destination)
	{
		System.out.println("book tickets from:"+source+"TO:"+destination);
	}
	@DataProvider
	public Object[][] dataForTicketBooking()
	{
		
		Object [][] obj = new Object[5][2];
		obj[0][0]="Bangalore";
		obj[0][1]="Mysore";
		
		obj[1][0]="Mumbai";
		obj[1][1]="Delhi";
		
		obj[2][0]="Goa";
		obj[2][1]="Pune";
		
		return obj;
		
		
		
		
		
		
		
		
		
	}

}
