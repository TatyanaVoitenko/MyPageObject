package ru.st.selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FilmListPage extends InternalPage {
	public FilmListPage(PageManager pages) {
		super(pages);
	}
	
	
	@FindBy (xpath = "//a[contains(@href,\"./?go=add\")]")
	 private WebElement addButton;
	

	
	 public FilmAddPage clickAddButton() {
		 addButton.click();
			return pages.filmAddPage;
		}	
	
	
}
