package br.com.avaliacaoSiagri.acceptance.tests;

import br.com.avaliacaoSiagri.utils.Navegador;
import br.com.avaliacaoSiagri.utils.Utils;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class SegmentoAcceptanceTest {
    private static WebDriver driver;

    @Before
    public void setup() {
        driver = Navegador.getInstance();
    }

    @Test
    public void ct01ValidarSegmentos(){
        driver.findElement(By.linkText("Soluções")).click();
        driver.findElement(By.linkText("Segmentos")).click();

        String a1 = driver.findElement(By.className("seg-3")).getText();
        assertEquals("Distribuidor de insumos", a1);

        String a2 = driver.findElement(By.className("seg-4")).getText();
        assertEquals("Loja agropecuária", a2);

        String a3 = driver.findElement(By.className("seg-5")).getText();
        assertEquals("Armazéns gerais", a3);

        String a4 = driver.findElement(By.className("seg-6")).getText();
        assertEquals("Produtor agrícola", a4);

        String a5 = driver.findElement(By.className("seg-7")).getText();
        assertEquals("Sementeira", a5);

        String a6 = driver.findElement(By.className("seg-8")).getText();
        assertEquals("Outros", a6);
    }

    @After
    public void tearDown() {
        Navegador.fechar();
    }
}
