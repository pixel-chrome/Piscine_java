public class TestMain{
	public static void main(String[] args){
		Gecko mimi = new Gecko("mimi");
		Snake AAAR = new Snake();
		Gecko bob = new Gecko("Timothé");

		mimi.setEnergy(50);
		bob.setEnergy(50);
		System.out.println("mimi=50 bob =50");
		mimi.fraternize(bob);

		mimi.setEnergy(29);
		bob.setEnergy(50);
		System.out.println("mimi=29 bob=50");
		mimi.fraternize(bob);

		System.out.println("both 29");
		bob.setEnergy(29);
		mimi.fraternize(bob);
		
		System.out.println("mimi = "+mimi.getEnergy());
		System.out.println("mimi encouters Snake");
		mimi.fraternize(AAAR);
		System.out.println("mimi = "+mimi.getEnergy());
		
		System.out.println("mimi=9 + Snake");
		mimi.setEnergy(9);
		mimi.fraternize(AAAR);

	}
}
