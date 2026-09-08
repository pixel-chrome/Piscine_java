public abstract class Character implements Movable, Comparable<Character>{
	protected String name;
	protected int life = 50;
	protected int agility = 2;
	protected int strength = 2;
	protected int wit = 2;
	protected final String RPGClass;
	protected int capacity = 0;

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

	public int getCapacity(){
		return(capacity);
	}

	public void attack(String phrase){
		System.out.println(name + ": Rrrrrrrrr....");
	}

	public Character(String name, String RPGClass){
		this.name = name;
		this.RPGClass = RPGClass;
	}
	public Character(String name, String RPGClass, int capacity){
		this.name = name;
		this.RPGClass = RPGClass;
		this.capacity = capacity;
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

	@Override
	public int compareTo(Character otherGuy){
		if(this != otherGuy){
	       		if(getRPGClass() == otherGuy.getRPGClass()){
				return(Integer.compare(getCapacity(), otherGuy.getCapacity()));
			}
			//quand ils ont pas la meme RPGClass
			else{
				if(this instanceof Warrior){
					if(otherGuy.getCapacity() % getCapacity() == 0){
						return 1;
					}
					else{
						return -1;
					}
				}
				else if (this instanceof Mage){
					if(otherGuy.getCapacity() % getCapacity() == 0){
						return -1;
					}
					else{
						return 1;
					}
				}
				else{
		    		return 0;
				}
			}
		}
	    else{
		    return 0;
		}
	}

}
