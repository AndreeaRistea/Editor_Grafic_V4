package XML;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class Save 
{
	public static void SaveInFile()
	{
		try
		{
			DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			Document dom = builder.newDocument();
			Element p = dom.createElement("point");
			dom.appendChild(p);
			Element x = dom.createElement("X");
			Element y = dom.createElement("Y");
			
			x.setTextContent("12");
			y.setTextContent("10");
			
			dom.appendChild(x);
			dom.appendChild(y);
			Transformer tr = TransformerFactory.newInstance().newTransformer();
		    tr.setOutputProperty(OutputKeys.INDENT, "yes");
		    tr.transform(new DOMSource(dom), (Result) new StreamResult(new File("C:\\Facultate-AnII-SemII\\Info_Aplicata\\EditorGrafic\\xmlFiles\\puncte.xml")));
		}  catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
