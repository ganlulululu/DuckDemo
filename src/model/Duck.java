package model;

public abstract class Duck {
	   QuackBehavior quackBehavior;
	   FlyBehavior flyBehavior;
	public Duck(QuackBehavior quackBehavior,FlyBehavior flyBehavior){
			this.quackBehavior=quackBehavior;
			this.flyBehavior=flyBehavior;
		}
	public void swim(){
		
	}
	
	public void display(){
	}
	
	public void performQuack(){
		quackBehavior.doQuack();
	}
	
	public void performFly(){
		flyBehavior.doFly();
	}
	public void setQuackBehavior(){
		
	}
	public void setFlyBehavior(){
		
	}
}
