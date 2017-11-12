package seleniumtestng;

import org.testng.annotations.*;

public class Day3 {
  @Test
  public void f1() {
	  System.out.println("This is f1");
  }
  @Test
  public void f2(){
	  System.out.println("This is f2");
  }
  @BeforeTest
  public void f3(){
	  System.out.println("Before Test");
  }
  @AfterTest
  public void f4(){
	  System.out.println("After Test");
  }
  @BeforeMethod
  public void f5(){
	  System.out.println("Before Method");
  }
  @AfterMethod
  public void f6(){
	  System.out.println("After Method");
  }
  @BeforeClass
  public void f7(){
	  System.out.println("Before Class");
  }
  @AfterClass
  public void f8(){
	  System.out.println("After Class");
  }
  @BeforeSuite
  public void f9(){
	  System.out.println("Before Suite");
  }
  @AfterSuite
  public void f10(){
	  System.out.println("After Suite");
  }
  
}
