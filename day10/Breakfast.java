public class Breakfast<D extends Drink, B extends Bread> extends Menu<D,B>{
    public Breakfast(D drink, B bread){
        super(drink, bread);
    }
}
