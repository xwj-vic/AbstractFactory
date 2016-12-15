/**
 * Created by xuweijie on 2016/10/19.
 */
public class NYPizzaStore extends PizzaStore {
    public NYPizzaStore() {
    }

    protected Pizza createPizza(String item) {
        Object pizza = null;
        NYPizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        if(item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            ((Pizza)pizza).setName("New York Style Cheese Pizza");
        } else if(item.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            ((Pizza)pizza).setName("New York Style Veggie Pizza");
        } else if(item.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            ((Pizza)pizza).setName("New York Style Clam Pizza");
        } else if(item.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            ((Pizza)pizza).setName("New York Style Pepperoni Pizza");
        }

        return (Pizza)pizza;
    }
}
