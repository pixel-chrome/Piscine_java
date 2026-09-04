public class PowerFist extends Weapon{
	public String output = "SBAM";
	
	public PowerFist(){
		super("Power Fist", 8, 50, true);
	}

	@Override
	public void attack(){
		System.out.println(output);
	}
}
