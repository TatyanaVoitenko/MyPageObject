package ru.st.selenium;

import org.testng.annotations.BeforeMethod;

import ru.st.selenium.pages.TestBase;

public class FindFilmTest extends TestBase {
	 @BeforeMethod
	  public void mayBeLogout() {
	    if (app.getUserHelper().isNotLoggedIn()) {
	      return;
	    }
	    app.getUserHelper().logout();
	  }
}
