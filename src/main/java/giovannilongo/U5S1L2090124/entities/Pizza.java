package giovannilongo.U5S1L2090124.entities;

import java.util.List;


public class Pizza extends MenuItem {

    private List<Topping> toppings;


    public Pizza(String name, double price, List<Topping> toppings, int nutritionalInfo) {
        super(name, price, nutritionalInfo);
        this.toppings = toppings;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public void setToppings(List<Topping> toppings) {
        this.toppings = toppings;
    }


    @Override
    public String toString() {
        return "toppings=" + toppings;

    }
}
