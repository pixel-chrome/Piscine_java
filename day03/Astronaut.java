import chocolate.*;
import planet.*;

public class Astronaut{
	private int id;
	private static int nextId = 0;
	
	private String name;
	private int snacks = 0;
	private String destination = null;
	
	public Astronaut(String name){
		this.id = nextId++;
		this.name = name;
		System.out.println(name + " ready for launch!");
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

	public void doActions(){
		System.out.println(name + ": Nothing to do.");
		doNothing();
	}

	public void doActions(planet.Mars planet){
		System.out.println(name + ": Started a mission!");
		destination = planet.getLandingSite();
	}

	public void doActions(chocolate.Mars choco){
		System.out.println(name + ": Thanks for this Mars number " + choco.getId());
		snacks = snacks + 1;
		doNothing();
	}

	public void doNothing(){
		if(destination == null){
			System.out.println(name + ": I may have done nothing, but I have " + snacks + " Mars to eat at least!");
		}
	}
}
