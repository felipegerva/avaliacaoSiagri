package br.com.avaliacaoSiagri;

import br.com.avaliacaoSiagri.acceptance.tests.SegmentoAcceptanceTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        // Aceitação
        SegmentoAcceptanceTest.class
})

public class TestRunner {
}
