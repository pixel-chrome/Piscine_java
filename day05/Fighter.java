public interface Fighter {

	public boolean equip(Weapon arme);

	public boolean attack(Fighter personne);

	public void receiveDamage(int damage);

	public boolean moveCloseTo(Fighter personne);

	public void recoverAP();

	public String getName();

	public int getAp();

	public int getHp();
}	
