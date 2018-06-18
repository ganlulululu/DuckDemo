import static org.junit.Assert.*;

import org.junit.Test;

import model.FlyNoWay;
import model.FlyWithRocket;
import model.FlyWithWings;
import model.MallardDuck;
import model.MuteQuack;
import model.QuackBehavior;
import model.RedheadDuck;
import model.RubberDuck;
import model.Squeak;
import model.Quack;

public class test {

	@Test
	public void test() {
		Quack quck=new Quack();
		MuteQuack muteQuck=new MuteQuack();
		Squeak squeak=new Squeak();
		
		FlyNoWay flyNoWay=new FlyNoWay();
		FlyWithRocket flyWithRocket=new FlyWithRocket();
		FlyWithWings flyWithWings=new FlyWithWings();
		
		MallardDuck mallarDuck=new MallardDuck(squeak, flyWithWings);
		RubberDuck rubberDuck=new RubberDuck(quck, flyWithRocket);
		RedheadDuck redHeadfDuck=new RedheadDuck(muteQuck, flyNoWay);
		
		mallarDuck.display();
		mallarDuck.swim();
		mallarDuck.performQuack();
		mallarDuck.performFly();
		
		rubberDuck.display();
		rubberDuck.swim();
		rubberDuck.performQuack();
		rubberDuck.performFly();
		
		redHeadfDuck.display();
		redHeadfDuck.swim();
		redHeadfDuck.performQuack();
		redHeadfDuck.performFly();
		
		
		
	}

}
