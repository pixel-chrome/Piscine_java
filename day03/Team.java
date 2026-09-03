import java.util.ArrayList;

class Team{
	private String name;
	public ArrayList<Astronaut> teamAst = new ArrayList<>();

	public Team(String name){
		this.name = name;
	}

	public String getName(){
		return(name);
	}

	public void add(Astronaut personne){
		teamAst.add(personne);
	}

	public void remove(Astronaut personne){
		teamAst.remove(personne);
	}

	public int countMembers(){
		return(teamAst.size());
	}

	public void showMembers(){
		if(teamAst.size() > 0){
			System.out.print(name + ": ");
			for(int i = 0; i<teamAst.size(); i++){
				if(teamAst.get(i).getDestination() != null){
					System.out.print(teamAst.get(i).getName() + " on mission");
				}
				else {
					System.out.print(teamAst.get(i).getName() + " on standby");
				}

				if(i==teamAst.size()-1){
					System.out.println(".");
				}
				else {
					System.out.print(", ");
				}
			}
		}
	}

	public void doActions(){
		System.out.println(name + ": Nothing to do.");
	}

	public void doActions(chocolate.Mars barre){
		for(int i = 0; i<teamAst.size(); i++){
			Astronaut personne = teamAst.get(i);
			personne.doActions(barre);
		}
	}

	public void doActions(planet.Mars planette){
		for(int i = 0; i<teamAst.size(); i++){
			Astronaut personne = teamAst.get(i);
			personne.doActions(planette);
		}
	}

	public void doActions(planet.moon.Phobos phobos){
		for(int i = 0; i<teamAst.size(); i++){
			Astronaut personne = teamAst.get(i);
			personne.doActions(phobos);
		}
	}
}

		
