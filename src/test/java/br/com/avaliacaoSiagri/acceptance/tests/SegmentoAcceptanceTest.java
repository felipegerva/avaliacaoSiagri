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
        driver.findElement(By.linkText("Soluções")).click();
        driver.findElement(By.linkText("Segmentos")).click();
    }

    @Test
    public void ct_01_ValidarSegmentos(){
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
        driver.findElement(By.linkText("Distribuidor de insumos")).click();

        // Validação do CT-02.0 item 1.
        String a1 = driver.findElement(By.className("seg-3")).getText();
        assertEquals("Distribuidor de insumos", a1);
    }

    @Test
    public void ct_02_1_ValidarBannerPrincipal(){
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
        driver.findElement(By.linkText("Loja agropecuária")).click();

        // Validação do CT-03.0 item 1.
        String a1 = driver.findElement(By.className("seg-4")).getText();
        assertEquals("Loja agropecuária", a1);
    }

    @Test
    public void ct_03_1_ValidarBannerPrincipal(){
        driver.findElement(By.linkText("Loja agropecuária")).click();

        // Validação do CT-03.1 item 1.
        String a1 = driver.findElement(By.cssSelector(".segmentos-titulo-grid h2")).getText();
        assertEquals("Softwares para gestão de lojas e varejo agropecuário", a1);

        // Validação do CT-03.1 item 2.
        String a2 = driver.findElement(By.cssSelector("p:nth-child(3)")).getText();
        assertEquals("Ganhe agilidade em vendas, confiança nos controles de estoque e custos. Fidelize " +
                "seu cliente e gerencie sua loja agropecuária de forma completa com o software Siagri.", a2);

        // Validação do CT-03.1 item 3.
        driver.findElement(By.id("segmentos-titulo")).findElement(By.className("form-open")).click();
        String a3 = driver.findElement(By.className("modal-form-body")).findElement(By.tagName("h4")).getText();
        assertEquals("Solicite demonstração das nossas soluções.", a3);
    }

    @Test
    public void ct_03_2_ValidarInformacoesDesafiosDoSegmento(){
        driver.findElement(By.linkText("Loja agropecuária")).click();

        // Validação do CT-03.2 item 1.
        String a1 = driver.findElement(By.cssSelector(".beneficio-row:nth-child(1)")).getText();
        assertEquals("Agilidade no atendimento", a1);

        // Validação do CT-03.2 item 2.
        String a2 = driver.findElement(By.cssSelector(".beneficio-row:nth-child(2)")).getText();
        assertEquals("Eficiência operacional", a2);

        // Validação do CT-03.2 item 3.
        String a3 = driver.findElement(By.cssSelector(".beneficio-row:nth-child(3)")).getText();
        assertEquals("Controle de comissionamento", a3);

        // Validação do CT-03.2 item 4.
        String a4 = driver.findElement(By.cssSelector(".beneficio-row:nth-child(5)")).getText();
        assertEquals("Conformidade fiscal", a4);

        // Validação do CT-03.2 item 5.
        String a5 = driver.findElement(By.cssSelector(".beneficio-row:nth-child(6)")).getText();
        assertEquals("Eficiência no fluxo de caixa em dia", a5);
    }

    @Test
    public void ct_04_0_ValidarPaginaAtiva(){
        driver.findElement(By.linkText("Armazéns gerais")).click();

        // Validação do CT-04.0 item 1.
        String a1 = driver.findElement(By.className("seg-5")).getText();
        assertEquals("Armazéns gerais", a1);
    }

    @Test
    public void ct_04_1_ValidarBannerPrincipal(){
        driver.findElement(By.linkText("Armazéns gerais")).click();

        // Validação do CT-04.1 item 1.
        String a1 = driver.findElement(By.cssSelector(".segmentos-titulo-grid h2")).getText();
        assertEquals("Softwares para gestão de armazéns gerais e cerealistas", a1);

        // Validação do CT-04.1 item 2.
        String a2 = driver.findElement(By.cssSelector(".segmentos-titulo-grid p")).getText();
        assertEquals("Ganhe eficiência desde o recebimento até a expedição dos grãos. Com o Grupo " +
                "Siagri, você gerencia todos os processos de armazenagem de grãos com agilidade e segurança.", a2);

        // Validação do CT-04.1 item 3.
        driver.findElement(By.id("segmentos-titulo")).findElement(By.className("form-open")).click();
        String a3 = driver.findElement(By.className("modal-form-body")).findElement(By.tagName("h4")).getText();
        assertEquals("Solicite demonstração das nossas soluções.", a3);
    }

    @Test
    public void ct_04_2_ValidarInformacoesDesafiosDoSegmento(){
        driver.findElement(By.linkText("Armazéns gerais")).click();

        // Validação do CT-04.2 item 1.
        String a1 = driver.findElement(By.cssSelector(".beneficio-row:nth-child(1)")).getText();
        assertEquals("Gestão de contratos", a1);

        // Validação do CT-04.2 item 2.
        String a2 = driver.findElement(By.cssSelector(".beneficio-row:nth-child(2)")).getText();
        assertEquals("Controle de saldos de terceiros", a2);

        // Validação do CT-04.2 item 3.
        String a3 = driver.findElement(By.cssSelector(".beneficio-row:nth-child(4)")).getText();
        assertEquals("Controle de retenções e transgenia", a3);

        // Validação do CT-04.2 item 4.
        String a4 = driver.findElement(By.cssSelector(".beneficio-row:nth-child(5)")).getText();
        assertEquals("Análise de exposição", a4);

        // Validação do CT-04.2 item 5.
        String a5 = driver.findElement(By.cssSelector(".beneficio-row:nth-child(6)")).getText();
        assertEquals("Controle de serviços prestados", a5);
    }

    @Test
    public void ct_05_0_ValidarPaginaAtiva(){
        driver.findElement(By.linkText("Produtor agrícola")).click();

        // Validação do CT-05.0 item 1.
        String a1 = driver.findElement(By.className("seg-6")).getText();
        assertEquals("Produtor agrícola", a1);
    }

    @Test
    public void ct_05_1_ValidarBannerPrincipal(){
        driver.findElement(By.linkText("Produtor agrícola")).click();

        // Validação do CT-05.1 item 1.
        String a1 = driver.findElement(By.cssSelector(".segmentos-titulo-grid h2")).getText();
        assertEquals("Softwares de gestão para produtores de grãos e algodão", a1);

        // Validação do CT-05.1 item 2.
        String a2 = driver.findElement(By.cssSelector(".segmentos-titulo-grid p")).getText();
        assertEquals("Gestão do planejamento da safra à contabilidade. Com o Grupo Siagri você gerencia seu negócio de ponta a ponta, centralizando a gestão administrativa, financeira, fiscal e operacional.", a2);

        // Validação do CT-05.1 item 3.
        driver.findElement(By.id("segmentos-titulo")).findElement(By.className("form-open")).click();
        String a3 = driver.findElement(By.className("modal-form-body")).findElement(By.tagName("h4")).getText();
        assertEquals("Solicite demonstração das nossas soluções.", a3);
    }

    @Test
    public void ct_05_2_ValidarInformacoesDesafiosDoSegmento(){
        driver.findElement(By.linkText("Produtor agrícola")).click();

        // Validação do CT-05.2 item 1.
        String a1 = driver.findElement(By.cssSelector(".beneficio-row:nth-child(1)")).getText();
        assertEquals("Planejamento de safra", a1);

        // Validação do CT-05.2 item 2.
        String a2 = driver.findElement(By.cssSelector(".beneficio-row:nth-child(2)")).getText();
        assertEquals("Gestão de estoque (armazenagem)", a2);

        // Validação do CT-05.2 item 3.
        String a3 = driver.findElement(By.cssSelector(".beneficio-row:nth-child(5)")).getText();
        assertEquals("Controle de custos", a3);

        // Validação do CT-05.2 item 4.
        String a4 = driver.findElement(By.cssSelector(".beneficio-row:nth-child(9)")).getText();
        assertEquals("Padronização de processos", a4);

        // Validação do CT-05.2 item 5.
        String a5 = driver.findElement(By.cssSelector(".beneficio-row:nth-child(8)")).getText();
        assertEquals("Gestão orçamentária", a5);
    }

    @Test
    public void ct_06_0_ValidarPaginaAtiva(){
        driver.findElement(By.linkText("Sementeira")).click();

        // Validação do CT-06.0 item 1.
        String a1 = driver.findElement(By.className("seg-7")).getText();
        assertEquals("Sementeira", a1);
    }

    @Test
    public void ct_06_1_ValidarBannerPrincipal(){
        driver.findElement(By.linkText("Sementeira")).click();

        // Validação do CT-06.1 item 1.
        String a1 = driver.findElement(By.cssSelector(".segmentos-titulo-grid h2")).getText();
        assertEquals("Softwares para gestão de sementeiras", a1);

        // Validação do CT-06.1 item 2.
        String a2 = driver.findElement(By.cssSelector(".segmentos-titulo-grid p")).getText();
        assertEquals("Ganhe eficiência no processo de beneficiamento de sementes. Com as soluções Siagri, você gerencia desde o recebimento do grão, até o embarque de sementes.", a2);

        // Validação do CT-06.1 item 3.
        driver.findElement(By.id("segmentos-titulo")).findElement(By.className("form-open")).click();
        String a3 = driver.findElement(By.className("modal-form-body")).findElement(By.tagName("h4")).getText();
        assertEquals("Solicite demonstração das nossas soluções.", a3);
    }

    @Test
    public void ct_06_2_ValidarInformacoesDesafiosDoSegmento(){
        driver.findElement(By.linkText("Sementeira")).click();

        // Validação do CT-06.2 item 1.
        String a1 = driver.findElement(By.cssSelector(".beneficio-row:nth-child(1)")).getText();
        assertEquals("Gestão de recebimento, produção e expedição de sementes", a1);

        // Validação do CT-06.2 item 2.
        String a2 = driver.findElement(By.cssSelector(".beneficio-row:nth-child(2)")).getText();
        assertEquals("Controle de lotes", a2);

        // Validação do CT-06.2 item 3.
        String a3 = driver.findElement(By.cssSelector(".beneficio-row:nth-child(3)")).getText();
        assertEquals("Gestão de vendas das semente", a3);

        // Validação do CT-06.2 item 4.
        String a4 = driver.findElement(By.cssSelector(".beneficio-row:nth-child(4)")).getText();
        assertEquals("Logística de embarque", a4);

        // Validação do CT-06.2 item 5.
        String a5 = driver.findElement(By.cssSelector(".beneficio-row:nth-child(6)")).getText();
        assertEquals("Gestão da colheita e armazenagem de grãos", a5);
    }

    @After
    public void tearDown() {
       Navegador.fechar();
    }
}
