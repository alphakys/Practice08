package com.javaex.ex06;

public class PointApp {

	public static void main(String[] args) {
		
		Point p1 = new Point(2, 3);
		Point p2 = new Point(2, 3);
		Point p3 = new Point(5, 3);
		Point p4 = p1;
	
		
		
		System.out.println(p1 == p2);
		System.out.println(p2 == p3);
		System.out.println(p3 == p4);
		System.out.println(p4 == p1);		
		System.out.println(p1.equals(p2));
		System.out.println(p4.equals(p1));
		
		
		/*
		 * 모든 클래스는 Object 클래스를 상속합니다. 
		 * 클래스가 상위 클래스를 상속하면 상위 클래스의 모든 메소드를 사용할 수 있습니다.
		 * 따라서 Point 클래스는 Object 클래스를 상속했기 때문에 equals 메소드를 사용할 수 있습니다.
		 
		*/
	}

}


