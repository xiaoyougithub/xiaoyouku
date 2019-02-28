package decoratorModel;

public class Robot extends Charger {
	
	public Robot(Transform transform){
		this.transform=transform;
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		transform.move();
		 say();
	}
	
	public void say(){
		System.out.println("现在我变身机器人，我会说话。");
	}
}
