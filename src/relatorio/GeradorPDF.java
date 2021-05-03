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
import model.ModelProdutos;

public class GeradorPDF {
    private List<ModelProdutos> lprodutos;

    public GeradorPDF(List<ModelProdutos> lprodutos) {
        this.lprodutos = lprodutos;
        //lprodutos = new ArrayList<ModelProdutos>();
    }
    
    public void gerarPDF(){
        try {
            Document document = new Document();

            PdfWriter pdf =  PdfWriter.getInstance(document, new FileOutputStream("C:\\Users\\savio\\Desktop\\GeDep_relatorio.pdf"));

            // Abre documento
            document.open();

            PdfPTable table = ControllerTablePDF.criarCabecalho();

            ControllerTablePDF.preencherDados(document, table, lprodutos);
            
            ControllerTablePDF.preencherSoma(document);

            // Encerra documento
            document.close();

        } catch (DocumentException de) {
                System.err.println(de.getMessage());
        } catch (IOException ioe) {
                System.err.println(ioe.getMessage());
        }
    }
    
    public static void main(String[] args) throws BadElementException {
    }
}