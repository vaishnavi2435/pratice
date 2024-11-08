package com.TestnNG.POM.Pagefactory;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testpage_using_pageFactor extends  Basetest
{
  @Test(priority=1)
  public void Validateurl()
  {
	 String url= lp.geturl();
	 Assert.assertTrue(url.contains("orangehrmlive"),"url is not match");
	 System.out.println("**********url is not match*********************************");
  }
  
  @Test(priority=2)
  public void Validatetittle()
  {
	  String tittle=lp.getTittle();
	  Assert.assertTrue(tittle.contains("HRM"),"tittle is not matching");
	  System.out.println("************tittle is matched************************");
  }
  
  @Test(priority=3)
  public void Validatelogin()
  {
	  lp.doLogin("Admin", "admin123");
	  System.out.println("***************login is complete***********************");
  }
}
