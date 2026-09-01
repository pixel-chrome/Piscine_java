public class Gecko {
	private String name="Unknown";
	private int age;
	private int energy = 100;
	
	public int getAge(){
		return(age);
	}
	public void setAge(int age){
		this.age = age;
	}

	public String getName(){
		return(name);
	}

	public int getEnergy(){
		return(energy);
	}
	public void setEnergy(int energy){
		if(this.energy>=0 || this.energy <= 100){
			this.energy = energy;
		}
		else if(this.energy>100){
			this.energy = 100;
		}
		else if(this.energy<100){
			this.energy = 0;
		}
	}

	public void helloNewGecko(){
		if(name != "Unknown"){
			System.out.println("Hello " + name + "!");
		}
		else{
			System.out.println("Hello!");
		}
	}

	public Gecko(String name, int age){
		this.name = name;
		this.age = age;
		helloNewGecko();
	}

	public Gecko(String name){
		this.name = name;
		helloNewGecko();
	}

	public Gecko(){
		helloNewGecko();
	}

	public void status(){
		String phrase;
		switch(age){
			case 0:
				phrase = "Unborn Gecko";
				break;
			case 1,2:
				phrase = "Baby Gecko";
				break;
			case 3,4,5,6,7,8,9,10:
				phrase = "Adult Gecko";
				break;
			case 11,12,13:
				phrase = "Old Gecko";
				break;
			default:
				phrase = "Impossible Gecko";
		}
		System.out.println(phrase);
	}

	public void hello(String ami){
		System.out.println("Hello " + ami +", I'm " + name + "!");
	}
	public void hello(int repete){
		for(int i=0; i<repete; i++){
			System.out.println("Hello, I'm "+ name + "!");
		}
	}

	public void eat(String food){
		String feeling;	
		if(food.equalsIgnoreCase("Meat")){
			feeling = "Yummy!";
			if(energy<=90){
				energy = energy + 10;
			}
		}
		else if(food.equalsIgnoreCase("Vegetable")){
			feeling = "Erk!";
			if(energy>=10){
				energy = energy - 10;
			}
		}
		else{
			feeling = "I can't eat this!";
		}
		System.out.println(feeling);
	}

}
