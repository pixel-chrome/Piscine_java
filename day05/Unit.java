public abstract Unit implements Fighter{
	private String name;
	private int hp;
	private int ap;
	private boolean closeTarget;

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


	@Override
	public boolean getCloseTarget(){
		if(hp>0){
			return(closeTarget);
		}
		else{
			return false;
		}
	}

	@Override
	public void receiveDamage(int damage){
		if(hp - damage > 0){
			this.hp = hp - damage;
		}
		else{
			this.hp = 0;
		}
	}

