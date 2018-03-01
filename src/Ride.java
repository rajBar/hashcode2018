/**
 * Created by Gulraj on 01/03/2018.
 */
public class Ride {
    private int StartX;
    private int StartY;
    private int EndX;
    private int EndY;
    private int StartTime;
    private int EndTime;
    private Status Status;
    private int Distance;
    private int TimeWindow;
    private int weight;
    private int rideNumber;

    public Ride(int startX, int startY, int endX, int endY, int startTime, int endTime, int rideNumber){
        this.StartX = startX;
        this.StartY = startY;
        this.EndX = endX;
        this.EndY = endY;
        this.StartTime = startTime;
        this.EndTime = endTime;
        this.Status = Status.NotStarted;
        this.Distance = Math.abs((endX - startX) + (endY - startY));
        this.TimeWindow = endTime - startTime;
        this.weight = (startX + startY) + (0 - startTime) + (0 - endTime) + (0-getDistance());
        this.rideNumber = rideNumber;

    }

    public void setStatus(Status status) {
        Status = status;
    }

    public void setDistance(int distance) {
        Distance = distance;
    }

    public void setTimeWindow(int timeWindow) {
        TimeWindow = timeWindow;
    }

    public int getStartX() {

        return StartX;
    }

    public int getStartY() {
        return StartY;
    }

    public int getEndX() {
        return EndX;
    }

    public int getEndY() {
        return EndY;
    }

    public int getStartTime() {
        return StartTime;
    }

    public int getEndTime() {
        return EndTime;
    }

    public Status getStatus() {
        return Status;
    }

    public int getDistance() {
        return Distance;
    }

    public int getTimeWindow() {
        return TimeWindow;
    }

    public int getWeight() {return weight;}

    public void print(){
        System.out.println(getStartX() + " " + getStartY() + " " + getEndX() + " " + getEndY() + " " + StartTime + " " + EndTime + " weight: " +  getWeight());

    }
    public void setWeight(int weight){

    }

    public int getCalculateWeight(int currentX, int currentY, int currentTime){
        return (Math.abs((getStartX() - currentX) + (getStartY() - currentY))) + (currentTime - getStartTime()) + (currentTime - getEndTime()) + (0-getDistance());
    }
}
