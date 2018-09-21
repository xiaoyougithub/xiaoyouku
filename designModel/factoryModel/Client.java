package factoryModel;

public class Client {
	public static void main(String[] args) {
		Factory factory;
		Fruit fruit;
		factory=new AppleProduct();
		fruit=factory.getFruit();
		fruit.showName();
	}
}
