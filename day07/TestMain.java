import java.util.ArrayList;
import java.util.List;

public class TestMain{
	public static void main(String[] args){
		Solo<String> strSolo = new Solo<>("toto");
		System.out.println("strSolo = toto");
		String strValue = strSolo.getValue();
		System.out.println(strValue);
		strSolo.setValue("tata");
		System.out.println(strSolo.getValue());

		Solo<Integer> intSolo = new Solo<>(Integer.valueOf(42));
		Integer intValue = intSolo.getValue();
		intSolo.setValue(Integer.valueOf(1337));

		Pair<String,Integer> dPair = new Pair<>("test",42);
		dPair.display();

		System.out.println("========================");
		List<Mage> mages = new ArrayList<>();
		mages.add(new Mage("Merlin"));
		mages.add(new Mage("Mandrake"));
		List<Warrior> warriors = new ArrayList<>();
		warriors.add(new Warrior("Spartacus"));
		warriors.add(new Warrior("Clovis"));
		Battalion battalion = new Battalion();
		battalion.add(mages);
		battalion.add(warriors);
		battalion.display();

		System.out.println("________________________");
		Character merlin = new Mage("Merlin", 12);
		Character gandalf = new Mage("Gandalf", 12);
		Character mandrake = new Mage("Mandrake", 9);
		Character achilles = new Warrior("Achilles", 240);
		System.out.println("Should return a positive value");
		System.out.println(merlin.compareTo(mandrake)); // Should return a positive value
		
		System.out.println("Should return a negative value");
		System.out.println(merlin.compareTo(achilles)); // Should return a negative value

		System.out.println("Should return 0");
		System.out.println(gandalf.compareTo(merlin)); // Should return 0

		
		System.out.println("========================");

		// Cas 1 : le premier gagne
        Battalion firstWins = new Battalion();
        List<Mage> firstBattle = new ArrayList<>();
        firstBattle.add(new Mage("Merlin", 12));
        firstBattle.add(new Mage("Mandrake", 9));
        firstWins.add(firstBattle);

        System.out.println("Cas 1 - premier personnage gagnant :");
        System.out.println("Fight retourne : " + firstWins.fight());
        firstWins.display();

        // Cas 2 : le deuxieme gagne
        Battalion secondWins = new Battalion();
        List<Mage> secondBattle = new ArrayList<>();
        secondBattle.add(new Mage("Merlin", 9));
        secondBattle.add(new Mage("Mandrake", 12));
        secondWins.add(secondBattle);

        System.out.println("Cas 2 - deuxième personnage gagnant :");
        System.out.println("Fight retourne : " + secondWins.fight());
        secondWins.display();

        // Cas 3 : egalite
        Battalion tie = new Battalion();
        List<Mage> tieBattle = new ArrayList<>();
        tieBattle.add(new Mage("Merlin", 12));
        tieBattle.add(new Mage("Mandrake", 12));
        tie.add(tieBattle);

        System.out.println("Cas 3 - égalité :");
        System.out.println("Fight retourne : " + tie.fight());
        tie.display();
	}
}
