package pageObject;

import base.Config;
import org.openqa.selenium.*;
import org.testng.Assert;

public class buy_object extends Config {

public void searchForShoe(String keyword, CharSequence ENTER) {
   WebElement sh = driver.findElement(By.xpath("//*[@id=\'globalSearchInputField\']"));
   sh.sendKeys(keyword);
   sh.sendKeys(ENTER);
}

public void selectShoe() {
    driver.findElement(By.partialLinkText("Men's Andrew Plain Toe Derbys, Created for Macy's")).click();
}

public void shoeColour() {
    driver.findElement(By.xpath("//img[@alt='Black']")).click();

    }

public void shoeSize(){
    driver.findElement(By.xpath("//div[2]/div/ul/li[7]")).click();
}
public void zipCode(){
    WebElement zip = driver.findElement(By.linkText("11408"));
    zip.click();
    WebElement code = driver.findElement(By.id("sddZipCode"));
    code.clear();
    code.sendKeys("11417");
    WebElement button = driver.findElement(By.xpath("//form[@id='sdd-form']/div[2]/button"));
    button.click();

}
public void addCart(){
    driver.findElement(By.xpath("//button[@id='bag-add-2907838']")).click();
}
public void goToCart(){
    driver.findElement(By.xpath("//span[@id='bag-icon-counter']")).click();

    String exp = "ALFANI";
    String act = driver.getTitle();
    Assert.assertEquals(act, exp);

}

}
