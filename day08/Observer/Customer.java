package Observer;

public class Customer implements Observer{
    public void update(Observable obs){
        if(obs instanceof Order){
            Order odr = (Order) obs;
            System.out.println("Position (" + odr.getPosition() + "), " + odr.getTimeBeforeArrival() + " minutes before arrival at " + odr.getDestination() + ".");
    
        }
    }
}
