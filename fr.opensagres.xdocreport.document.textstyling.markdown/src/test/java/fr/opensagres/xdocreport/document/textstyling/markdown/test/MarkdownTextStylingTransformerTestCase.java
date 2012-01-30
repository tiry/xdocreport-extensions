package fr.opensagres.xdocreport.document.textstyling.markdown.test;

import junit.framework.Assert;

import org.junit.Test;

import fr.opensagres.xdocreport.document.textstyling.IDocumentHandler;
import fr.opensagres.xdocreport.document.textstyling.ITextStylingTransformer;
import fr.opensagres.xdocreport.document.textstyling.markdown.MarkdownTextStylingTransformer;

public class MarkdownTextStylingTransformerTestCase {

	@Test
	public void testMarksown2HTML() throws Exception {
		ITextStylingTransformer formatter = MarkdownTextStylingTransformer.INSTANCE;
		IDocumentHandler handler = new HTMLDocumentHandler();
		formatter.transform("Here are severals styles"
		        +"\n**Bold** style."
		        +"\n\nnew paragraph\n"
		        +"\n#Title1"
		        +"\n##Title11"
		        +"\n###Title111"
		        +"\n * item1"
		        +"\n * item2"
		        +"\n\nnew paragraph"
		        , handler);
		
		String result = handler.getTextBody();
		Assert.assertEquals(
		        "<p>Here are severals styles<strong>Bold</strong> style.</p><p>new paragraph</p><h1>Title1</h1><h2>Title11</h2><h3>Title111</h3><ul><li>item1</li><li>item2</li></ul><p>new paragraph</p>",
				result);
	}
}
