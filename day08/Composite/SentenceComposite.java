import java.util.List;

public class SentenceComposite implements Sentence{
    private List<Sentence> childSentence;

    @Override 
    public void print(){
        for(Sentence printWord : childSentence){
            printWord.print();
        }
    }

    public void add(Sentence p){
        childSentence.add(p);
    }

    public void remove(Sentence p){
        childSentence.remove(p);
    }
}