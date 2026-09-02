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

		planet.Mars tamere = new planet.Mars("Here and there");
		planet.Mars tagrandmere = new planet.Mars("Up");

		planet.moon.Phobos phobos1 = new planet.moon.Phobos(tamere, "Alpha 3");
		planet.moon.Phobos phobos2 = new planet.moon.Phobos(tagrandmere, "Beta 1");
		System.out.println(phobos1.getLandingSite());

		System.out.println("=========================");
		Astronaut mutta = new Astronaut("Mutta");
		Astronaut hibito = new Astronaut("Hibito");
		Astronaut serika = new Astronaut("Serika");

		Team spaceBro = new Team("SpaceBrothers");
		spaceBro.add(mutta);
		spaceBro.add(hibito);
		spaceBro.add(serika);
		System.out.println(spaceBro.countMembers());

		planet.Mars titi = new planet.Mars("Hill");
		mutta.doActions(titi);
		spaceBro.showMembers();
		spaceBro.remove(hibito);
		System.out.println(spaceBro.countMembers());

	}
}
