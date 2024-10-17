package Executions;

import org.testng.annotations.Test;

import BasePakage.BaseClass;

public class Execute extends BaseClass {
  @Test
  public void Run() throws InterruptedException {
 
  Coding c=new Coding();
  c.log();
  c.Functional_Text();
  c.Login_Test();
  c.UI_Test();
  }
}
