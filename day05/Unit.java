public abstract class Unit implements Fighter{
	private String name;
	private int hp;
	private int ap;
	private Unit closeTarget;
	private boolean alive = true;

	protected Unit(String name, int hp, int ap){
		this.name = name;
		this.hp = hp;
		this.ap = ap;
	}
	
	@Override
	public String getName(){
		return(name);
	}

	@Override
	public int getHp(){
		return(hp);
	}

	@Override
	public int getAp(){
		return(ap);
	}

	@Override
	public void getCloseTarget(){
		return(closeTarget);
	}

	@Override
	public void receiveDamage(int damage){
		if(hp - damage > 0){
			this.hp = hp - damage;
		}
		else{
			this.hp = 0;
			this.alive = false;
		}
	}
	
	@Override
	public boolean moveCloseTo(Unit guy){
		if(getCloseTarget() != guy && this != guy){
			System.out.println(getName() + " is moving closer to " + guy.getName() + ".");
			return true;
		}
		else{
			return false;
		}
	}

	public void recoverAP(){
		if(ap + 7 <= 50){
			this.ap = ap + 7;
		}
		else{
			this.ap = 50;
		}
	}
}


