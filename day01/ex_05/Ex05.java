import java.util.ArrayList;

public class Ex05{
	public static ArrayList<String> myGetArgs(String... var){
		ArrayList<String> listeuuu = new ArrayList<>();
		for(String v:var){
			listeuuu.add(v);
		}
		return(listeuuu);
	}
}
