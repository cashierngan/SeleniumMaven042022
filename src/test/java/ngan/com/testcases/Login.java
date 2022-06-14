package ngan.com.testcases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello Ngăn");

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://hrm.anhtester.com/");
        Thread.sleep(2000);

        driver.findElement(By.id("iusername")).sendKeys("admin01");
        Thread.sleep(2000);

        driver.findElement(By.name("password")).sendKeys("123456");
        Thread.sleep(2000);

        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form/button")).click();
        Thread.sleep(2000);

        driver.close();
        driver.quit();

/*
        //1 - Maximize browser của mình
        driver.manage().window().maximize();

        //2 - Đi đến 1 url

        driver.navigate().to("https://anhtester.com");
        Thread.sleep(200);

        //3 - Lấy Title và in ra console

        System.out.println(driver.getTitle());

        // Thoát hẳn Browser

        driver.quit(); */
    }
}
