package bridge;

public class Painter {
	public static void main(String[] args) {
//		Pen pen=PenFactory.getPen("B");
//		pen.setColor(ColorFactory.getCOlor("Y").color);
		System.out.println(XMLutil.getPen());
		Pen pen=PenFactory.getPen(XMLutil.getPen());
		pen.setColor(ColorFactory.getCOlor(XMLutil.getColor()).color);
	}
	
}
