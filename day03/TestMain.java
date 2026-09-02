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

		planet.Mars titi = new planet.Mars("Here and there");
		planet.Mars toto = new planet.Mars("Up");

		planet.moon.Phobos phobos1 = new planet.moon.Phobos(titi, "Alpha 3");
		planet.moon.Phobos phobos2 = new planet.moon.Phobos(toto, "Beta 1");
		System.out.println(phobos1.getLandingSite());
	}
}
