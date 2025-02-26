package com.wipro.java.ms.liskov;

class Test {
	 
	  static void getAreaTest(Rectangle r) {
	      int width = r.getWidth();
	      int height = r.getHeight();
	      System.out.println("Expected area of " + (width * height) + ", got " + r.getArea());
	  }

	  public static void main(String[] args) {
	      Rectangle rc = new Rectangle(2, 3);
	      getAreaTest(rc);

	      Rectangle sq = new Square();
	      sq.setWidth(5);
	      getAreaTest(sq);
	  }
	}