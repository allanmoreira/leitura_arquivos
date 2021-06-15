package br.com.moreirallan.manipulacaoarquivos.service.planilha;

import br.com.moreirallan.manipulacaoarquivos.service.arquivos.CaminhoConstants;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class LeituraPlanilhaTest {

    private static final String CAMINHO_PLANILHA_LEITURA = CaminhoConstants.Planilha.CAMINHO + CaminhoConstants.Planilha.LEITURA;
    private static final String CAMINHO_PLANILHA_ESCRITA = CaminhoConstants.Planilha.CAMINHO + CaminhoConstants.Planilha.ESCRITA;

    private LeituraPlanilha leituraPlanilha;

    @Before
    public void setUp() throws Exception {
        leituraPlanilha = new LeituraPlanilha();
    }

    @Test
    public void leituraPlanillha(){
        leituraPlanilha.leituraPlanillha(CAMINHO_PLANILHA_LEITURA);
    }

    @Test
    public void escreveNaPlanilha(){
        ArrayList<Pessoa> listaPessoas = new ArrayList<>();
        listaPessoas.add(new Pessoa("Francisco Maximus", "01/07/1967", "francisco@dominio.com.br"));
        listaPessoas.add(new Pessoa("Samuel Santana", "07/01/1976", "samuel@dominio.com.br"));
        listaPessoas.add(new Pessoa("Marina Reis", "08/09/1982", "marina@dominio.com.br"));
        listaPessoas.add(new Pessoa("Alice Amaral", "25/04/1996", "alice@dominio.com.br"));
        listaPessoas.add(new Pessoa("Clarissa Gonçalves", "19/06/1952", "clarissa@dominio.com.br"));
        listaPessoas.add(new Pessoa("Kevin Barcellos", "12/04/1982", "kevin@dominio.com.br"));
        listaPessoas.add(new Pessoa("Bryan Paris", "17/11/1957", "bryan@dominio.com.br"));
        listaPessoas.add(new Pessoa("Lucas Suarez", "24/07/1996", "lucas@dominio.com.br"));
        listaPessoas.add(new Pessoa("Gustavo Oliveira", "05/01/1984", "gustavo@dominio.com.br"));
        listaPessoas.add(new Pessoa("Giovanna Pereira", "04/05/1976", "giovanna@dominio.com.br"));
        listaPessoas.add(new Pessoa("Michael Souza", "02/07/1953", "michael@dominio.com.br"));
        listaPessoas.add(new Pessoa("Pedro Ribeiro", "14/03/2002", "pedro@dominio.com.br"));
        listaPessoas.add(new Pessoa("Daniel Maia", "12/04/1995", "daniel@dominio.com.br"));
        listaPessoas.add(new Pessoa("Giovanna Martinez", "12/11/1963", "giovanna@dominio.com.br"));
        listaPessoas.add(new Pessoa("Zoe Batista", "05/06/1977", "zoe@dominio.com.br"));
        listaPessoas.add(new Pessoa("Ana Amaral", "14/01/1979", "ana@dominio.com.br"));
        listaPessoas.add(new Pessoa("Lucas Sampaio", "09/02/1976", "lucas@dominio.com.br"));
        listaPessoas.add(new Pessoa("Manuel Moraes", "12/12/1962", "manuel@dominio.com.br"));
        listaPessoas.add(new Pessoa("Sofia Mello", "27/07/1977", "sofia@dominio.com.br"));
        listaPessoas.add(new Pessoa("Levi Frias", "01/11/1968", "levi@dominio.com.br"));
        listaPessoas.add(new Pessoa("Ricardo Costa", "17/05/1981", "ricardo@dominio.com.br"));
        listaPessoas.add(new Pessoa("Paulo Morais", "11/11/1985", "paulo@dominio.com.br"));
        listaPessoas.add(new Pessoa("André Duarte", "14/04/1952", "andre@dominio.com.br"));
        listaPessoas.add(new Pessoa("Calebe Barreto", "13/05/1990", "calebe@dominio.com.br"));
        listaPessoas.add(new Pessoa("Muriel Freitas", "05/03/1955", "muriel@dominio.com.br"));
        listaPessoas.add(new Pessoa("Alícia Dias", "04/04/1952", "alicia@dominio.com.br"));
        listaPessoas.add(new Pessoa("Joana Mauricio", "03/01/1998", "joana@dominio.com.br"));
        listaPessoas.add(new Pessoa("Isadora Amaral", "29/06/2002", "isadora@dominio.com.br"));
        listaPessoas.add(new Pessoa("Santos Vasconcelos", "26/05/1974", "santos@dominio.com.br"));
        listaPessoas.add(new Pessoa("Rafaela Martinele", "19/03/1997", "rafaela@dominio.com.br"));
        listaPessoas.add(new Pessoa("Afonso Neves", "27/09/1977", "afonso@dominio.com.br"));
        listaPessoas.add(new Pessoa("Lorenzo Oliveira", "27/03/1974", "lorenzo@dominio.com.br"));
        listaPessoas.add(new Pessoa("Valentina Queiroz", "03/10/1954", "valentina@dominio.com.br"));
        listaPessoas.add(new Pessoa("Anabela Leão", "19/04/1999", "anabela@dominio.com.br"));
        listaPessoas.add(new Pessoa("Gustavo Araújo", "08/03/1968", "gustavo@dominio.com.br"));
        listaPessoas.add(new Pessoa("Paola Paris", "06/02/1968", "paola@dominio.com.br"));
        listaPessoas.add(new Pessoa("Isaac Neves", "23/04/1968", "isaac@dominio.com.br"));
        listaPessoas.add(new Pessoa("Arthur Xavier", "01/05/1988", "arthur@dominio.com.br"));
        listaPessoas.add(new Pessoa("Maria Sampaio", "23/05/1976", "maria@dominio.com.br"));
        listaPessoas.add(new Pessoa("Adriana De Novais", "12/09/1954", "adriana@dominio.com.br"));
        listaPessoas.add(new Pessoa("Levi Albuquerque", "28/10/1982", "levi@dominio.com.br"));
        listaPessoas.add(new Pessoa("Ágata Menezes", "21/06/1965", "agata@dominio.com.br"));
        listaPessoas.add(new Pessoa("Beatriz Barreto", "05/01/1982", "beatriz@dominio.com.br"));
        listaPessoas.add(new Pessoa("Paolo Reis", "27/02/1961", "paolo@dominio.com.br"));
        listaPessoas.add(new Pessoa("Daniel Barreto", "18/10/1952", "daniel@dominio.com.br"));
        listaPessoas.add(new Pessoa("César Junqueira", "26/03/1993", "cesar@dominio.com.br"));
        listaPessoas.add(new Pessoa("Flôr Gonçalves", "17/01/1968", "flor@dominio.com.br"));
        listaPessoas.add(new Pessoa("Rafael Chaves", "02/03/1976", "rafael@dominio.com.br"));
        listaPessoas.add(new Pessoa("Duarte Mauricio", "01/11/1956", "duarte@dominio.com.br"));
        listaPessoas.add(new Pessoa("Bernardo Xavier", "30/08/1982", "bernardo@dominio.com.br"));

        leituraPlanilha.escritaPlanilha(CAMINHO_PLANILHA_ESCRITA, listaPessoas);
    }
}