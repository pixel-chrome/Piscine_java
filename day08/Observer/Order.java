package Observer;
import java.util.ArrayList;

public class Order implements Observable{
    protected String position;
    protected String destination;
    protected int timeBeforeArrival;
    protected ArrayList<Observer> observers = new ArrayList<>();


    public String getPosition(){
        return position;
    }

    public String getDestination(){
        return destination;
    }

    public int getTimeBeforeArrival(){
        return timeBeforeArrival;
    }

    public void setData(String setpos, String setdesti, int settime){
        this.position = setpos;
        this.destination = setdesti;
        this.timeBeforeArrival = settime;
	notifyObservers();
    }

    @Override
    public void addObserver(Observer obs){
	    this.observers.add(obs);
    }	

    @Override
    public boolean notifyObservers(){
	if(observers.isEmpty()){
		return false;
	}
	else{
		for(Observer observer : observers){
			observer.update(this);
		}
	}
	return true;
    }

}
