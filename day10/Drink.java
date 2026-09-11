public abstract class Drink implements Food{
    protected boolean aCan = false;
    protected float price;
    protected int calories;

    public Drink(float price, int calories){
	    this.price = price;
	    this.calories = calories;
    }

    public boolean isACan(){
        return aCan;
    }

    public float getPrice(){
        return price;
    }

    public int getCalories(){
        return calories;
    }
}
