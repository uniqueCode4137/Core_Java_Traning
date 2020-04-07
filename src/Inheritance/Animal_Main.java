package Inheritance;

public class Animal_Main {

	public static void main(String[] args) {
	
		/**
		 * Inheritance
		 */
		
		Dog d = new Dog();
		d.whoAm();
		
		Cat c = new Cat();
		c.whoAm();
		
		/*
		 * Polymorphism
		 */
		Animal a;
		
		a = new Animal();
		a.whoAm();
		
		a = new Dog();
		a.whoAm();
		
		a = new Cat();
		a.whoAm();
	}

}
