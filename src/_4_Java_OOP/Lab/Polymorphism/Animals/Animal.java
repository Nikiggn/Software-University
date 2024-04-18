package _4_Java_OOP.Lab.Polymorphism.Animals;

public abstract class Animal {
    private String name;
    private String favouriteFood;

    protected Animal(String name, String favouriteFood) {
        this.name = name;
        this.favouriteFood = favouriteFood;
    }

    public  String explainSelf(){
       String res = String.format("I am %s and my favourite food is %s\n",
               this.getName(),
               this.getFavouriteFood());
       return res +  (this instanceof Cat ? Cat.SOUND : Dog.SOUND);
    }

    private String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private String getFavouriteFood() {
        return favouriteFood;
    }

    private void setFavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
    }
}
