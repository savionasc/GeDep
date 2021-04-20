package relatorio;

import java.util.List;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;

public class ControllerTable {
    public static PdfPTable criarCabecalho() throws DocumentException {
        PdfPTable table = new PdfPTable(new float[] { 10f, 5f, 3f });
        //table.setTotalWidth(600f); //Definindo o tamanho fixo pra tabela
        //table.setLockedWidth(true);
        PdfPCell celulaNome = new PdfPCell(new Phrase("Nome"));
        celulaNome.setHorizontalAlignment(Element.ALIGN_CENTER);
        PdfPCell celulaDataNasc = new PdfPCell(new Phrase("Data Nasc"));
        celulaDataNasc.setHorizontalAlignment(Element.ALIGN_CENTER);
        PdfPCell celulaSexo = new PdfPCell(new Phrase("Sexo"));
        celulaSexo.setHorizontalAlignment(Element.ALIGN_CENTER);

        table.addCell(celulaNome);
        table.addCell(celulaDataNasc);
        table.addCell(celulaSexo);

        return table;
    }

    public static void preencherDados(Document document, PdfPTable table,
                    List<Pessoa> pessoas) throws DocumentException {
        if (document.isOpen()) {
            for (Pessoa pessoa : pessoas) {
                PdfPCell celula1 = new PdfPCell(new Phrase(pessoa.getNome()));
                PdfPCell celula2 = new PdfPCell(new Phrase(pessoa.getDataNasc()));
                PdfPCell celula3 = new PdfPCell(new Phrase(String.valueOf(pessoa.getSexo())));

                celula1.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(celula1);
                celula2.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(celula2);
                celula3.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(celula3);
            }

            document.add(table);
        }
    }
}