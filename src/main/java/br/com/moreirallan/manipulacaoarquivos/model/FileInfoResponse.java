package br.com.moreirallan.manipulacaoarquivos.model;

public class FileInfoResponse {
    private String nomeArquivo;
    private String caminhoArquivo;
    private String caminhoRelativo1;
    private String caminhoRelativo2;
    private String extensao;
    private String separadorDiretorio;

    public String getCaminhoRelativo1() {
        return caminhoRelativo1;
    }

    public void setCaminhoRelativo1(String caminhoRelativo1) {
        this.caminhoRelativo1 = caminhoRelativo1;
    }

    public String getCaminhoRelativo2() {
        return caminhoRelativo2;
    }

    public void setCaminhoRelativo2(String caminhoRelativo2) {
        this.caminhoRelativo2 = caminhoRelativo2;
    }

    public String getNomeArquivo() {
        return nomeArquivo;
    }

    public void setNomeArquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public String getCaminhoArquivo() {
        return caminhoArquivo;
    }

    public void setCaminhoArquivo(String caminhoArquivo) {
        this.caminhoArquivo = caminhoArquivo;
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
}
