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

    public Ride(int startX, int startY, int endX, int endY, int startTime, int endTime){
        this.StartX = startX;
        this.StartY = startY;
        this.EndX = endX;
        this.EndY = endY;
        this.StartTime = startTime;
        this.EndTime = endTime;
        this.Status = Status.NotStarted;
        this.Distance = Math.abs((endX - startX) + (endY - startY));
        this.TimeWindow = endTime - startTime;

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
}
