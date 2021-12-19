package br.com.avaliacaoSiagri.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navegador {
    private static WebDriver driver;

    private Navegador() {
    }

    public static WebDriver getInstance() {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", "src/test/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.siagri.com.br");
        }
        return driver;
    }

    public static void fechar() {
        driver.quit();
        driver = null;
    }

    public static void atualizarPagina() {
        driver.navigate().refresh();
    }
}
