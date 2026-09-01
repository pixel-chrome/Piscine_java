public class TestMain{
	public static void main(String[] args){
		Gecko mimi = new Gecko("mimi");
		System.out.println("mimi's energy: "+ mimi.getEnergy());

		mimi.eat("vegetable");
		System.out.println("mimi's energy after food 1: " + mimi.getEnergy());

		mimi.eat("meat");
		System.out.println("mimi' energy after food 2: " + mimi.getEnergy());

		mimi.eat("Meat");
		System.out.println(mimi.getEnergy());

	}
}
