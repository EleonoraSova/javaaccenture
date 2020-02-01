package lv.eleonora;

import lv.eleonora.polymorphisms.Animal;
import lv.eleonora.polymorphisms.Cat;
import lv.eleonora.polymorphisms.Dog;

public class TestPolymorphisms {
	
	public static void main(String[] args) {
		Animal myAnimal = new Animal();
		Animal myDog = new Dog();
		Animal myCat = new Cat();
		myAnimal.animalSound();
		myDog.animalSound();
		myCat.animalSound();
	}

}
