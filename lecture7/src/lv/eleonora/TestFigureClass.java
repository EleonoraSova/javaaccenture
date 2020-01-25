package lv.eleonora;

import lv.eleonora.geometricfigures.Circle;

public class TestFigureClass {

	public static void main(String[] args) {
		
        Circle figure = new Circle();
        Circle figure1 = new Circle(40.2); 
        Circle figure2 = new Circle(20.5, "green");
        
		
		System.out.println(figure.getColor()+" "+figure.getRadius());
		System.out.println(figure.getColor()+" "+figure1.getRadius());
		System.out.println(figure.getColor()+" "+figure2.getRadius());

	}

}
