package decoratorModel;

public class AirPlane extends Charger {
	
	public AirPlane(Transform transform){
		this.transform=transform;
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		transform.move();
		fly();
	}
	public void fly(){
		System.out.println("�һ������ɻ������ܷɣ�");
	}

}
