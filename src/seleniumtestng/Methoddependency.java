package seleniumtestng;

import org.testng.annotations.Test;

public class Methoddependency {
  @Test
  public void InvokeBrowser() {
  }
  @Test(dependsOnMethods={"InvokeBrowser"})
  public void f1(){
	  
  }
}
