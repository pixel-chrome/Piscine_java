package Observer;
import java.util.List;

public class Order implements Observable{
    protected String position;
    protected String destination;
    protected int timeBeforeArrival;
    protected List<Observer> observers;


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
    }

    @Override
    public boolean notifyObservers(){
        
    }

}
