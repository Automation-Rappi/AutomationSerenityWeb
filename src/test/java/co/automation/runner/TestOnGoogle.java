package co.automation.runner;

import co.automation.page.GooglePage;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class TestOnGoogle {

  @Managed(driver = "chrome")
  WebDriver driver;

  @Test
  public void shouldInstantiatedPageObjectsForAWebTest() {
    GooglePage googlePage = new GooglePage();
    googlePage.open();
    googlePage.searchFor("firefly");
    // assertThat(googlePage.getTitle()).isEqualTo("firefly - Google Search");
  }
}
