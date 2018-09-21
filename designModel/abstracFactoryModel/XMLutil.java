package abstracFactoryModel;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class XMLutil {
		public static Object getObject() throws ParserConfigurationException, SAXException, IOException, ClassNotFoundException, InstantiationException, IllegalAccessException{
			
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			Document doc;	
			doc = builder.parse(new File("configue.xml")); 
				
		    String cName=doc.getElementsByTagName("className").item(0).getFirstChild().getNodeValue();	                   
		    Class c=Class.forName(cName);
			Object obj=c.newInstance();
		    return obj;
		
	}


}