package br.com.moreirallan.manipulacaoarquivos.model;

import java.util.Date;

public class FileInfoResponse {
    private String nomeArquivo;
    private String tipo;
    private long tamanho;
    private Date dataModificacao;
//    private Date dataModificacao;
    private String path;
    private String extensao;
    private String separadorDiretorio;

    public String getNomeArquivo() {
        return nomeArquivo;
    }

    public void setNomeArquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getExtensao() {
        return extensao;
    }

    public void setExtensao(String extensao) {
        this.extensao = extensao;
    }

    public String getSeparadorDiretorio() {
        return separadorDiretorio;
    }

    public void setSeparadorDiretorio(String separadorDiretorio) {
        this.separadorDiretorio = separadorDiretorio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public long getTamanho() {
        return tamanho;
    }

    public void setTamanho(long tamanho) {
        this.tamanho = tamanho;
    }

    public Date getDataModificacao() {
        return dataModificacao;
    }

    public void setDataModificacao(Date dataModificacao) {
        this.dataModificacao = dataModificacao;
    }
}
