package br.com.moreirallan.manipulacaoarquivos.service.planilha;

public class Pessoa {

    private String nome, dataNascim, email;

    public Pessoa(String nome, String dataNascim, String email) {
        this.nome = nome;
        this.dataNascim = dataNascim;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascim() {
        return dataNascim;
    }

    public void setDataNascim(String dataNascim) {
        this.dataNascim = dataNascim;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
