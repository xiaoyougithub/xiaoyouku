package FacadeModel;

public class FacadeModelDemo {
	public static void main(String[] args) {
		GeneralSwitchFacade generalSwitchFacade=new GeneralSwitchFacade();
		generalSwitchFacade.close();
		generalSwitchFacade.fan.open();
		generalSwitchFacade.open();
		generalSwitchFacade.fan.open();
	}
}
