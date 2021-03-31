package br.com.moreirallan.manipulacaoarquivos.arquivos;

import java.util.List;

/**
 * Created by Allan Moreira on 8/15/16.
 */
public class LeituraGravacaoArquivoTest {

    private LeituraGravacaoArquivo leituraGravacaoArquivo;

    @org.junit.Before
    public void setUp() throws Exception {
        leituraGravacaoArquivo = new LeituraGravacaoArquivo();
    }

    @org.junit.After
    public void tearDown() throws Exception {

    }

    @org.junit.Test
    public void testLer() throws Exception {
        List<String> strings = leituraGravacaoArquivo.ler(CaminhoConstants.Arquivo.CAMINHO + CaminhoConstants.Arquivo.TESTE_1);

        System.out.println(strings.size());
        System.out.println(strings.toString());
    }
}