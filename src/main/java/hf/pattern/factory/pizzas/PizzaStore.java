package hf.pattern.factory.pizzas;

public class PizzaStore {
    SimplePizzaFactory factory;
    NyPizzaFactory nyPizzaFactory;
    
    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }
    
    public PizzaStore(NyPizzaFactory nyPizzaFactory) {
        this.nyPizzaFactory = nyPizzaFactory;
    }
   

    public Pizza orderPizza(String type) {
        Pizza pizza;

        //pizza = factory.createPizza(type);
        pizza = nyPizzaFactory.createPizza(type);
        
        
        

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

}
