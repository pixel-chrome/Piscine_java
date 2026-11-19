package planet;

public class Mars{
	private int id;
	private static int nextId = 0;
	private String landingSite;

	public Mars(String landingSite){
		this.id = nextId++;
		this.landingSite = landingSite;
	}

	public int getId(){
		return(id);
	}

	public String getLandingSite(){
		return(landingSite);
	}
}
