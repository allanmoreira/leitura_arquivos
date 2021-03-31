package br.com.moreirallan.manipulacaoarquivos.planilha;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by allan on 15/04/16.
 */
public class LeituraPlanilha {

    public void escritaPlanilha(String nomeArquivo, ArrayList<Pessoa> listaPessoas) {
        int linha = 0;
        int coluna;

        try {
            FileInputStream fileInputStream = new FileInputStream(new File(nomeArquivo).getAbsolutePath());
            HSSFWorkbook hssfWorkbook = new HSSFWorkbook(fileInputStream);
            HSSFSheet hssfSheet = hssfWorkbook.getSheetAt(0);

            for(Pessoa pessoa : listaPessoas) {
                coluna = 0;
                Row row = hssfSheet.getRow(linha);
                Cell cell = row.getCell(coluna);
                cell.setCellValue(pessoa.getNome());

                coluna++;
                row = hssfSheet.getRow(linha);
                cell = row.getCell(coluna);
                cell.setCellValue(pessoa.getDataNascim());

                coluna++;
                row = hssfSheet.getRow(linha);
                cell = row.getCell(coluna);
                cell.setCellValue(pessoa.getEmail());

                linha++;

            }

            fileInputStream.close();
            FileOutputStream outFile = new FileOutputStream(new File(new File(nomeArquivo).getAbsolutePath()));
            hssfWorkbook.write(outFile);
            outFile.close();

            System.out.println("Dados escritos na plnilha com sucesso!");

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo [" + nomeArquivo + "] não encontrado!");
        } catch (IOException e) {
            System.out.println("Houve um erro ao ler o arquivo!");
        }
    }

    public void leituraPlanillha(String nomeArquivo) {
        int linha = 0;
        int coluna = 0;

        try {
            FileInputStream fileInputStream = new FileInputStream(new File(nomeArquivo).getAbsolutePath());
            HSSFWorkbook hssfWorkbook = new HSSFWorkbook(fileInputStream);
            HSSFSheet hssfSheet = hssfWorkbook.getSheetAt(0);
            while (linha < 4) {
                while (coluna < 2) {
                    try {
                        Row row = hssfSheet.getRow(linha);
                        Cell cell = row.getCell(coluna);
                        if(cell != null)
                            System.out.println("Conteúdo da linha " + (linha+1) + " e coluna " + (coluna+1) + ": " + cell.getStringCellValue());
                    } catch (NullPointerException e) {
                        e.printStackTrace();
                    }
                    coluna++;
                }
                coluna=0;
                linha++;
            }

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo [" + nomeArquivo + "] não encontrado!");
        } catch (IOException e) {
            System.out.println("Houve um erro ao ler o arquivo!");
        }
    }
}
