package ddt;

import org.testng.annotations.Test;

public class ContactTest {

	@Test
	public void createContactTest() 
	{
		System.out.println("The contact is created.");
	}
	
	@Test
	public void updateContactTest() 
	{
		System.out.println("The contact is updated.");
	}
	
	@Test
	public void deleteContactTest() 
	{
		System.out.println("The contact is deleted.");
	}
}
