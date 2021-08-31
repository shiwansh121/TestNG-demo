package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class TestngdemoTest {
	
  @Test
  public void f() {
	  System.out.println("Review");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Review1");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Review2");
  }

}
