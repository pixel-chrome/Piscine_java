public interface Fighter {

	public abstract boolean equip(Weapon arme);

	public abstract boolean attack(Fighter personne);

	public abstract void receiveDamage(int damage);

	public abstract boolean moveCloseTo(Fighter personne);

	public abstract void recoverAp();

	public abstract String getName();

	public abstract int getAp();

	public abstract int getHp();
}	
