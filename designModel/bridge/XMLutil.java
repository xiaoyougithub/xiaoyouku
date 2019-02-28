package bridge;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;


public class XMLutil {
	
		public static String getPen(){
			try {   
				File f = new File("configue.xml");//创建一个文件对象
			     DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();//创建一个能创建一个文件的工厂对象
			     DocumentBuilder builder = factory.newDocumentBuilder();//用文件创建工厂对象创建一台机器
			     Document doc = builder.parse(f);//用机器创建一个文件
			     return doc.getElementsByTagName("pen").item(0).getFirstChild().getNodeValue();//通过文件中标签名返回其标签值
			     
			} catch (Exception e) {
			    	return null;
			    }
		}
		public static String getColor(){
			try {   
				File f = new File("configue.xml");//创建一个文件对象
			     DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();//创建一个能创建一个文件的工厂对象
			     DocumentBuilder builder = factory.newDocumentBuilder();//用文件创建工厂对象创建一台机器
			     Document doc = builder.parse(f);//用机器创建一个文件
			     return doc.getElementsByTagName("color").item(0).getFirstChild().getNodeValue();//通过文件中标签名返回其标签值
			    } catch (Exception e) {
			    	return null;
			    }
		}

}

