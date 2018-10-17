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
		System.out.println("�����ұ�������ˣ��һ�˵����");
	}
}
