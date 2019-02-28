package FacadeModel;

public class Light {
	public  boolean open;
	public boolean mainSwitch;
	public Light(boolean mainSwitch){
		this.mainSwitch=mainSwitch;
	}
	
	public void close(){
		open=false;
		System.out.println("the light is close!");
	}
	
	public void open(){
		open=true;
		if(mainSwitch==false){
			System.out.println("ligth can not open because main switch is not open!");
		}
		else {
			System.out.println("the light is open!");
		}
	}
}
