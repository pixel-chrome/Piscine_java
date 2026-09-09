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

	public boolean fight(){
		if(listeCharacters.size() >= 2){
			Character first = listeCharacters.get(0);
    		Character second = listeCharacters.get(1);
			if(first.compareTo(second)==1){
				listeCharacters.remove(second);
				return true;
			}
			else if(first.compareTo(second) == -1){
				listeCharacters.remove(first);
				return true;
			}
			else{
				listeCharacters.remove(first);
				listeCharacters.remove(second);
				return true;
			}
		}
		else{
			return false;
		}
	}
		
}
