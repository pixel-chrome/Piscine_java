import java.util.ArrayList;

public class Ex06{
	public static void sequence(int nbr){
		String ligne = "1";
		if(nbr==0){
			System.out.println("1");
		}
		if(nbr>0){
			System.out.println("1");
			for (int i=0; i<nbr; i++){
				char present = '1';
				String finale = "";
				int compteur = 1;
				for (int character = 0; character < ligne.length(); character ++){
					char c = ligne.charAt(character);
					if (character < ligne.length() - 1){
						if (c == ligne.charAt(character + 1)){
							compteur ++;
						}
						else{
							finale = finale + compteur + c;
							compteur = 1;
						}
					}
					else {
						finale = finale + compteur + c;
					}
				}
				System.out.println(finale);
				ligne = finale;
			}
		}
	}
}
