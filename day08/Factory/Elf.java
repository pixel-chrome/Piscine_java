package Factory;
import java.util.List;
import java.util.ArrayList;

public class Elf {
    protected Toy toy = null;
    protected List<GiftPaper> papers;
    protected Factory factory;

    public Elf(Factory factory){
        this.factory = factory;
        this.papers = factory.getPapers(0);
    }

    public boolean pickToy(String toyName){
	    if (toy != null) {
            System.out.println("Minute please?! I'm not that fast.");
            return false;
        }
        try {
            toy = factory.create(toyName);
            System.out.println("What a nice one! I would have liked to keep it...");
            return true;
        } catch (NoSuchToyException exception) {
            System.out.println("I didn't find any " + toyName + ".");
            return false;
        }
    }

    public boolean pickPapers(int n){
		papers.addAll(factory.getPapers(n));
	    return true;
    }

    public GiftPaper pack(){
    	if(papers.isEmpty()){
            System.out.println("Wait... I can't pack it with my shirt.");
            return null;
        }
        
        GiftPaper paper = papers.remove(0);
        if(toy != null ){
            paper.wrap(toy);
            System.out.println("And another kid will be happy!");
            toy = null;
        }
        else if(toy == null){
             System.out.println("I don't have any toy, but hey at least it's paper!");
        }
        return paper;
    }
}