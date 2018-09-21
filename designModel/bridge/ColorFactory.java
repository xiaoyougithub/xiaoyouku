package bridge;

public class ColorFactory {
	public static Color getCOlor(String color){
		if(color.equals("R")){
			return new Red();
		}
		if(color.equals("Y")){
			return new Yellow();
		}
		return null;
	}

}
