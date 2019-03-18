package qaclickacademy;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumTest 
{
	@Test
	public void selenuimTest1()
	{
		System.out.println("selenium test1");
		System.out.println("selenium test2");
	}
	@Test
	public void selenuimTest2()
	{
		System.out.println("selenium test2");

	}
	@BeforeTest
	public void selenuimTest3()
	{
		System.out.println("selenium test3");
		System.out.println("selenium test31");
	}
}
