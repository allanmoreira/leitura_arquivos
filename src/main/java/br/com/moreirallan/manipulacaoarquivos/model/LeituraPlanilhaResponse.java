package br.com.moreirallan.manipulacaoarquivos.model;

import java.util.List;

public class LeituraPlanilhaResponse {
    private int size;
    private List<String> lista;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<String> getLista() {
        return lista;
    }

    public void setLista(List<String> lista) {
        this.lista = lista;
    }
}
