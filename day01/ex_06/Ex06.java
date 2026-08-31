import java.util.ArrayList;

public class Ex06{
	public static void sequence(int nbr){
		int temp = 1;
		ArrayList<int> listeRes = new ArrayList<>();
		for(int i=0; i<nbr; i++){
			temp = temp % 10;	
			listeRes.add(temp);
		}
		System.out.println(listeRes);
	}
}
