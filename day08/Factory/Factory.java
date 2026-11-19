package Factory;
import java.util.List;
import java.util.ArrayList;

public class Factory{
	public Toy create(String toy) throws NoSuchToyException{
		if(toy.equals("teddy")){
			return(new TeddyBear());
		}
		else if(toy.equals("gameboy")){
			return(new Gameboy());
		}
		else{
			throw new NoSuchToyException("No such toy: " + toy + ".");
		}
	}

	public List<GiftPaper> getPapers(int n){
		List<GiftPaper> listGiftPaper = new ArrayList<>();
		for(int i = 0; i<n; i++){
			GiftPaper giftPaper = new GiftPaper();
			listGiftPaper.add(giftPaper);
		}
		return listGiftPaper;
	}

}	
