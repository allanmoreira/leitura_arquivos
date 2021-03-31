package br.com.moreirallan.manipulacaoarquivos.arquivos;

import org.junit.Before;
import org.junit.Test;

import java.io.File;

/**
 * Created by Allan Moreira on 8/16/16.
 */
public class FileInfoTest {

    private FileInfo fileInfo;

    @Before
    public void setUp() throws Exception {
        fileInfo = new FileInfo(new File(CaminhoConstants.Arquivo.CAMINHO + CaminhoConstants.Arquivo.TESTE_1));
    }

    @Test
    public void testGetSeparadorDiretorio() throws Exception {
        System.out.println("Separador de diretório: "+fileInfo.getSeparadorDiretorio()+"");
    }

    @Test
    public void testGetExtensao() throws Exception {
        System.out.println("Extensão do arquivo: "+fileInfo.getExtensao());
    }

    @Test
    public void testGetNomeArquivo() throws Exception {
        System.out.println("Nome do arquivo: "+fileInfo.getNomeArquivo());
    }

    @Test
    public void testGetCaminhoArquivo() throws Exception {
        System.out.println("Caminho do arquivo: "+fileInfo.getCaminhoArquivo());
    }
}