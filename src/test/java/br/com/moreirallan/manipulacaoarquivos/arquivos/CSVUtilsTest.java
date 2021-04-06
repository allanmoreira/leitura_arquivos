package br.com.moreirallan.manipulacaoarquivos.arquivos;

import br.com.moreirallan.manipulacaoarquivos.base64.Base64Utils;
import br.com.moreirallan.manipulacaoarquivos.csv.CSVUtils;
import br.com.moreirallan.manipulacaoarquivos.csv.DadosCsv;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CSVUtilsTest {

    private CSVUtils csvUtils;

    @Test
    public void toCSVTest() {
        csvUtils = new CSVUtils();

        List<DadosCsv> listaDadosObjeto = new ArrayList<>();
        listaDadosObjeto.add(new DadosCsv("Allan", "Moreira"));
        listaDadosObjeto.add(new DadosCsv("Jéssica", "Freitas"));
        listaDadosObjeto.add(new DadosCsv("Vicente", "Baby"));

        List<List<String>> dados = new ArrayList<>();
        for (DadosCsv dadosObjeto : listaDadosObjeto) {
            dados.add(Arrays.asList(dadosObjeto.getNome(), dadosObjeto.getSobrenome()));
        }

        byte[] bytes = csvUtils.toCSV(dados);
        String base64 = Base64Utils.codificaArquivoParaBase64(bytes);
        System.out.println(base64);
    }
}