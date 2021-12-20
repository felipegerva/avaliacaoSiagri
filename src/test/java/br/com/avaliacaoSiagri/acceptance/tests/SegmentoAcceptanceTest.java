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
import static org.junit.Assert.assertTrue;

public class SegmentoAcceptanceTest {
    private static WebDriver driver;

    @Before
    public void setup() {
        driver = Navegador.getInstance();
    }

    @Test
    public void ct_01_ValidarSegmentos(){
        driver.findElement(By.linkText("Soluções")).click();
        driver.findElement(By.linkText("Segmentos")).click();

        // Validação do CT-01 item 1.
        String a1 = driver.findElement(By.className("seg-3")).getText();
        assertEquals("Distribuidor de insumos", a1);

        // Validação do CT-01 item 2.
        String a2 = driver.findElement(By.className("seg-4")).getText();
        assertEquals("Loja agropecuária", a2);

        // Validação do CT-01 item 3.
        String a3 = driver.findElement(By.className("seg-5")).getText();
        assertEquals("Armazéns gerais", a3);

        // Validação do CT-01 item 4.
        String a4 = driver.findElement(By.className("seg-6")).getText();
        assertEquals("Produtor agrícola", a4);

        // Validação do CT-01 item 5.
        String a5 = driver.findElement(By.className("seg-7")).getText();
        assertEquals("Sementeira", a5);

        // Validação do CT-01 item 6.
        String a6 = driver.findElement(By.className("seg-8")).getText();
        assertEquals("Outros", a6);
    }

    @Test
    public void ct_02_0_ValidarPaginaAtiva(){
        driver.findElement(By.linkText("Soluções")).click();
        driver.findElement(By.linkText("Segmentos")).click();
        driver.findElement(By.linkText("Distribuidor de insumos")).click();

        // Validação do CT-02.0 item 1.
        String a1 = driver.findElement(By.className("seg-3")).getText();
        assertEquals("Distribuidor de insumos", a1);
    }

    @Test
    public void ct_02_1_ValidarBannerPrincipal(){
        driver.findElement(By.linkText("Soluções")).click();
        driver.findElement(By.linkText("Segmentos")).click();
        driver.findElement(By.linkText("Distribuidor de insumos")).click();

        // Validação do CT-02.1 item 1.
        String a1 = driver.findElement(By.className("segmentos-titulo-grid")).findElement(By.tagName("h2")).getText();
        assertEquals("Softwares para gestão de distribuidores de insumos agrícolas", a1);

        // Validação do CT-02.1 item 2.
        String a2 = driver.findElement(By.className("segmentos-titulo-grid")).findElement(By.tagName("p")).getText();
        assertEquals("Otimize processos, reduza desperdícios e tenha o controle de suas lojas em qualquer " +
                "hora e lugar. Com o Grupo Siagri, você compra melhor, evita perdas no estoque, vende com mais " +
                "eficiência e ainda tem mais segurança nas operações de Barter!", a2);

        // Validação do CT-02.1 item 3.
        driver.findElement(By.id("segmentos-titulo")).findElement(By.className("form-open")).click();
        String a3 = driver.findElement(By.className("modal-form-body")).findElement(By.tagName("h4")).getText();
        assertEquals("Solicite demonstração das nossas soluções.", a3);
    }

    @Test
    public void ct_02_2_ValidarInformacoesDesafiosDoSegmento(){
        driver.findElement(By.linkText("Soluções")).click();
        driver.findElement(By.linkText("Segmentos")).click();
        driver.findElement(By.linkText("Distribuidor de insumos")).click();

        // Validação do CT-02.2 item 1.
        String a1 = driver.findElement(By.cssSelector(".beneficio-row:nth-child(1)")).getText();
        assertEquals("Estoque eficiente", a1);

        // Validação do CT-02.2 item 2.
        String a2 = driver.findElement(By.cssSelector(".beneficio-row:nth-child(3)")).getText();
        assertEquals("Formação de preços", a2);

        // Validação do CT-02.2 item 3.
        String a3 = driver.findElement(By.cssSelector(".beneficio-row:nth-child(6)")).getText();
        assertEquals("Gestão de logística (expedição)", a3);

        // Validação do CT-02.2 item 4.
        String a4 = driver.findElement(By.cssSelector(".beneficio-row:nth-child(8)")).getText();
        assertEquals("Ampliar mix de atividades (armazenagem, Barter etc)", a4);

        // Validação do CT-02.2 item 5.
        String a5 = driver.findElement(By.cssSelector(".beneficio-row:nth-child(10)")).getText();
        assertEquals("Gestão orçamentária", a5);
    }

    @Test
    public void ct_03_0_ValidarPaginaAtiva(){
        driver.findElement(By.linkText("Soluções")).click();
        driver.findElement(By.linkText("Segmentos")).click();
        driver.findElement(By.linkText("Loja agropecuária")).click();

        // Validação do CT-03.0 item 1.
        String a1 = driver.findElement(By.className("seg-4")).getText();
        assertEquals("Loja agropecuária", a1);
    }

    @After
    public void tearDown() {
        Navegador.fechar();
    }
}
