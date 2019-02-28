package abstracFactoryModel;

public class HaierFactory extends Factory{

	@Override
	public TV produceTv() {
		// TODO Auto-generated method stub
		return new HaierTV();
	}

	@Override
	public AirCondition produceAirCondition() {
		// TODO Auto-generated method stub
		return new HaierAirCondition();
	}

}
