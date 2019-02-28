package FacadeModel;

public class Television {
	public  boolean open;
	public boolean mainSwitch;
	public Television(boolean mainSwitch) {
		super();
		// TODO Auto-generated constructor stub
		this.mainSwitch=mainSwitch;
	}
	
	public void close(){
		open=false;
		System.out.println("the Television is close!");
	}
	
	public void open(){
		open=true;
		if(mainSwitch==false){
			System.out.println("television can not open because main switch is not open!");
		}
		else {
			System.out.println("the television is open!");
		}
	}

}
