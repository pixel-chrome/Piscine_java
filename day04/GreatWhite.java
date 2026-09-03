public class GreatWhite extends Shark{
	public GreatWhite(String name){
		super(name);
	}

	@Override
	public boolean canEat(Animal food){
		boolean mange;
		if(food instanceof Canary){
			mange = false;
			System.out.println(getName() + ": Next time you try to give me that to eat, I'll eat you instead.");
		}
		else{
			mange = true;
		}
		return(mange);
	}

	@Override
	public void eat(Animal food){
		super.eat(food);
		if(food instanceof Shark || this != food){
			System.out.println(getName() + ": The best meal one could wish for.");
		}
	}
}



