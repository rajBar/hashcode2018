/**
 * Created by Gulraj on 01/03/2018.
 */
public class Ride {
    public int StartX;
    public int StartY;
    public int EndX;
    public int EndY;
    public int StartTime;
    public int EndTime;
    public Status Status;
    public int Distance;
    public int TimeWindow;

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
