public class Gecko {
	private String name="Unknown";
	private int age;
	
	public int getAge(){
		return(age);
	}
	public int setAge(int age){
		this.age = age;
		return(age);
	}

	public String getName(){
		return(name);
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
		
}
