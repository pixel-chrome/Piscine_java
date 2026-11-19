public abstract class Character implements Movable{
	protected String name;
	protected int life;
	protected int agility;
	protected int strength;
	protected int wit;
	protected final String RPGClass;

	public String getName(){
		return(name);
	}

	public int getLife(){
		return(life);
	}

	public int getAgility(){
		return(agility);
	}

	public int getStrength(){
		return(strength);
	}

	public int getWit(){
		return(wit);
	}

	public String getRPGClass(){
		return(RPGClass);
	}

	public void attack(String phrase) throws WeaponException{
		System.out.println(name + ": Rrrrrrrrr....");
	}

	public void attack() throws WeaponException {
		throw new WeaponException(getName() + ": I refuse to fight with my bare hands.");
	}

	public void tryToAttack(String weapon) throws WeaponException {
		try {
			attack(weapon);
		} catch (WeaponException e) {
			System.out.println(e.getMessage());
		}
	}

	public Character(String name, String RPGClass){
		this.name = name;
		this.RPGClass = RPGClass;
	}

	public void moveRight(){
		System.out.println(getName() + ": moves right");
	}

    	public void moveLeft(){
		System.out.println(getName() + ": moves left");
	}

    	public void moveForward(){
		System.out.println(getName() + ": moves forward");
	}

    	public void moveBack(){
		System.out.println(getName() + ": moves back");
	}

	public final void unsheathe(){
		System.out.println(getName() + ": unsheathes his weapon.");
	}
}
