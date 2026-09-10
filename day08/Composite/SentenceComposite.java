package Composite;
import java.util.ArrayList;

public class SentenceComposite implements Sentence{
    protected ArrayList<Sentence> childSentence = new ArrayList<>();

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
