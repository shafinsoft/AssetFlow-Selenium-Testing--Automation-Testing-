
package com.assetflow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssetEditTest {

    @Test
    public void assetEditTest() throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        try {

            driver.get("http://localhost/AssetFlow/login.php");

            Thread.sleep(3000);

            driver.findElement(By.id("email"))
                  .sendKeys("admin@assetflow.com");

            driver.findElement(By.id("password"))
                  .sendKeys("Admin@123");

            driver.findElement(By.id("loginBtn")).click();

            Thread.sleep(5000);

            driver.get("http://localhost/AssetFlow/assets.php");

            Thread.sleep(3000);

            driver.findElement(By.cssSelector("a[href*='edit=']"))
                  .click();

            Thread.sleep(3000);

            driver.findElement(By.id("asset_name"))
                  .clear();

            driver.findElement(By.id("asset_name"))
                  .sendKeys("Updated Selenium Asset");

            driver.findElement(By.id("saveAsset")).click();

            Thread.sleep(5000);

            String page = driver.findElement(By.tagName("body"))
                                .getText();

            Assert.assertTrue(
                page.contains("Asset updated successfully")
            );

            System.out.println("Asset Updated Successfully");

        } finally {

            driver.quit();

        }
    }
}
