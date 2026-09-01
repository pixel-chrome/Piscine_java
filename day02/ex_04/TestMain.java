public class TestMain{
	public static void main(String[] args){
		Gecko arthur = new Gecko("Arthur",0);
		Gecko benjy = new Gecko();
		Gecko ken = new Gecko("Ken",5);

		

		System.out.println(arthur.getName());
		System.out.println(benjy.getName());
		System.out.println(" ");

		arthur.status();
		ken.status();
	}
}
