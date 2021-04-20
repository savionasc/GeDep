package relatorio;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class GeneratorPDF {
    public static void main(String[] args) throws BadElementException {
        try {
            Document document = new Document();

            PdfWriter pdf =  PdfWriter.getInstance(document, new FileOutputStream("C:\\Users\\savio\\Desktop\\GeDep_relatorio.pdf"));

            // Abre documento
            document.open();

            PdfPTable table = ControllerTable.criarCabecalho();

            List<Pessoa> lpessoa = new ArrayList<Pessoa>();
            Pessoa pessoa1 = new Pessoa("Antônio", "01/01/1986", 'M');
            Pessoa pessoa2 = new Pessoa("Sávio", "02/02/1986", 'M');
            Pessoa pessoa3 = new Pessoa("Sávio N", "03/03/1986", 'M');

            lpessoa.add(pessoa1);
            lpessoa.add(pessoa2);
            lpessoa.add(pessoa3);

            ControllerTable.preencherDados(document, table, lpessoa);

            // Encerra documento
            document.close();

        } catch (DocumentException de) {
                System.err.println(de.getMessage());
        } catch (IOException ioe) {
                System.err.println(ioe.getMessage());
        }
    }
}