package relatorio;

import com.itextpdf.text.BaseColor;
import java.util.List;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import model.ModelProdutos;

public class ControllerTablePDF {
    private static double soma;
    public static PdfPTable criarCabecalho() throws DocumentException {
        PdfPTable table = new PdfPTable(new float[] { 4f, 12f, 4f, 4f });
        //table.setTotalWidth(600f); //Definindo o tamanho fixo pra tabela
        //table.setLockedWidth(true);
        PdfPCell celulaQuantidade = new PdfPCell(new Phrase("Quantidade"));
        celulaQuantidade.setHorizontalAlignment(Element.ALIGN_CENTER);
        celulaQuantidade.setBackgroundColor(BaseColor.LIGHT_GRAY);
        PdfPCell celulaProduto = new PdfPCell(new Phrase("Produto"));
        celulaProduto.setHorizontalAlignment(Element.ALIGN_CENTER);
        celulaProduto.setBackgroundColor(BaseColor.LIGHT_GRAY);
        PdfPCell celulaValorUnitario = new PdfPCell(new Phrase("Preço Unid"));
        celulaValorUnitario.setHorizontalAlignment(Element.ALIGN_CENTER);
        celulaValorUnitario.setBackgroundColor(BaseColor.LIGHT_GRAY);
        PdfPCell celulaTotal = new PdfPCell(new Phrase("Total"));
        celulaTotal.setHorizontalAlignment(Element.ALIGN_CENTER);
        celulaTotal.setBackgroundColor(BaseColor.LIGHT_GRAY);

        table.addCell(celulaQuantidade);
        table.addCell(celulaProduto);
        table.addCell(celulaValorUnitario);
        table.addCell(celulaTotal);

        return table;
    }
    
    private static String convert(Object o){
        return new DecimalFormat("#.##").format(o);
    }

    public static void preencherDados(Document document, PdfPTable table,
                    List<ModelProdutos> produtos) throws DocumentException {
        if (document.isOpen()) {
            for (ModelProdutos produto : produtos) {
                if(produto.getProEstoque() > 0){
                    PdfPCell celula1 = new PdfPCell(new Phrase(convert(produto.getProEstoque())));
                    PdfPCell celula2 = new PdfPCell(new Phrase(produto.getProNome()));
                    PdfPCell celula3 = new PdfPCell(new Phrase(convert(produto.getProValor())));
                    double soma = produto.getProValor()*produto.getProEstoque();
                    PdfPCell celula4 = new PdfPCell(new Phrase(convert(soma)));

                    ControllerTablePDF.soma += soma;

                    celula1.setHorizontalAlignment(Element.ALIGN_CENTER);
                    table.addCell(celula1);
                    celula2.setHorizontalAlignment(Element.ALIGN_CENTER);
                    table.addCell(celula2);
                    celula3.setHorizontalAlignment(Element.ALIGN_CENTER);
                    table.addCell(celula3);
                    celula4.setHorizontalAlignment(Element.ALIGN_CENTER);
                    table.addCell(celula4);
                }
            }

            document.add(table);
        }
    }
    
    public static void preencherSoma(Document document) throws DocumentException {
        if (document.isOpen()) {
            
            PdfPTable table = new PdfPTable(new float[] { 12f });
            //table.setTotalWidth(600f); //Definindo o tamanho fixo pra tabela
            //table.setLockedWidth(true);
            PdfPCell celulaTotal = new PdfPCell(new Phrase("Total"));
            celulaTotal.setHorizontalAlignment(Element.ALIGN_CENTER);
            celulaTotal.setBackgroundColor(BaseColor.LIGHT_GRAY);
            table.addCell(celulaTotal);
            
            //String valor = new DecimalFormat("#.##").format(ControllerTablePDF.soma);
            //valor.replace(".", ",");
            PdfPCell celulaSoma = new PdfPCell(new Phrase(convert(ControllerTablePDF.soma)));
            celulaSoma.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(celulaSoma);

            document.add(table);
        }
        
        
        
    }
    
    
}