public class Lunch<D extends Food, S extends Food> extends Menu<D,S>{
    public Lunch(D drink, S sandwich){
        super(drink, sandwich);
    }
}
