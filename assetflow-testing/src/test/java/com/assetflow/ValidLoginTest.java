
package com.assetflow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidLoginTest {

    @Test
    public void validLoginTest() throws InterruptedException {

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

            Assert.assertTrue(
                driver.getCurrentUrl().contains("dashboard.php")
            );

            System.out.println("Valid Login Successful");

        } finally {
            driver.quit();
        }
    }
}
