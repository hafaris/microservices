package com.wipro.java.ms.liskov;

public class Square extends Rectangle{
	public Square() {
    }
	public Square(int side) {
	        this.height = this.width =side;
	    }

	@Override
    public void setWidth(int width) {
	        this.width = this.height = width;
	    }

	@Override
    public void setHeight(int height) {
	        this.width = this.height = height;
	    }
}
