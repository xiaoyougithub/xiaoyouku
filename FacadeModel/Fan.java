package FacadeModel;

public class Fan {

	public  boolean open;
	public boolean mainSwitch;
	public Fan(boolean mainSwitch) {
		super();
		// TODO Auto-generated constructor stub
		this.mainSwitch=mainSwitch;
	}
	public void close(){
		open=false;
		System.out.println("the Fan is close!");
	}
	
	public void open(){
		open=true;
		if(mainSwitch==false){
			System.out.println("fan can not open because main switch is not open!");
		}
		else {
			System.out.println("the fan is open!");
		}
	}

}
