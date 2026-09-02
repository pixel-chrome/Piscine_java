public class Astronaut{
	private int id;
	private static int nextId = 0;
	
	private String name;
	private int snacks = 0;
	private String destination = null;

	public Astronaut(String name){
		this.id = nextId++;
		this.name = name;
		System.out.println(name + " ready to launch!");
	}

	public int getId(){
		return(id);
	}

	public String getName(){
		return(name);
	}

	public int getSnacks(){
		return(snacks);
	}

	public String getDestination(){
		return(destination);
	}
}
