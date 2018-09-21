package abstracFactoryModel;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

public class Client {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, ParserConfigurationException, SAXException, IOException {
		TV tv;
		Factory factory=(HaierFactory)XMLutil.getObject();
		tv=factory.produceTv();
		tv.play();
	}
}
