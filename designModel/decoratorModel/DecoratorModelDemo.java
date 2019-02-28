package decoratorModel;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

public class DecoratorModelDemo {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, ParserConfigurationException, SAXException, IOException {
		Transform transform;
		Charger charger;
		
		transform=(Car) XMLUtil.getImplimentedInterfaceOfTransform();
		transform.move();
		charger= new Robot(transform);
		charger.move();
	}

}
