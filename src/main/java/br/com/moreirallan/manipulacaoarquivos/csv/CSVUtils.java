package br.com.moreirallan.manipulacaoarquivos.csv;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.QuoteMode;
import org.springframework.stereotype.Component;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@Component
public class CSVUtils {

    public byte[] toCSV(List<List<String>> dados, String[] headers) {
        final CSVFormat format = CSVFormat.RFC4180.withHeader(headers).withQuoteMode(QuoteMode.MINIMAL);

        try (
                ByteArrayOutputStream out = new ByteArrayOutputStream();
                CSVPrinter csvPrinter = new CSVPrinter(new PrintWriter(out), format);
             ) {
            for (List<String> linha : dados) {
                csvPrinter.printRecord(linha);
            }
            csvPrinter.flush();
            return out.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException("fail to import data to CSV file: " + e.getMessage());
        }
    }
}
