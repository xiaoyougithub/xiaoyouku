package bridge;

public class BigPen extends Pen{

	public BigPen(String penType) {
		super(penType);
		// TODO Auto-generated constructor stub
		System.out.println("我用"+penType+"类型的笔作画。");
	}

	@Override
	public void setColor(String color) {
		// TODO Auto-generated method stub
		this.color=color;
		System.out.println("我用"+color+"颜色进行填充。");
	}

}
