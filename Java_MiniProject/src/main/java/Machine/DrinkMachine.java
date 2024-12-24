package Machine;

import Goods.Drink;

import java.util.ArrayList;
import java.util.List;

public class DrinkMachine {
    public List<Drink> drinks;

    public DrinkMachine() {
        drinks = new ArrayList<>();
    }

    public void setDrinks(Drink drink){
        drinks.add(drink);
    }

}
