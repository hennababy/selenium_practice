package seleniumtestng;

import org.testng.annotations.*;

public class Priority {
  @Test(enabled=false)
  public void f1() {
  }
  @Test(priority=4)
  public void f2() {
  }
  @Test(priority=1)
  public void f3() {
  }
  @Test(priority=3)
  public void f4() {
  }
}
