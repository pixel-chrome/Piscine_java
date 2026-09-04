public abstract class Monster extends Unit{
	protected int damage = 0;
	protected int apcost = 0;

	public Monster(String name, int hp, int ap){
		super(name, hp, ap);
	}

	public int getDamage(){
		return(damage);
	}

	public int getApcost(){
		return(apcost);
	}

	@Override
	public boolean equip(Weapon arme){
		System.out.println("Monsters are proud and fight with their own bodies.");
		return false;
	}

	@Override
	public boolean attack(Fighter guy){
		if(getCloseTarget() instanceof Unit){
			if(getAp() >= apcost){
				System.out.println(getName() + " attacks " + guy.getName());
				guy.receiveDamage(this.getDamage());
				this.ap = getAp() - apcost;
				return true;
			}
			else{
				return false;
			}
		}
		else{
			System.out.println(getName() + ": I'm too far away from " + guy.getName() + ".");
			return false;
		}
	}
}
