package ru.st.selenium;

import static org.junit.Assert.assertTrue;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ru.st.selenium.model.Film;
import ru.st.selenium.pages.FilmViewPage;
import ru.st.selenium.pages.TestBase;

public class AddNewFilmTest extends TestBase {
	 @BeforeMethod
	  public void mayBeLogout() {
	    if (app.getUserHelper().isNotLoggedIn()) {
	      return;
	    }
	    app.getUserHelper().logout();
	  }
	 @Test
	 public void addNewFilmOK()
	 {
		 String filmname = "film" + System.currentTimeMillis();
		 String createdFilmName = filmname + "("+2013+ ")";
		 
		 Film film = new Film ().setTitle(filmname)
				 .setImdb("imdb")
				 .setYear("2013")
				 .setNotes("Test Notes");

    	 app.getUserHelper().loginAs(ADMIN);
         app.getFilmHelper().create(film);
         
        assertEquals(createdFilmName, app.getFilmHelper(). ///I want to get film title from FilmView Page
        
		 }

}
