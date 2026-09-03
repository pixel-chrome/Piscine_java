public class Animal{
	protected enum Type {MAMMAL, FISH, BIRD};
	private String name;
	private int legs;
	private Type type;
	private static int numberOfAnimals;
	private static int numberOfMammals;
	private static int numberOfFish;
	private static int numberOfBirds;

	protected Animal(String name, int legs, Type type){
		this.name = name;
		this.legs = legs;
		this.type = type;
		this.numberOfAnimals = this.numberOfAnimals + 1;
		if(type == Type.MAMMAL){
			this.numberOfMammals = this.numberOfMammals + 1;
		}
		else if(type == Type.FISH){
			this.numberOfFish = this.numberOfFish + 1;
		}
		else if(type == Type.BIRD){
			this.numberOfBirds = this.numberOfBirds + 1;
		}
		System.out.println("My name is " + name + " and I am a " + type.toString().toLowerCase() + "!");
	}

	public String getName(){
		return(name);
	}

	public int getLegs(){
		return(legs);
	}

	public String getType(){
		return(type.toString().toLowerCase());
	}

	public void setName(){
		this.name = name;
	}

	public static int getNumberOfAnimals(){
		if(numberOfAnimals == 0){
			System.out.println("There are currently 0 animals in our world.");
		}
		else if(numberOfAnimals == 1){
			System.out.println("There is currently 1 animal in our world.");
		}
		else if(numberOfAnimals > 1){
			System.out.println("There are currently "+ numberOfAnimals +" animals in our world.");
		}
		return(numberOfAnimals);
	}
	

	public static void phrase(Type type, int number){
		String typeF = type.toString().toLowerCase();
		if(number == 0){
			System.out.println("There are currently 0 " + typeF +"s in our world.");
		}
		else if(number == 1){
			System.out.println("There is currently 1 " + typeF +" in our world.");
		}
		else if(number > 1 && type != Type.FISH){
			System.out.println("There are currently " + number + " " + typeF +"s in our world.");
		}
		else if(number > 1 && type == Type.FISH){
			System.out.println("There are currently " + number + " " + typeF +" in our world.");
		}
	}
			
	public static int getNumberOfMammals(){
		phrase(Type.MAMMAL, numberOfMammals);
		return(numberOfMammals);
	}

	public static int getNumberOfFish(){
		phrase(Type.FISH, numberOfFish);
		return(numberOfFish);
	}
	
	public static int getNumberOfBirds(){
		phrase(Type.BIRD, numberOfBirds);
		return(numberOfBirds);
	}

}
