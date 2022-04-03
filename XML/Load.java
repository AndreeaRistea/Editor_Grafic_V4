package XML;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class Load 
{
	public static void LoadFile()
	{
		try {
			DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			Document dom = builder.parse(new File("C:\\Facultate-AnII-SemII\\Info_Aplicata\\EditorGrafic\\xmlFiles\\puncte.xml"));
			dom.normalizeDocument();
			Element p = dom.getDocumentElement();
			NodeList nList = dom.getElementsByTagName("point");
			Element ln = (Element) nList.item(0);
			for (int i=0; i < ((NodeList) ln).getLength(); i++)
			{
			System.out.println(" x=" + p.getElementsByTagName("X").item(i).getTextContent());
			System.out.println(" y=" + p.getElementsByTagName("Y").item(i).getTextContent());
			}
			
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
