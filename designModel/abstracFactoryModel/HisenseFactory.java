package abstracFactoryModel;

public class HisenseFactory extends Factory{

	public TV produceTv() {
		// TODO Auto-generated method stub
		return new HisenceTV() ;
	}

	@Override
	public AirCondition produceAirCondition() {
		// TODO Auto-generated method stub
		return new HisenseAirCondition();
	}

}
