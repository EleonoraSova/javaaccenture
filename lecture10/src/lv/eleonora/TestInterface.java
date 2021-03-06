package lv.eleonora;

import lv.eleonora.interfaces.Rectangle;
import lv.eleonora.interfaces.Shape;
import lv.eleonora.interfaces.Triangle;

public class TestInterface {

	public static void main(String[] args) {
		int num1 = 20;
		int num2 = 34;
		Rectangle rect = new Rectangle(num1, num2);
		
		System.out.println(rect.getLength() +" " + rect.getWidth());
		
		Shape figure = new Rectangle(5, 10);
		
		System.out.println(figure.toString());
		System.out.println(figure.getArea());
		
		Shape figure1 = new Triangle(20,50);
		System.out.println(figure1.toString());
		System.out.println(figure1.getArea());
		
	}
}
