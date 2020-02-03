package lv.eleonora;

import java.util.ArrayList;

public class LoopThroughArrayList {


	public static void main(String[] args) {
		
		ArrayList<String> cars = new ArrayList<>();
		
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		
		System.out.println(cars.indexOf("BMW"));
		System.out.println(cars.isEmpty());
		System.out.println(cars.get(3));
		System.out.println(cars.set(0, "Opel"));
		cars.clear();
		
		System.out.println("+++++++++++++++");
		
		System.out.println(cars.size());
		for(String car : cars){
			System.out.println(car);
		}
		
		System.out.println(cars);
		cars.remove("Ford");
		cars.remove("Mazda");
		System.out.println(cars.size());
		for(String car : cars){
			System.out.println(car);
		}
	}
}

		