/**
 * Created by Gulraj on 01/03/2018.
 */
public class Map {

    public int Row;
    public int Column;
    public int Vehicles;
    public int Rides;
    public int Bonus;
    public int Steps;


    public Map(int Row, int Column, int Vehicles, int Rides, int Bonus, int Steps){
        this.Row = Row;
        this.Column = Column;
        this.Vehicles = Vehicles;
        this.Rides = Rides;
        this.Bonus = Bonus;
        this.Steps = Steps;
    }

    public int getRow() {
        return Row;
    }

    public int getColumn() {
        return Column;
    }

    public int getVehicles() {
        return Vehicles;
    }

    public int getRides() {
        return Rides;
    }

    public int getBonus() {
        return Bonus;
    }

    public int getSteps() {
        return Steps;
    }
}
