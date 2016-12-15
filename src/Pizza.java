/**
 * Created by xuweijie on 2016/10/19.
 */
public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies[] veggies;
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;

    public Pizza() {
    }

    abstract void prepare();

    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("---- " + this.name + " ----\n");
        if(this.dough != null) {
            result.append(this.dough);
            result.append("\n");
        }

        if(this.sauce != null) {
            result.append(this.sauce);
            result.append("\n");
        }

        if(this.cheese != null) {
            result.append(this.cheese);
            result.append("\n");
        }

        if(this.veggies != null) {
            for(int i = 0; i < this.veggies.length; ++i) {
                result.append(this.veggies[i]);
                if(i < this.veggies.length - 1) {
                    result.append(", ");
                }
            }

            result.append("\n");
        }

        if(this.clam != null) {
            result.append(this.clam);
            result.append("\n");
        }

        if(this.pepperoni != null) {
            result.append(this.pepperoni);
            result.append("\n");
        }

        return result.toString();
    }
}
