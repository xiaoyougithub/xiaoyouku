package bridge;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;


public class XMLutil {
	
		public static String getPen(){
			try {   
				File f = new File("configue.xml");//����һ���ļ�����
			     DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();//����һ���ܴ���һ���ļ��Ĺ�������
			     DocumentBuilder builder = factory.newDocumentBuilder();//���ļ������������󴴽�һ̨����
			     Document doc = builder.parse(f);//�û�������һ���ļ�
			     return doc.getElementsByTagName("pen").item(0).getFirstChild().getNodeValue();//ͨ���ļ��б�ǩ���������ǩֵ
			     
			} catch (Exception e) {
			    	return null;
			    }
		}
		public static String getColor(){
			try {   
				File f = new File("configue.xml");//����һ���ļ�����
			     DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();//����һ���ܴ���һ���ļ��Ĺ�������
			     DocumentBuilder builder = factory.newDocumentBuilder();//���ļ������������󴴽�һ̨����
			     Document doc = builder.parse(f);//�û�������һ���ļ�
			     return doc.getElementsByTagName("color").item(0).getFirstChild().getNodeValue();//ͨ���ļ��б�ǩ���������ǩֵ
			    } catch (Exception e) {
			    	return null;
			    }
		}

}

