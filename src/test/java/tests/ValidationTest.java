package tests;

import static org.junit.Assert.*;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ValidationTest {
    @Test
    public void ct01ValidarSegmentos(){
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().window().setSize(new Dimension(1600, 900));
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        navegador.get("https://www.siagri.com.br");

        navegador.findElement(By.linkText("Soluções")).click();
        navegador.findElement(By.linkText("Segmentos")).click();

        String a1 = navegador.findElement(By.className("seg-3")).getText();
        assertEquals("Distribuidor de insumos", a1);

        String a2 = navegador.findElement(By.className("seg-4")).getText();
        assertEquals("Loja agropecuária", a2);

        String a3 = navegador.findElement(By.className("seg-5")).getText();
        assertEquals("Armazéns gerais", a3);

        String a4 = navegador.findElement(By.className("seg-6")).getText();
        assertEquals("Produtor agrícola", a4);

        String a5 = navegador.findElement(By.className("seg-7")).getText();
        assertEquals("Sementeira", a5);

        String a6 = navegador.findElement(By.className("seg-8")).getText();
        assertEquals("Outros", a6);

        //Encerrar o navegador que foi aberto.
        navegador.quit();
    }
}
