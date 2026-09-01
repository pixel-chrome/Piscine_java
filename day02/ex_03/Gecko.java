public class Gecko {
	private String name="Unknown";
	
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

	public Gecko(String name){
		this.name = name;
		helloNewGecko();
	}

	public Gecko(){
		helloNewGecko();
	}
}
