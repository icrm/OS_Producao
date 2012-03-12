package br.com.idit.io.pdf;

import com.lowagie.text.DocumentException;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;

import org.w3c.dom.Document;
import org.w3c.tidy.Tidy;
import org.xhtmlrenderer.pdf.ITextRenderer;


/** 
 * @Autor Eder Baum 
 */
public class Html2Pdf {

    public static void convert(String input, OutputStream out) throws DocumentException {
        convert(new ByteArrayInputStream(input.getBytes()), out);
    }

    public static void convert(InputStream input, OutputStream out) throws DocumentException {
        Tidy tidy = new Tidy();
        Document doc = tidy.parseDOM(input, null);
        ITextRenderer renderer = new ITextRenderer();
        renderer.setDocument(doc, null);
        renderer.layout();
        renderer.createPDF(out);
    }
}
