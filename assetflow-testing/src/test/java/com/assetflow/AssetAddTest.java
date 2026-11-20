
package com.assetflow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssetAddTest {

    @Test
    public void assetAddTest() throws InterruptedException {

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

            Assert.assertTrue(
                driver.findElement(By.tagName("h1"))
                      .getText().contains("Asset Management")
            );

            driver.findElement(By.id("addAssetBtn")).click();

            Thread.sleep(2000);

            driver.findElement(By.id("asset_name"))
                  .sendKeys("Iphone");

            driver.findElement(By.id("asset_type"))
                  .sendKeys("Electronics");

            driver.findElement(By.id("price"))
                  .sendKeys("50000");

            driver.findElement(By.id("description"))
                  .sendKeys("Asset added by Shafin");

            driver.findElement(By.id("saveAsset")).click();

            Thread.sleep(5000);

            String page = driver.findElement(By.tagName("body"))
                                .getText();

            Assert.assertTrue(
                page.contains("Iphone")
            );

            System.out.println("Asset Added Successfully");

        } finally {

            driver.quit();

        }
    }
}
