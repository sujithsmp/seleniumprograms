package TestNg;

import org.testng.annotations.Test;

public class Priority {
  @Test
  public void testCase1() 
  {
	  System.out.println("Testcase 1");
  }
  @Test(priority = 4)
  public void testCase2() 
  {
	  System.out.println("Testcase 2");
  }
  @Test(priority = 5)
  public void testCase3() 
  {
	  System.out.println("Testcase 3");
  }
  @Test(priority = 3)
  public void testCase4() 
  {
	  System.out.println("Testcase 4");
  }
  @Test(priority = 2)
  public void testCase5() 
  {
	  System.out.println("Testcase 5");
  }
}
