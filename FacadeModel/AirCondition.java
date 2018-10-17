package FacadeModel;

public class AirCondition {
	public  boolean open;
	public boolean mainSwitch;
	public AirCondition(boolean mainSwitch){
		this.mainSwitch=mainSwitch;
	}
	
	public void close(){
		open=false;
		System.out.println("the AirCondition is close!");
	}
	
	public void open(){
		open=true;
		if(mainSwitch==false){
			System.out.println("aircondition can not open because main switch is not open!");
		}
		else {
			System.out.println("the airCondition is open!");
		}
	}

}
