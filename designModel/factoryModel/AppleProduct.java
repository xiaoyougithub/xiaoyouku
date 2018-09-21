package factoryModel;

public class AppleProduct extends Factory{

	@Override
	public Fruit getFruit() {
		// TODO Auto-generated method stub
		return new Apple();
	}

}
