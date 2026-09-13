public class Breakfast<D extends Food, B extends Food> extends Menu<D,B>{
    public Breakfast(D drink, B bread){
        super(drink, bread);
    }
}
