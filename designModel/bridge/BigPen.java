package bridge;

public class BigPen extends Pen{

	public BigPen(String penType) {
		super(penType);
		// TODO Auto-generated constructor stub
		System.out.println("����"+penType+"���͵ı�������");
	}

	@Override
	public void setColor(String color) {
		// TODO Auto-generated method stub
		this.color=color;
		System.out.println("����"+color+"��ɫ������䡣");
	}

}
