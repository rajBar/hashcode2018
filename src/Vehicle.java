import java.util.ArrayList;

public class Vehicle {

    private ArrayList<Integer> rides = new ArrayList<Integer>();
    private int currentX;
    private int currentY;
    private int finishTime;

    public Vehicle(){
        finishTime = 0;
        currentX = 0;
        currentY = 0;
    }

    public void addRide(int rideNumber){
        rides.add(rideNumber);
    }

    public void setFinishTime(int finishTime){
        this.finishTime = finishTime;
    }

    public void setCurrentPosition(int x, int y){
        currentX = x;
        currentY = y;
    }

    public int getCurrentX(){
        return currentX;
    }

    public int getCurrentY(){
        return currentY;
    }

}
