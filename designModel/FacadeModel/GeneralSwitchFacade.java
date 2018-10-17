package FacadeModel;

public class GeneralSwitchFacade {
	public boolean open;
	public  Light[] lights=new Light[4];
	public AirCondition airCondition;
	public Fan fan;
	public Television television;
	
	public GeneralSwitchFacade(){
		for (int i = 0; i < lights.length; i++) {
			
			lights[i]=new Light(open);
		}
		airCondition=new AirCondition(open);
		fan=new Fan(open);
		television=new Television(open);
	}
	
	public void close(){
		open=false;
		System.out.println("main switch is closed!");
	}
	
	public void open(){
		for (int i = 0; i < lights.length; i++) {
			lights[i].mainSwitch=true;
		}
		fan.mainSwitch=true;
		airCondition.mainSwitch=true;
		television.mainSwitch=true;
		open=true;
		System.out.println("main switch is open!");
	}
}
