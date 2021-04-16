package br.com.moreirallan.manipulacaoarquivos.service;

import br.com.moreirallan.manipulacaoarquivos.base64.Base64Utils;
import br.com.moreirallan.manipulacaoarquivos.csv.CSVUtils;
import br.com.moreirallan.manipulacaoarquivos.csv.DadosCsv;
import br.com.moreirallan.manipulacaoarquivos.model.CSVRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CSVService {

    @Autowired
    private CSVUtils csvUtils;

    public byte[] toCsv(CSVRequest request){
        String[] headers = new String[request.getHeaders().size()];
        for (int i = 0; i < request.getHeaders().size(); i++) {
            headers[i] = request.getHeaders().get(i);
        }

        List<List<String>> dados = new ArrayList<>();
        for (DadosCsv dadosObjeto : request.getDadosCsv()) {
            dados.add(Arrays.asList(dadosObjeto.getNome(), dadosObjeto.getSobrenome()));
        }

        return csvUtils.toCSV(dados, headers);
    }
}
