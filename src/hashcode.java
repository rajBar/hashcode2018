import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;

public class hashcode {

    private static HashSet<Ride> rides = new HashSet<Ride>();
    private static Map map;
    private static ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
    private static int currentTime;


    public static void main(String[] args){
        readFile();
        int numberOfCars = map.Vehicles;
        for(int i = 0; i < numberOfCars; i++){
            vehicles.add( new Vehicle());
        }
        currentTime = 0;
        int bestWeight = 0;
        for(int i = 0; i < numberOfCars; i++){
            Vehicle vehicle = vehicles.get(i);
            Ride bestRide = null;
            for (Ride r : rides){
                int weight = r.getCalculateWeight(vehicle.getCurrentX(), vehicle.getCurrentY(), currentTime);
                if(bestWeight <= weight){
                    bestWeight = weight;
                    bestRide = r;
                }


            }
            int disToRide = vehicle.getCurrentX() - bestRide.getStartX();

            //if((currentTime + ) > bestRide.getStartTime()){
              //  vehicle
            //}
        }


    }

    public static void readFile() {
        // The name of the file to open.
        String fileName = "pdfs/a_example.in";
        //String fileName = "pdfs/b_should_be_easy.in";
        //HashSet<Ride> rides = new HashSet<Ride>();
        ArrayList<Ride> rides = new ArrayList<Ride>();



        // This will reference one line at a time
        String line = null;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader =
                    new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader =
                    new BufferedReader(fileReader);

            line = bufferedReader.readLine();
            String [] params = null;

            if(line!=null){
                params = line.split(" ");
                map = new Map(Integer.parseInt(params[0]), Integer.parseInt(params[1]), Integer.parseInt(params[2]), Integer.parseInt(params[3]), Integer.parseInt(params[4]), Integer.parseInt(params[5]));
                map.print();
            }

            Ride ride = null;
            int i = 0;
            while((line = bufferedReader.readLine()) != null) {
                params = line.split(" ");
                ride = new Ride(Integer.parseInt(params[0]), Integer.parseInt(params[1]), Integer.parseInt(params[2]), Integer.parseInt(params[3]), Integer.parseInt(params[4]), Integer.parseInt(params[5]), i);
                rides.add(ride);
                i++;
            }

            // Always close files.
            bufferedReader.close();

            for (Ride r : rides) {
                r.print();
            }


        }
        catch(FileNotFoundException ex) {
            System.out.println(
                    "Unable to open file '" +
                            fileName + "'");
        }
        catch(IOException ex) {
            System.out.println(
                    "Error reading file '"
                            + fileName + "'");
            // Or we could just do this:
            // ex.printStackTrace();
        }
    }

}

