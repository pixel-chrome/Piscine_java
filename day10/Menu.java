public abstract class Menu<D extends Food, M extends Food> implements Food {
    protected D drink;
    protected M meal;

    public Menu(D drink, M meal){
        this.drink = drink;
        this.meal = meal;
    }

    public D getDrink() {
        return drink;
    }

    public M getMeal() {
        return meal;
    }

    public float getPrice(){
        return((drink.getPrice() + meal.getPrice()) * 0.9f);
    }

    public int getCalories(){
        return(drink.getCalories() + meal.getCalories());
    }
}
