public class PlasmaRifle extends Weapon{
	public String output = "PIOU";
	
	public PlasmaRifle(){
		super("Plasma Rifle", 5, 21, false);
	}

	@Override
	public void attack(){
		System.out.println(output);
	}
}
