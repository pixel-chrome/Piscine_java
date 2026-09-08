import java.util.ArrayList;
import java.util.List;

public class Battalion extends Character{
    ArrayList<Character> listeCharacters = new ArrayList<>();

    public void add(List<Character> listGuy){
        for(Character gus : listGuy){
            listeCharacters.add(gus);
        }
    }
}
