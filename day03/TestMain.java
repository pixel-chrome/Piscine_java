import chocolate.*;
import planet.*;
public class TestMain{
	public static void main(String[] args){
		Astronaut Charles = new Astronaut("Charles");
		chocolate.Mars barre = new chocolate.Mars();
		planet.Mars Jupiter = new planet.Mars("Jupiter");
		
		System.out.println("action vide");
		Charles.doActions();

		System.out.println("action choco");
		Charles.doActions(barre);

		System.out.println("action planet");
		Charles.doActions(Jupiter);
		System.out.println(Charles.getDestination());
	}
}
