package bridge;

public class PenFactory {
	public static Pen getPen(String penType){
		if(penType.equals("B")){
			return new BigPen(penType);
		}
		if(penType.equals("S")){
			return new BigPen(penType);
		}
		return null;
	}

}
