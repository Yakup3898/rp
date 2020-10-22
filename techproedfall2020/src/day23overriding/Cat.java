package day23overriding;

public class Cat extends Animal {
	
	@Override
	public void sound() {
		System.out.println("Cats meow");
	}
	@Override
	public void eat() {
		System.out.println("Cats like cheese");
	}
	@Override
	public Cat create() {
		return new Cat();
	}
	@Override
	public Long add() {
		return (long)4321;
	}
}






