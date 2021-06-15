package br.com.moreirallan.manipulacaoarquivos.service;

import br.com.moreirallan.manipulacaoarquivos.service.arquivos.LeituraGravacaoArquivo;
import br.com.moreirallan.manipulacaoarquivos.model.LeituraPlanilhaResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeituraGravacaoArquivoService {

    @Autowired
    private LeituraGravacaoArquivo leituraGravacaoArquivo;

    public LeituraPlanilhaResponse ler(String arquivo){
        List<String> strings = leituraGravacaoArquivo.ler(arquivo);
        LeituraPlanilhaResponse response = new LeituraPlanilhaResponse();
        response.setLista(strings);
        response.setSize(strings.size());
        return response;
    }

    public void novo(String arquivo){
        leituraGravacaoArquivo.novo(arquivo);
    }
}
