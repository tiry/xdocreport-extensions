package fr.opensagres.xdocreport.document.textstyling.markdown;

import com.cforcoding.jmd.MarkDownParserAndSanitizer;

import fr.opensagres.xdocreport.document.textstyling.ITextStylingTransformer;
import fr.opensagres.xdocreport.document.textstyling.html.HTMLTextStylingTransformer;

public class MarkdownTextStylingTransformer extends HTMLTextStylingTransformer {

    public static final ITextStylingTransformer INSTANCE = new MarkdownTextStylingTransformer();

    @Override
    protected String generateXhtmlFromContent(String content) throws Exception {
        
        MarkDownParserAndSanitizer parser = new MarkDownParserAndSanitizer();
        String xHtml = parser.transform(content);        
        return xHtml;
        
    }
    
}
