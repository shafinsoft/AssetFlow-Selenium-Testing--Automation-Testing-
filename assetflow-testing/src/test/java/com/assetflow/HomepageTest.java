
package com.assetflow;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomepageTest {

    @Test
    public void homepageLoadTest() throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        try {
            driver.get("http://localhost/AssetFlow/index.php");

            Thread.sleep(5000);

            Assert.assertTrue(driver.getTitle().length() > 0);

            System.out.println("Homepage Loaded Successfully");

        } finally {
            driver.quit();
        }
    }
}
