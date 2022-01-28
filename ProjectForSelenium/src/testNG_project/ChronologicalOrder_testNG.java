package testNG_project;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChronologicalOrder_testNG {

	@BeforeSuite
	public void Before_Suite() {
		System.out.println("Excecution BeforeSuite");
	}

	@AfterSuite
	public void After_Suite() {
		System.out.println("Excecution AfterSuite");
	}

	@BeforeTest
	public void Before_Test() {
		System.out.println("Excecution Before_Test");
	}

	@AfterTest
	public void After_Test() {
		System.out.println("Excecution After_Test");
	}

	@BeforeClass
	public void Before_Class() {
		System.out.println("Excecution BeforeClass");
	}

	@AfterClass
	public void After_Class() {
		System.out.println("Excecution AfterClass");
	}

	@Test
	public void Test_NG1() {
		System.out.println("Excecution Test");
	}

}
