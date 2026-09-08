import java.util.ArrayList;
import java.util.List;

public class Battalion{
	ArrayList<Character> listeCharacters = new ArrayList<>();

	public void add(List<? extends Character> listGuy){
        	for(Character gus : listGuy){
            		listeCharacters.add(gus);
        	}
    	}

	public void display(){
		for(Character gus : listeCharacters){
	    		System.out.println(gus.getName());
		}
	}
		
}
