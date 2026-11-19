public class Lunch<D extends Drink, S extends Sandwich> extends Menu<D,S>{
    public Lunch(D drink, S sandwich){
        super(drink, sandwich);
    }
}
