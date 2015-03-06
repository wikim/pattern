package hf.pattern.factory.fm;

import org.junit.Test;

public abstract class PizzaStore {
 
	abstract Pizza createPizza(String item);
	
	@Test
	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		System.out.println("--- Making a " + pizza.getName() + " ---");
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
