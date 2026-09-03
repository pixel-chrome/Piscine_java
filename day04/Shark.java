public class Shark extends Animal{
	private boolean frenzy = false;

	public Shark(String name){
		super(name, 0, Type.FISH);
		System.out.println("A KILLER IS BORN!");
	}

	public void smellBlood(boolean frenzy){
		this.frenzy = frenzy;
	}

	public void status(){
		if(frenzy == true){
			System.out.println(getName() + " is smelling blood and wants to kill.");
		}
		else {
			System.out.println(getName() + " is swimming peacfully.");
		}
	}

	public boolean canEat(Animal food){
		if(food != this){
			return(true);
		}
		else{
			return(false);
		}
	}

	public void eat(Animal food){
		if(canEat(food)){
			System.out.println(getName() + " ate a " + food.getType() + " named " + food.getName() + ".");
			smellBlood(false);
		}
		else{
			System.out.println(getName() +  ": It's not worthy my time.");
		}
	}


}

