public class Mage extends Character{

	public Mage(String name){
		super(name, "Mage");
		this.life = 70;
		this.strength = 13;
		this.agility = 10;
		this.wit = 10;
	}

	@Override
	public void attack(String weapon){
		if(weapon == "magic" || weapon == "sword"){
			System.out.println(getName() + ": Rrrrrrrrr....");
			System.out.println(getName() + ": Feel the power of my " + weapon + "!");
		}
	}
}
