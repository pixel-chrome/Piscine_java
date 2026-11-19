public class Mage extends Character{

	public Mage(String name){
		super(name, "Mage");
		this.life = 70;
		this.strength = 13;
		this.agility = 10;
		this.wit = 10;
		System.out.println(name + ": May the gods be with me.");
	}

	@Override
	public void attack(String weapon) throws WeaponException{
		if(weapon == "magic" || weapon == "wand"){
			System.out.println(getName() + ": Rrrrrrrrr....");
			System.out.println(getName() + ": Feel the power of my " + weapon + "!");
		}
		else {
			throw new WeaponException(getName() + ": I don't need this stupid " + weapon + "! Don't misjudge my powers!");
		}
	}

	@Override
	public void moveRight(){
		System.out.println(getName() + ": moves right furtively.");
	}
	@Override
   	public void moveLeft(){
		System.out.println(getName() + ": moves left furtively.");
	}
	@Override
  	public void moveForward(){
		System.out.println(getName() + ": moves forward furtively.");
	}
	@Override
    	public void moveBack(){
		System.out.println(getName() + ": moves back furtively.");
	}
}
