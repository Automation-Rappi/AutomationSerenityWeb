package co.automation.runner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.openqa.selenium.support.ui.ExpectedConditions.titleContains;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

@RunWith(SerenityRunner.class)
public class WhenSearchingOnGoogle {

  @Managed WebDriver driver;

  @Test
  public void shouldInstantiateAWebDriverInstanceForAWebTest() {
    driver.get("http://www.google.com");

    driver.findElement(By.name("q")).sendKeys("firefly", Keys.ENTER);

    new WebDriverWait(driver, 5).until(titleContains("Google Search"));

    assertThat("", driver.getTitle(), is("firefly - Google Search"));
  }
}
