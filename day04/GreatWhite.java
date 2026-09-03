public class GreatWhite extends Shark{
	public GreatWhite(String name){
		super(name);
	}

	@Override
	public boolean canEat(Animal food){
		boolean mange;
		if(this == food || food instanceof Canary ){
			mange = false;
		}
		else {
			mange = true;
		}
		return(mange);
	}

	@Override
	public void eat(Animal food){
		if(canEat(food)){
			System.out.println(getName() + " ate a " + food.getType() + " named " + food.getName() + ".");
			if(food instanceof Shark){
				System.out.println(getName() + ": The best meal one could wish for.");
			}
		}
		else if(food instanceof Canary){
			System.out.println(getName() + ": Next time you try to give me that to eat, I'll eat you instead.");
		}
		else{
			System.out.println(getName() + ": It's not worth my time.");
		}

	}
}



