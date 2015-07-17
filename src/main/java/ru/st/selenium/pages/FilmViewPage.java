package ru.st.selenium.pages;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import ru.st.selenium.model.Film;

public class FilmViewPage extends InternalPage {
	public FilmViewPage (PageManager pages) {
		super(pages);
}

	@FindBy (css ="div h2")
	 private WebElement createdMovie;
	
	 public String getTitle() {
		 ensureFilmViewPageLoaded();
		return createdMovie.getText();
		}

	 public FilmViewPage ensureFilmViewPageLoaded() {
		     wait.until(presenceOfElementLocated(By.xpath("div[@id='movie']")));
		     return this;
		  }
}

