package Java_Advance.ExamPreperation.Third_Tasks.vendingSystem;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private int buttonCapacity;
    private List<Drink> drinks;

    public VendingMachine(int buttonCapacity) {
        this.buttonCapacity = buttonCapacity;
        this.drinks = new ArrayList<>();
    }

    public int getCount(){
        return this.drinks.size();
    }

    public void addDrink(Drink drink){
        if (this.drinks.size() < buttonCapacity){
            this.drinks.add(drink);
        }
    }

    public boolean removeDrink(String name) {
        for (Drink drink:this.drinks) {
            if (drink.getName().equals(name)){
                return this.drinks.remove(drink);
            }
        }
        return false;
    }

    public Drink getLongest(){

        Drink drink1 = null;

        for (Drink drink:this.drinks) {
            if (drink1 == null){
                drink1 = drink;
            }
            if (drink.getVolume() > drink1.getVolume()) {
                drink1 = drink;
            }
        }

        return drink1;
    }

    public Drink getCheapest(){
        Drink lowest = null;

        for (Drink drink: this.drinks) {
            if (lowest == null){
                lowest = drink;
            }

            if (lowest.getPrice().compareTo(drink.getPrice()) > 0) {
                lowest = drink;
            }
        }
        return lowest;
    }

    public String buyDrink(String name){
        for (Drink drink: this.drinks) {
            if (drink.getName().equals(name)){
                return drink.toString();
            }

        }
        return null;
    }

    public String report(){
        StringBuilder reportBuilder = new StringBuilder();
        reportBuilder.append("Drinks available:\n");

        for (Drink drink : drinks) {
            reportBuilder.append(drink).append("\n");
        }

        return reportBuilder.toString();
    }






}
