public class Warrior extends Character{

	public Warrior(String name){
		super(name, "Warrior");
		this.life = 100;
		this.strength = 10;
		this.agility = 8;
		this.wit = 3;
	}

	@Override
	public void attack(String weapon){
		if(weapon == "hammer" || weapon == "sword"){
			System.out.println(getName() + ": Rrrrrrrrr....");
			System.out.println(getName() + ": I'll crush you with my " + weapon + "!");
		}
	}
}
