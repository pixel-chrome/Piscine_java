package planet.moon;

public class Phobos{
	private planet.Mars mars;
	private String landingSite;

	public Phobos(planet.Mars planette, String landingSite){
		if(planette != null){
			System.out.println("Phobos placed in orbit.");
			this.mars = planette;
		}
		else{
			System.out.println("No planet given.");
		}
		this.landingSite = landingSite;
	}

	public String getLandingSite(){
		return(landingSite);
	}
}
		
