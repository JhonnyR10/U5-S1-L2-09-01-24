package giovannilongo.U5S1L2090124;

import giovannilongo.U5S1L2090124.entities.Drinks;
import giovannilongo.U5S1L2090124.entities.Menu;
import giovannilongo.U5S1L2090124.entities.Pizza;
import giovannilongo.U5S1L2090124.entities.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Configuration
public class BeansConfiguration {

    @Bean
    public Pizza margherita() {
        List<Topping> toppings = Collections.singletonList(new Topping("Cheese", 0.69, 92));
        return new Pizza("Pizza Margherita", 4.99, toppings, 1104);
    }

    @Bean
    public Pizza hawaiianPizza() {
        List<Topping> toppings = new ArrayList<>();
        toppings.add(new Topping("Tomato", 0.0, 10));
        toppings.add(new Topping("Cheese", 0.69, 92));
        toppings.add(new Topping("Ham", 0.99, 35));
        toppings.add(new Topping("Ananas", 0.79, 24));

        return new Pizza("Hawaiian Pizza", 6.49, toppings, 1024);
    }

    @Bean
    public Drinks water() {
        return new Drinks("Water", 1.29, 0);
    }

    @Bean
    public Topping cheese() {
        return new Topping("Cheese", 0.69, 92);
    }

    @Bean
    public Topping ham() {
        return new Topping("Ham", 0.99, 35);
    }

    @Bean
    public Menu menu() {
        Menu menu = new Menu();
        menu.setPizzas(Arrays.asList(margherita(), hawaiianPizza()));
        menu.setDrinks(Collections.singletonList(water()));
        menu.setToppings(Arrays.asList(cheese(), ham()));
        return menu;
    }
}
