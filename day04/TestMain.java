class TestMain{
	public static void main(String[] args){
		Canary titi = new Canary("Titi");
		Shark willy = new Shark("Willy");
		willy.status();
		willy.smellBlood(true);
		willy.status();
		titi.layEgg();
		System.out.println(titi.getEggsCount());
		System.out.println("============");

		willy.eat(willy);
		willy.eat(titi);
		willy.status();

		System.out.println("============");
		GreatWhite blanc = new GreatWhite("Blanc");
		BlueShark bleu = new BlueShark("Bleu");
		System.out.println("titi,willy,bleu");
		blanc.eat(titi);
		blanc.eat(willy);
		blanc.eat(blanc);
		System.out.println("____________");
		
		System.out.println("titi,willy,bleu");
		bleu.eat(titi);
		bleu.eat(willy);
		bleu.eat(bleu);
		System.out.println("____________");

	}
}
