package lv.eleonora;

import lv.eleonora.figure.Rectangle;

public class TestFigure {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		System.out.println(rectangle.toString());
		Rectangle rectangle2 = new Rectangle(0.0f, 0.0f);
		System.out.println(rectangle2);

	}

}
