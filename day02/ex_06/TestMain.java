public class TestMain{
	public static void main(String[] args){
		Gecko mimi = new Gecko("mimi");
		System.out.println("mimi's energy: "+ mimi.getEnergy());
		
		mimi.setEnergy(150);
		System.out.println("one: " + mimi.getEnergy());

		mimi.setEnergy(-10);
		System.out.println("two: " + mimi.getEnergy());

		mimi.eat("meat");
		System.out.println("after meat: " + mimi.getEnergy());

		mimi.eat("vegetable");
		System.out.println("after vegetable: "+ mimi.getEnergy());
	}
}
