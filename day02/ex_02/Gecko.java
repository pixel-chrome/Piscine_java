public class Gecko {
	public String name="Unknown";

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
