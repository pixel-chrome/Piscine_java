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
		blanc.eat(titi);
		blanc.eat(willy);
		blanc.eat(blanc);

		bleu.eat(titi);
		bleu.eat(willy);
		bleu.eat(bleu);

	}
}
