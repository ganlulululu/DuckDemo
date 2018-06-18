package model;

public class MallardDuck extends Duck {
	public MallardDuck(QuackBehavior quackBehavior, FlyBehavior flyBehavior) {
		super(quackBehavior, flyBehavior);}


	public void display(){
		System.out.println("I am a MallardDuck !");
	}
	public void swim(){
		System.out.println("I can swim!");
	}

}
