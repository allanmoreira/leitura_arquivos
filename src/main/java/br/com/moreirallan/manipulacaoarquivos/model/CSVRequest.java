package br.com.moreirallan.manipulacaoarquivos.model;

import java.util.List;

public class CSVRequest {
    private List<String> headers;
    private List<DadosCsv> dadosCsv;

    public List<String> getHeaders() {
        return headers;
    }

    public void setHeaders(List<String> headers) {
        this.headers = headers;
    }

    public List<DadosCsv> getDadosCsv() {
        return dadosCsv;
    }

    public void setDadosCsv(List<DadosCsv> dadosCsv) {
        this.dadosCsv = dadosCsv;
    }
}
