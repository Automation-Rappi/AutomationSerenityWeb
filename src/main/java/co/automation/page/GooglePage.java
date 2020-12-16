package co.automation.page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.Keys;

@DefaultUrl("http://www.google.com")
public class GooglePage extends PageObjectWeb {

  @FindBy(name = "q")
  WebElementFacade search;

  public void searchFor(String keywords) {
    search.sendKeys(keywords, Keys.ENTER);
  }
}
