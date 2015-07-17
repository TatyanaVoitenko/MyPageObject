package ru.st.selenium.pages;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FilmAddPage extends InternalPage {
	public FilmAddPage (PageManager pages) {
		super(pages);
}
	
	
	@FindBy (id ="submit")
	 private WebElement submitButton;
	
	@FindBy (name ="name")
	 private WebElement titleFiled;
	
	@FindBy (name ="aka")
	 private WebElement imdbFiled;
	
	@FindBy (name ="year")
	 private WebElement yearFiled;
	
	@FindBy (name ="notes")
	 private WebElement notesFiled;
	
	 public FilmAddPage setTitleField(String text) {
		 titleFiled.sendKeys(text);
		    return this;
		  }
	 public FilmAddPage setImdbFiledField(String text) {
		 imdbFiled.sendKeys(text);
		    return this;
		  }
	 public FilmAddPage setYearFiledField(String text) {
		 yearFiled.sendKeys(text);
		    return this;
		  }
	 public FilmAddPage setNotesField(String text) {
		 notesFiled.sendKeys(text);
		    return this;
		  }
	
	 public FilmViewPage clickSubmitButton() {
			submitButton.click();
			return pages.filmViewPage;
		}
	 
//	 public FilmViewPage ensurePageLoaded() {
//		    super.ensurePageLoaded();
//		 //  wait.until(presenceOfElementLocated(By.id("movie")));
//		    
//		    return pages.filmViewPage;
//		  }
}