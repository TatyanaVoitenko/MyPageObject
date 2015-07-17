package ru.st.selenium.applogic2;

import java.util.List;

import ru.st.selenium.applogic.FilmHelper;
import ru.st.selenium.model.Film;
import ru.st.selenium.model.User;
import ru.st.selenium.pages.FilmViewPage;
import ru.st.selenium.pages.UserProfilePage;

public class FilmHelper2 extends DriverBasedHelper implements FilmHelper {

  public FilmHelper2(ApplicationManager2 manager) {
    super(manager.getWebDriver());
  }

  @Override
  public void create(Film film) {
    pages.filmListPage.ensurePageLoaded()
.clickHomeProfilePage()
.clickAddButton()
.setTitleField(film.getTitle())
.setImdbFiledField(film.getImdb())
.setYearFiledField(film.getYear())
.setNotesField(film.getNotes())
.clickSubmitButton();
 }

  //@Override
  public String getFilmTitle() {
	 
	FilmViewPage filmPage = pages.filmViewPage.ensureFilmViewPageLoaded();
  	return filmViewPage.getTitle();
   	}
  
  
  @Override
  public void delete(Film film) {
    // TODO Auto-generated method stub

  }

  @Override
  public List<Film> search(String title) {
    // TODO Auto-generated method stub
    return null;
  }



}
