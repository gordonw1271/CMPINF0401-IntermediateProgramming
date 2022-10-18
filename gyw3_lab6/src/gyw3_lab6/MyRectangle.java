package gyw3_lab6;

public class MyRectangle {
	
	private int startX;
	private int startY;
	private int width;
	private int height;
	

	//constructors
	
	public MyRectangle() {
		startX = 0;
		startY = 0;
		width = 0;
		height = 0;
	}
	
	public MyRectangle(int startX, int startY, int width, int height){
		this.startX = startX;
		this.startY = startY;
		this.width = width;
		this.height = height;
	}
	
	//accessors
	
	public int area(){
		int a = width *height;
		return a;
	}
	
	public String toString(){
		StringBuilder S = new StringBuilder();
		S.append("Width: " + width);
		S.append(" Height: " + height);
		S.append(" X: " + startX);
		S.append(" Y: " + startY);
		return S.toString();
	}
	
	public boolean isInside(int X, int Y){
		boolean b;
		if((X >= startX && X <= (startX+width)) && ((Y >= startY) && Y <= (startY + height))) {
			b = true;
		}else {
			b = false;
		}
		return b;
	}
	
	//mutators
	
	public void setSize(int newWidth, int newHeight) {
		this.width = newWidth;
		this.height = newHeight;
	}
	
	public void setPosition(int newX, int newY) {
		this.startX = newX;
		this.startY = newY;
	}
}
