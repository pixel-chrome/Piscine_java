import java.util.List;

public class Factory{
	public Toy create(String toy) throws NoSuchToy{
		if(toy.equals("teddy")){
			return(new TeddyBear("teddy"));
		}
		else if(toy.equals("gameboy")){
			return(new Gameboy("gameboy"));
		}
		else{
			throw new NoSuchToyException("No such toy: " + toy + ".");
		}
	}

	public List<GiftPaper> getPapers(int n){
		List<GiftPaper> listGiftPaper = new List<>();
		for(int i = 0; i<n; i++){
			GiftPaper giftPaper = new GiftPaper();
			listGiftPaper.add(giftPaper);
		}
		return listGiftPaper;
	}

}	
